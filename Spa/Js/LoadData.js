function loadModulo(){
    $.ajax({
        url: 'http://localhost:9000/security/api/security/modules',
        method: "GET",
        headers: {
            "Content-Type": "application/json"
        }
    }).done(function(items){
        var registros = `<option selected="" selected disabled hidden>--- Seleccione ---</option>`;
        items.forEach(function(item, index, array){
            registros += `
                <option value="`+item.id+`">`+item.code+` - `+item.description+`</option>
            `;
        })
        $("#moduleId").html(registros);
    })
}