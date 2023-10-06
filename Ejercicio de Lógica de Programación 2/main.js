// Debe solicitar al usuario la temperatura en grados Celsius por prompt o por un input.
// Debe convertir la temperatura ingresada de grados Celsius a grados Fahrenheit y Kelvin
// Debe imprimir ambos resultados por consola o por el DOM.
// Debe ser capaz de identificar si los datos de entrada sean de tipo number, en caso contrario debe mandar un mensaje de error y volver a solicitar los datos.


//Obtener datos del HTML
let gradesCelsius = document.getElementById('grades');
let botonConv = document.getElementById('botonConv');
let gradosFahrenheit = document.getElementById('gradosFahrenheit');
let gradosKelvin = document.getElementById('gradosKelvin');

botonConv.addEventListener("click", () => {

    let celsius = parseFloat(gradesCelsius.value);

    if (!isNaN(celsius)) {
        const fahrenheit = celsius *1.8 +32;
        const kelvin = celsius + 273.15;

        gradosFahrenheit.textContent = fahrenheit.toFixed(2) + "°F";
        gradosKelvin.textContent = kelvin.toFixed(2) + ' °K';
        errorText.textContent = '';
    } else {
        errorText.textContent = 'Ingrese un valor numérico.';
        gradosFahrenheit.textContent = '';
        gradosKelvin.textContent = '';

    }
    
});








