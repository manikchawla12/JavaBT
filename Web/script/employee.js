function validate(){
    var id=document.getElementById('ID').value;
    var name=document.getElementById('name').value;
    var gender=document.getElementsByName('gender');

    if(id==''){
        document.getElementById('id_err').innerHTML='id is blank';
        return false;
    }
    else if(name==''){
        document.getElementById('name_err').innerHTML='name is blank';
        return false;
    }
    else
    return true;
}