
/* global request, response */

var v=true;
$("span.help-block").hide();


function eliminar(){
    alert("Los datos fueron eliminados")
}
function verificar(){

            var v1=0,v2=0,v3=0,v4=0,v5=0,v6=0,v7=0,v8=0;
            v1=validacion('user');
            v2=validacion('pass');
            v3=validacion('nomre');
            v4=validacion('apepatre');
            v5=validacion('apematre');
            v6=validacion('fecnacre');
            v7=validacion('emailre');
            v8=validacion('passre');
            
           
            
            if (v1===false || v2===false || v3===false || v4===false || v5===false || v6===false || v7===false || v8===false) {
                 $("#exito").hide();
                 $("#error").show();
                 alert("Los datos ingresados no son los correctos, vuelve a intentarlo");
                 
            }else{
                $("#error").hide();
                $("#exito").show();
                alert("Los datos fueron ingresados correctamente");
                
                
            }
            /*total=v1+v2+v3+v4+v5+v6;
            if (v && total>=6) {
                $("#error").hide();
                $("#exito").show();
            }else{
                 $("#exito").hide();
                 $("#error").show();
            }
            
            
            validacion('nombres');
            validacion('dni');
            validacion('email');
            validacion('genderRadios');
            validacion('carrera');
            if (v) {
                alert("los campos estan validados")
            }
            else{
                alert("los campos no estan validados");
            }*/

}

