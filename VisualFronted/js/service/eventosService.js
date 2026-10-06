import {eventosService} from ´../service/eventosService.js´

document.addEventListener 
(´DOMContentLoades´,())=>{
    list();
    const formulario = document.getElementById
    (´FormNuevoEvento´);
    if (formulario) {
        formulario.addEventListener(´submit´,guardar);
    }
});

async function list() {
    try{
        const respuesta = await eventosService.obtenerEventos();

        if (respuesta.status){
            dibujarTabla(respuesta.data);
        }
        else{
            mostrarMensaje (´danger´, respuesta.message);
        }
    } catch (error){
        mostrarMensaje (´danger´, ´Error al conectar la API´);
    }
}

function dibujarTabla (list){
    const tbody = document.getElementById(´tbodyEventos´);
    tbody.innerhtml=";
    
    if(list.length ===0){
        tbody.innerhtml = <tr><td colspan="9"
        class = "text-center"> No hay eventos registrados </td> </tr>;
        return
    }
    list.forEach(item=>{
        const fila = document createElment (´tr´);
        fila.innerhtml = <td> ${item.idEvento} </td>
        <td> <strong> $
            {item.nombreEventos} </strong> <Ad>
                <td> ${item.cliente.nombre}$
                    {item.cliente.apellido})
}