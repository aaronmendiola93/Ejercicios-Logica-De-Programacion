let num = parseInt(prompt("Ingresa un numero"));
function factorial(num) {
    if (num === 0 || num === 1)
      return 1;
    for (let i = num - 1; i >= 1; i--) {
      num = num * i;
    }
    return num; 
  }
  alert("El factorial de " +num +" es " + factorial(num));
  