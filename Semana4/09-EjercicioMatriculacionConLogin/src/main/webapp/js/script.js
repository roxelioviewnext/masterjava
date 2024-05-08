document.addEventListener("DOMContentLoaded", (event) => {
	const fecha = document.getElementById("fecha");
	const now = new Date();
	fecha.innerText = now.toLocaleDateString();
});


function mueveReloj() {
	const momentoActual = new Date();
	const hora = momentoActual.getHours();
	const minuto = momentoActual.getMinutes();
	const segundo = momentoActual.getSeconds();
	const horaImprimible = `${getTwoDigitNumber(hora)}:${getTwoDigitNumber(minuto)}:${getTwoDigitNumber(segundo)}`;
	document.getElementById("reloj").innerHTML = horaImprimible;
}

function getTwoDigitNumber(num) {
	return (num < 10 ? '0' : '') + num;
}

setInterval(mueveReloj, 1000);

