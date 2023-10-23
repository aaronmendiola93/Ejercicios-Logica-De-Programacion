//Validar el numero ingresado por el usuario
function validarNum(numero) {
    return !isNaN(numero) && isFinite(numero);
  }

  //Funcion si el numero es 0 o 1
  function obtenerSerie(n) {
    let serie = [];
    if (n > 0) {
      serie.push(0);
    }
    if (n > 1) {
      serie.push(1);
    }
// For para iterar segun el numero proporcionado por el usuario
    for (let i = 2; i < n; i++) {
        const numSig = serie[i - 1] + serie[i - 2];
        serie.push(numSig);
      }
    
      return serie;
    }
    
    function imprimirFibonacci() {
      let numero;
    
      do {
        const input = prompt('Ingresa un número para obtener la serie de Fibonacci:');
        numero = parseInt(input);
      } while (!validarNum(numero));
    
      const serieFibonacci = obtenerSerie(numero);
    
      console.log('Serie de Fibonacci:');
      console.log(serieFibonacci);
    }

   imprimirFibonacci;