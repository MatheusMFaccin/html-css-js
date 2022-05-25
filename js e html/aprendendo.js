let list = document.getElementById("list");
let listnum = parseInt(list.getAttribute("num"));

let cont = "";
for(let i=0; i<listnum;i++){
    cont+= "<li></li>";

}
list.innerHTML = cont;