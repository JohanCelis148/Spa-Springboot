//Cargar de manera automatica los datos regostrados
// Busqueda por id
function findById(id) {
    $.ajax({
        url: 'http://localhost:9000/security/api/security/roles/' + id,
        method: "GET",
        headers: {
            "Content-Type": "application/json"
        }
    }).done(function (item) {
        $("#id").val(item.id)
        $("#code").val(item.code)
        $("#description").val(item.description)
        $("#status").val(item.status==true?'1':'0')      
    })
}

function loadTable() {
    $.ajax({
        url: 'http://localhost:9000/security/api/security/roles',
        method: "GET",
        headers: {
            "Content-Type": "application/json"
        }
    }).done(function (items) {
        var registros = "";
        items.forEach(function (item, index, array) {
            registros += `

                        <tr class="table-light">
                            <td>`+item.code+`</td>
                            <td>`+item.description+`</td>
                            <td>`+(item.status==true?'Activo':'Inactivo')+`</td>
                            <td><button class="btnEdit" type="button" onclick="findById(`+item.id+`);"><i class="fi fi-rr-pencil"></i></button></td>
                            <td><button class="btnDelete" type="button" onclick="deleteById(`+item.id+`);"><i class="fi fi-rr-trash"></i></button></td>
                        </tr>
                        `;
        })
        $("#dataResult").html(registros);   
    })
}

//Accion para eliminar un registro seleccionado 
function deleteById(id){
    $.ajax({
        url: 'http://localhost:9000/security/api/security/roles/' + id,
        method: "delete",
        headers: {
            "Content-Type": "application/json"
        }
    }).done(function (result) {
        loadTable();
    })
}


//Accion de adicionar un registro
function Add(){
    $.ajax({
        url: 'http://localhost:9000/security/api/security/roles',
        data: JSON.stringify({
            code: $("#code").val(),
            description: $("#description").val(),
            status: parseInt($("#status").val()),
            userCreationId: 1,
            dateCreation: new Date()
        }),
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        }
    }).done(function (result) {
        //Cargar datos
        loadTable();

        //Limpiar formulario
        clearData();
    })
}


//Accion de actualizar un registro
function Update(){
    $.ajax({
        url: 'http://localhost:9000/security/api/security/roles/' + $("#id").val(),
        data: JSON.stringify({
            code: $("#code").val(),
            description: $("#description").val(),
            status: parseInt($("#status").val()),
            userCreationId: 1,
            dateCreation: new Date(),
            userModificationId: 1,
            dateModification: new Date()
        }),
        method: "PUT",
        headers: {
            "Content-Type": "application/json"
        }
    }).done(function (result) {
        //Cargar datos
        loadTable();

        //Limpiar formulario
        clearData();
    })
}

// Función para limpiar datos
function clearData(){
    $("#id").val(""),
    $("#code").val(""),
    $("#description").val(""),
    $("#status").val("")
}