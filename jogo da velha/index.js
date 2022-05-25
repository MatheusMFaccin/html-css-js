

document.addEventListener('DOMContentLoaded',()=>{
    let squads = document.querySelectorAll(".squad");

    squads.forEach((squad)=>{
        squad.addEventListener('click', click)
    })
})

updatesquad(){
    let squads = document.querySelectorAll(".squad");

    squads.forEach((squad)=>{
        let position = squad.id;
        let symbol = board[position];
        if(symbol !=''){
            squad.innerHTML = `<div class='${$symbol}'></div>`
        }
    })
}

function click(event){
    let squad = event.target;
    let position = squad.id;
    turnos(position);
    updatesquad();
}