function validacion(campo){
            var a=0;
            
            if (campo==='user')
            {
                user = document.getElementById(campo).value;
                if( user === null || user.length === 0 || /^\s+$/.test(user) ) {
                    $("#glypcn"+campo).remove();
                    $('#'+campo).parent().attr("class", "form-group has-error has-feedback");
                    $('#'+campo).parent().children('span').text("Ingrese su usuario").show();
                    $('#'+campo).append("<span id='glypcn"+campo+"' class='glyphicon glyphicon-remove form-control'></span>");
                    return false;
                   
                }
                else
                {
                    if(isNaN(user)) {

                        $("#glypcn"+campo).remove();
                        $('#'+campo).parent().attr("class", "form-group has-error has-feedback");
                        $('#'+campo).parent().children('span').text("Debe ingresar su email").show();
                        $('#'+campo).parent().append("<span id='glypcn"+campo+"' class='glyphicon glyphicon-remove form-control-feedback'></span>");

              
                        return false;
                    }
                    else{

                        $("#glypcn"+campo).remove();
                        $('#'+campo).parent().attr("class", "form-group has-success has-feedback");
                        $('#'+campo).parent().children('span').hide();
                        $('#'+campo).parent().append("<span id='glypcn"+campo+"' class='glyphicon glyphicon-ok form-control-feedback'></span>");
             
                        return true;
                    }
                    
                    
                }
                
            }
            if (campo==='pass'){
                pass = document.getElementById(campo).value;
                if( pass === null || pass.length === 0 || /^\s+$/.test(pass) ) {
                    
                    $("#glypcn"+campo).remove();
                    $('#'+campo).parent().attr("class", "form-group has-error has-feedback");
                    $('#'+campo).parent().children('span').text("Ingrese su contraseña ").show();
                    $('#'+campo).parent().append("<span id='glypcn"+campo+"' class='glyphicon glyphicon-remove form-control-feedback'></span>");
                    return false;
                    
                }
                else{
                    $("#glypcn"+campo).remove();
                    $('#'+campo).parent().attr("class", "form-group has-success has-feedback");
                    $('#'+campo).parent().children('span').hide();
                    $('#'+campo).parent().append("<span id='glypcn"+campo+"' class='glyphicon glyphicon-ok form-control-feedback'></span>");
                    return true;
                    
                } 
            }
            if (campo==='apepatAlu'){
                apepatAlu = document.getElementById(campo).value;
                if( apepatAlu === null || apepatAlu.length === 0 || /^\s+$/.test(apepatAlu) ) {
                    $("#glypcn"+campo).remove();
                    $('#'+campo).parent().attr("class", "form-group has-error has-feedback");
                    $('#'+campo).parent().children('span').text("Ingrese el apellido").show();
                    $('#'+campo).parent().append("<span id='glypcn"+campo+"' class='glyphicon glyphicon-remove form-control-feedback'></span>");
                    return false;
                    
                }
                
                   
                        
                        else{
                            $("#glypcn"+campo).remove();
                            $('#'+campo).parent().attr("class", "form-group has-success has-feedback");
                            $('#'+campo).parent().children('span').hide();
                            $('#'+campo).parent().append("<span id='glypcn"+campo+"' class='glyphicon glyphicon-ok form-control-feedback'></span>");
                    
                            return true;
                        }
                        
                    }  
                 
            
            if (campo==='apematAlu'){
                apematAlu = document.getElementById(campo).value;
                if( apematAlu === null || apematAlu.length === 0 || /^\s+$/.test(apematAlu) ) {
                    $("#glypcn"+campo).remove();
                    $('#'+campo).parent().attr("class", "form-group has-error has-feedback");
                    $('#'+campo).parent().children('span').text("Ingrese el apellido").show();
                    $('#'+campo).parent().append("<span id='glypcn"+campo+"' class='glyphicon glyphicon-remove form-control-feedback'></span>");
                        
                    return false;
                    
                }
                
                    else{
                        $("#glypcn"+campo).remove();
                        $('#'+campo).parent().attr("class", "form-group has-success has-feedback");
                        $('#'+campo).parent().children('span').hide();
                        $('#'+campo).parent().append("<span id='glypcn"+campo+"' class='glyphicon glyphicon-ok form-control-feedback'></span>");
                    
                        return true;
                    }
                }
                
                
              if (campo==='escuelaAlu'){
                escuelaAlu = document.getElementById(campo).value;
                if( escuelaAlu === null || escuelaAlu.length === 0 || /^\s+$/.test(escuelaAlu) ) {
                    $("#glypcn"+campo).remove();
                    $('#'+campo).parent().attr("class", "form-group has-error has-feedback");
                    $('#'+campo).parent().children('span').text("Ingrese la escuela").show();
                    $('#'+campo).parent().append("<span id='glypcn"+campo+"' class='glyphicon glyphicon-remove form-control-feedback'></span>");
                        
                    return false;
                    
                }
               
                
                    else{
                        $("#glypcn"+campo).remove();
                        $('#'+campo).parent().attr("class", "form-group has-success has-feedback");
                        $('#'+campo).parent().children('span').hide();
                        $('#'+campo).parent().append("<span id='glypcn"+campo+"' class='glyphicon glyphicon-ok form-control-feedback'></span>");
                    
                        return true;
                    }
                }
                
                
                
                
                if (campo==='datepicker1'){
                datepicker1 = document.getElementById(campo).value;
                if( datepicker1 === null ||     datepicker1.length === 0 || /^\s+$/.test(datepicker1) ) {
                    $("#glypcn"+campo).remove();
                    $('#'+campo).parent().attr("class", "form-group has-error has-feedback");
                    $('#'+campo).parent().children('span').text("Ingrese la fecha de nacimiento").show();
                    $('#'+campo).parent().append("<span id='glypcn"+campo+"' class='glyphicon glyphicon-remove form-control-feedback'></span>");
                        
                    return false;
                    
                }
                  else{
                        $("#glypcn"+campo).remove();
                        $('#'+campo).parent().attr("class", "form-group has-success has-feedback");
                        $('#'+campo).parent().children('span').hide();
                        $('#'+campo).parent().append("<span id='glypcn"+campo+"' class='glyphicon glyphicon-ok form-control-feedback'></span>");
                    
                        return true;
                    }
                }
                
                
                 if (campo==='datepicker2'){
                datepicker2 = document.getElementById(campo).value;
                if( datepicker2 === null || datepicker2.length === 0 || /^\s+$/.test(datepicker2)) {
                    $("#glypcn"+campo).remove();
                    $('#'+campo).parent().attr("class", "form-group has-error has-feedback");
                    $('#'+campo).parent().children('span').text("Ingrese la fecha de ingreso").show();
                    $('#'+campo).parent().append("<span id='glypcn"+campo+"' class='glyphicon glyphicon-remove form-control-feedback'></span>");
                        
                    return false;
                    
                }
                  else{
                        $("#glypcn"+campo).remove();
                        $('#'+campo).parent().attr("class", "form-group has-success has-feedback");
                        $('#'+campo).parent().children('span').hide();
                        $('#'+campo).parent().append("<span id='glypcn"+campo+"' class='glyphicon glyphicon-ok form-control-feedback'></span>");
                    
                        return true;
                    }
                }
                

            
            if (campo==='sexoAlu'){
                sexoAlu = document.getElementById(campo).selectedIndex;
                if( sexoAlu === null || sexoAlu === 0 ) {
                    $('#sexoAlu').parent().attr("class", "form-group has-error");
                    return false;
                }
                else{
                    $('#sexoAlu').parent().attr("class", "form-group has-success");
                    return true;

                }
            }
            
            
             if (campo==='emailAlu'){
                emailAlu = document.getElementById(campo).value;
                if( emailAlu === null || emailAlu.length === 0 || /^\s+$/.test(emailAlu) ) {
                    $("#glypcn"+campo).remove();
                    $('#'+campo).parent().attr("class", "form-group has-error has-feedback");
                    $('#'+campo).parent().children('span').text("Ingrese el email").show();
                    $('#'+campo).parent().append("<span id='glypcn"+campo+"' class='glyphicon glyphicon-remove form-control-feedback'></span>");
                        
                    return false;
                    
                }
                  else{
                        $("#glypcn"+campo).remove();
                        $('#'+campo).parent().attr("class", "form-group has-success has-feedback");
                        $('#'+campo).parent().children('span').hide();
                        $('#'+campo).parent().append("<span id='glypcn"+campo+"' class='glyphicon glyphicon-ok form-control-feedback'></span>");
                    
                        return true;
                    }
                }
                
                
                if (campo==='passAlu'){
                passAlu = document.getElementById(campo).value;
                if( passAlu === null || passAlu.length === 0 || /^\s+$/.test(passAlu) ) {
                    $("#glypcn"+campo).remove();
                    $('#'+campo).parent().attr("class", "form-group has-error has-feedback");
                    $('#'+campo).parent().children('span').text("Ingrese la contraseña").show();
                    $('#'+campo).parent().append("<span id='glypcn"+campo+"' class='glyphicon glyphicon-remove form-control-feedback'></span>");
                        
                    return false;
                    
                }
                  else{
                        $("#glypcn"+campo).remove();
                        $('#'+campo).parent().attr("class", "form-group has-success has-feedback");
                        $('#'+campo).parent().children('span').hide();
                        $('#'+campo).parent().append("<span id='glypcn"+campo+"' class='glyphicon glyphicon-ok form-control-feedback'></span>");
                    
                        return true;
                    }
                }
            
            
           
        }




