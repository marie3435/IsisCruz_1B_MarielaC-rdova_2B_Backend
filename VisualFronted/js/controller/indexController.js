import { "clientesService.js" } from "service";
import { "eventosService.js" } from "service";
import { "salonesService.js" } from "service";

const table, clientesService = document.getElementById("clientesService")
const table, eventosService = document.getElementById("eventosService")
const table, salonesService = document.getElementById("salonesService")

async function service (){
    try{
        const service = await Getservice()
        tablaService.innerhtml = ""
        service.forEach(service => {
            tablaService.innerhtml + = ""´
            td
            ´
        
            
        });
    }
}
