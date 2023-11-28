// libreriaMenu.js

// Desactivar todas las opciones
const arregloOpciones = document.getElementsByClassName("opMenu");

for (let i = 0; i < arregloOpciones.length; i++) {
    arregloOpciones[i].classList.remove("activado");
}

// Activar la opción de menú
const opcion = document.getElementById("opMenu2"); // Asegúrate de tener el ID correcto
if (opcion) {
    opcion.classList.add("activado");
}

// Evento de clic para editar menú
document.querySelectorAll(".editarMenu").forEach(i => i.addEventListener(
    'click',
    e => {
        console.log("Clic en editarMenu:", i.dataset);
        document.getElementById('txtId').value = i.dataset.id;
        document.getElementById('txtNombre').value = i.dataset.nombre;
        document.getElementById('txtFecha').value = i.dataset.fecha;
        document.getElementById('txtPrecio').value = i.dataset.precio;
        var myModal = new bootstrap.Modal(document.getElementById('modalEditar'));
        myModal.show();
    }
));