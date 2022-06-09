
 
function hora(){
    const horario = new Date().toLocaleTimeString();
    var htmltemp = document.querySelector(".hora");
    htmltemp.innerHTML = horario;
}
setInterval('hora()',1000);


