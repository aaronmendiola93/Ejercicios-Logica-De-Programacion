//Se usa la funcion Math.random para generar un numero aleatorio entre el 1 y 100
//Se usa Math.floor para pasar a entero los decimales resultantes de usar Math.radom
let numSecreto = Math.floor(Math.random() * (100 - 1) + 1);
console.log(numSecreto);
let numUser = parseInt(prompt("Adivina el numero entre el 1 y el 100:"));

//Si el numero del usuario no es igual al numero secreo, entonces repetirá el bucle
while (numSecreto !== numUser){
if (numUser > numSecreto){
    alert("El numero es mas bajo");
    numUser = parseInt(prompt("Vuelve a intentarlo"));
}else {numUser < numSecreto
    alert("El numero es mas alto");
    numUser = parseInt(prompt("Vuelve a intentarlo"));
}

if(numSecreto === numUser){
    alert("Felicidades, adivinaste el número secreto" + " " + numSecreto);
}

}