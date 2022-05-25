let board = ['','','','','','','','',''];
let win = false;
let jogadas=0;
let sybols = ['x','o'];
function turnos(position){
        board[position] = sybols[jogadas];
    if(jogadas = 0){
        jogadas++;

    }else{
        jogadas=0;
    }
}
