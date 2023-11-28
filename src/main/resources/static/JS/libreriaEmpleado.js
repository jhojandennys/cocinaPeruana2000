// Desactivar todas las opciones
var arregloOpciones = document.getElementsByClassName("opMenu");
for (var i = 0; i < arregloOpciones.length; i++) {
    arregloOpciones[i].classList.remove("activado");
}

// Activar la opción de empleado
var opcionEmpleado = document.getElementById("opEmpleado");
opcionEmpleado.classList.add("activado");

document.querySelectorAll(".editarEmpleado").forEach(i => i.addEventListener(
    'click',
    e => {
        document.getElementById('txtId').value = i.dataset.id;
        document.getElementById('txtNombre').value = i.dataset.nombre;
        document.getElementById('txtCorreo').value = i.dataset.correo;
        document.getElementById('txtContraseña').value = ''; // Limpiar la contraseña por seguridad
        // Setear el rol seleccionado
        var rolSelect = document.getElementById('rolSelect');
        var selectedOption = i.dataset.rol;
        for (var j = 0; j < rolSelect.options.length; j++) {
            if (rolSelect.options[j].value === selectedOption) {
                rolSelect.options[j].selected = true;
                break;
            }
        }
        var myModal = new bootstrap.Modal(document.getElementById('modalEditar'));
        myModal.show();
    }
));

document.getElementById("registrarEmpleado").addEventListener("click", function () {
    // Limpiar el formulario de registro
    document.getElementById('modalRegistroForm').reset();

    // Abrir el modal de registro
    var registroModal = new bootstrap.Modal(document.getElementById('modalRegistroEmpleado'));
    registroModal.show();
});
