let tela = document.getElementById("tela");
let ctx = tela.getContext("2d");
let botaoesquerdo= document.getElementById("btnesquerdo");
let botaodireito = document.getElementById("btndireito");
let stops=0
let angle =0

let square={
     
     a: 100,
     b: 100,
     c: 100,
     d: 100,
      
}

function drawsquare(s){
    ctx.beginPath();
    ctx.rect(0,0,600,600);
    ctx.fillStyle = "beige";
    ctx.fill();
    


    ctx.beginPath();
    ctx.strokeStyle = "red";
    ctx.strokeRect(s.a,s.b,s.c,s.d);
}

teste = setInterval(function(){
    let a = 200
    if(square.a<a ){
        square.a+=1;
    }
    if(square.b<a || square.a==a){
        square.b+=1;
    }    
    if(square.c<a || square.b==a){
        square.c+=1;
    }
    if(square.d<a|| square.c==a){
        square.d++;
    }
    
    stops++
    if(stops==80){
        clearInterval(teste);
        }    
              
    drawsquare(square);
},100);



