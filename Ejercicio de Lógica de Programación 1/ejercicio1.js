// -- Paso 1, pedirle al usuario 3 números y guardarlos en sus respectivas variables
let num1 = parseInt(prompt("Por favor escribe el primer número"));
let num2 = parseInt(prompt("Por favor escribe el segundo número"));
let num3 = parseInt(prompt("Por favor escribe el tercer número"));

let numMayor;
let numCentro;
let numMenor;

// identificar cual es el numero mayor
if (num1 >= num2 && num1 >= num3){
    numMayor=num1;
    // Identificar el numero del centro y menor
    if(num2 >= num3){
        numCentro=num2;
        numMenor=num3;
    } else {
        numCentro=num3;
        numMenor=num2;
    } 
 // identificar cual es el numero mayor
}else if(num2 >= num1 && num2 >= num3){
    numMayor=num2;
    // Identificar el numero del centro y menor
    if (num1 >= num3){
        numCentro=num1;
        numMenor=num3;
    }else{
        numCentro=num3;
        numMenor=num1;
    }
// identificar cual es el numero mayor
}else {
    numMayor=num3;
    // Identificar el numero del centro y menor
    if(num1 >= num2){
        numCentro = num1;
        numMenor = num2;
    }else{
        numCentro=num2;
        numMenor=num1;
    }
}

// Identificar si los números son iguales
if (num1 === num2 && num2 === num3) {
     alert("Los números son iguales");
}

// document.write(`Los numeros de MAYOR a MENOR son: ${numMayor}, ${numCentro} y ${numMenor} <br>`);
// document.write(`Los numeros de MENOR a MAYOR son: ${numMenor}, ${numCentro} y ${numMayor}`);

let txtMayorMenor = document.querySelector("#mayorMenor");
txtMayorMenor.innerHTML=(`Los numeros de MAYOR a MENOR son: ${numMayor}, ${numCentro} y ${numMenor}`);

let txtMenorMayor = document.querySelector("#menorMayor");
txtMenorMayor.innerHTML=(`Los numeros de MENOR a MAYOR son: ${numMenor}, ${numCentro} y ${numMayor}`);
