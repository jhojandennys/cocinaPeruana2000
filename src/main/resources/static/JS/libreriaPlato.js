//desactivando todas las opciones
var arregloOpciones = document.getElementsByClassName("opMenu");
for(var i=0; i<arregloOpciones.length;i++){
    arregloOpciones[i].className = "nav-link opMenu";
}

//activar la opcion de plato
var opcion = document.getElementById("opPlato");
opcion.className += " activado";

document.querySelectorAll(".editarPlato").forEach(i => i.addEventListener(
    'click',
    e => {
        document.getElementById('txtId').value = i.dataset.id;
        document.getElementById('txtNombre').value = i.dataset.nombre;
        document.getElementById('txtDescripcion').value = i.dataset.descripcion;
        var myModal=new bootstrap.Modal(document.getElementById('modalEditar'))
        myModal.show();
    }
))

document.getElementById(".registrarPlato").addEventListener("click", function() {
    // Limpiar el formulario de registro
    document.getElementById('modalRegistroForm').reset();

    // Abrir el modal de registro
    var registroModal = new bootstrap.Modal(document.getElementById('modalRegistro'));
    registroModal.show();
})