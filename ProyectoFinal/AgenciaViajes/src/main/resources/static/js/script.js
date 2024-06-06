const elem = document.getElementById('checkbox')
elem.onclick = isChecked;
function isChecked() {
	if (elem.checked) {
		window.location.replace("/hoteles/disponibles");
	} else{
		window.location.replace("/hoteles");
	}
}