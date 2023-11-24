


function completeChange(taskId) {
    console.log(taskId);
    var tiempoElement = document.getElementById('tiempo' + taskId);
    var tareaElement = document.getElementById('tarea' + taskId);

    // Agregar la clase para tachar
    tiempoElement.classList.toggle('tachar');
    tareaElement.classList.toggle('tachar');
}