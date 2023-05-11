function Add(action) {
    var parametros = {              
        "user": $('#user').val(),
        "password": $('#password').val(),
        "persondID": $('#persondID').val(),
        "status": $('#status').val(),
        "action": action
    };

    $.ajax({
        data: parametros, //datos que se van a enviar al ajax
        url: '../../Controller/security/Users.php', //archivo php que recibe los datos
        type: 'post', //método para enviar los datos
        dataType: 'json', //Recibe el array desde php

        success: function(respuesta) { //procesa y devuelve la respuesta
            
            //Respueta adicionar
            if(respuesta['accion']=='Add'){
                alert(respuesta['respuesta']);
                Limpiar();                
            }           
        }
    });
}

function Update(action) {
    var parametros = {   
        "id": $('#id').val(),  
        "user": $('#user').val(),
        "password": $('#password').val(),
        "persondID": $('#persondID').val(),
        "status": $('#status').val(),
        "action": action
    };

    $.ajax({
        data: parametros, //datos que se van a enviar al ajax
        url: '../../Controller/security/Users.php', //archivo php que recibe los datos
        type: 'post', //método para enviar los datos
        dataType: 'json', //Recibe el array desde php

        success: function(respuesta) { //procesa y devuelve la respuesta
            
            //Respueta adicionar
            if(respuesta['accion']=='Add'){
                alert(respuesta['respuesta']);
                Limpiar();                
            }           
        }
    });
}

function Consult(action) {
    var parametros = {     
        "id": $('#id').val(),
        "user": $('#user').val(),
        "password": $('#password').val(),
        "persondID": $('#persondID').val(),
        "status": $('#status').val(),
        "action": action
    };

    $.ajax({
        data: parametros, //datos que se van a enviar al ajax
        url: '../../Controller/security/Users.php', //archivo php que recibe los datos
        type: 'post', //método para enviar los datos
        dataType: 'json', //Recibe el array desde php

        success: function(respuesta) { //procesa y devuelve la respuesta
            
            //Respueta adicionar
            if(respuesta['accion']=='Add'){
                alert(respuesta['respuesta']);
                Limpiar();                
            }           
        }
    });
}

function Limpiar(){
    $('#code').val("");
    $('#description').val("");
    $('#status').val("");    
}