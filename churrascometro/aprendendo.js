let na = document.getElementById("adult");
    let nc = document.getElementById("children");
    let t = document.getElementById("time");
function calcular(){
    
    let adult = na.value;
    let children = nc.value;
    let time = t.value;
    console.log(adult);
    let kg = Math.floor((3*adult) + (2*children) + Math.floor(0,5*time));
    let b = 3*adult;
    let s = 3*children;
    
    let food = "quantidade em kilos de comida é : "+kg;
    let beer = "numero de latas de cerveja: " + b;
    let soda = "quantos litros de refri: "+ s; 
    document.querySelector("#food").innerHTML = food
    document.querySelector("#beer").innerHTML = beer
    document.querySelector("#soda").innerHTML = soda

}



