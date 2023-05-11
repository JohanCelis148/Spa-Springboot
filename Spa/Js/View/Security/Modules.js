//Cargar de manera automatica los datos regostrados
// Busqueda por id
function findById(id) {
    $.ajax({
        url: 'http://localhost:9000/security/api/security/modules/' + id,
        method: "GET",
        headers: {
            "Content-Type": "application/json"
        }
    }).done(function (item) {
        $("#id").val(item.id)
        $("#tipoDocumento").val(item.tipoDocumento)
        $("#documento").val(item.documento)
        $("#nombreCompleto").val(item.nombreCompleto)
        $("#correo").val(item.correo)
        $("#telefono").val(item.telefono)
        $("#estado").val(item.estado==true?'1':'0')      
    })
}

function loadTable() {
    $.ajax({
        url: 'http://localhost:9000/security/api/security/modules',
        method: "GET",
        headers: {
            "Content-Type": "application/json"
        }
    }).done(function (items) {
        var registros = "";
        items.forEach(function (item, index, array) {
            registros += `

                        <tr class="table-light">
                            <td>`+item.id+`</td>
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
        url: 'http://localhost:9000/security/api/security/modules/' + id,
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
        url: 'http://localhost:9000/security/api/security/modules',
        data: JSON.stringify({
            tipoDocumento: $("#tipoDocumento").val(),
            documento: $("#documento").val(),
            nombreCompleto: $("#nombreCompleto").val(),
            correo: $("#correo").val(),
            telefono: $("#telefono").val(),
            estado: parseInt($("#estado").val())
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
        url: 'http://localhost:9000/security/api/security/modules/' + $("#id").val(),
        data: JSON.stringify({
            tipoDocumento: $("#tipoDocumento").val(),
            documento: $("#documento").val(),
            nombreCompleto: $("#nombreCompleto").val(),
            correo: $("#correo").val(),
            telefono: $("#telefono").val(),
            estado: parseInt($("#estado").val())
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
    $("#tipoDocumento").val(""),
    $("#documento").val(""),
    $("#nombreCompleto").val(""),
    $("#correo").val(""),
    $("#telefono").val(""),
    $("#estado").val("")
}