package ProyectoFinal.eventosprestige.api.modules.clientes.service;

import ProyectoFinal.eventosprestige.api.response.ApiResponse;

public class ClientesServicio <T>{
    private boolean status;
    private String message;
    private T data;

    public ApiResponse(boolean status, String message){
        this.status= status;
        this.message= message;
    }

    public ApiResponse(boolean status,String message, T data){
        this.status= status;
        this.message= message;
        this.data=data;
    }
}
