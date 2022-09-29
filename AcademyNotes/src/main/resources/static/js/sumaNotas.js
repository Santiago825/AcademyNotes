



window.addEventListener("load",()=>{
    var nota1=parseInt(document.getElementById("nota1").innerText);
    var nota2=parseInt(document.getElementById("nota2").innerText);
    var nota3=parseInt(document.getElementById("nota3").innerText);
    var nota4=parseInt(document.getElementById("nota4").innerText);
    var promedio=document.getElementById("promedio");

    promedio.innerText=(nota1+nota2+nota3+nota4)/4;
})


