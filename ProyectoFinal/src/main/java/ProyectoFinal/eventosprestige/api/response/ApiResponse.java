package ProyectoFinal.eventosprestige.api.response;

import java.security.PrivateKey;

public class ApiResponse <T>{
    private boolean success;
    private String message;
    private T data;

    // Constructor con datos[cite: 9]
    public ApiResponse(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    // Constructor sin datos[cite: 9]
    public ApiResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
        this.data = null;
    }

    public boolean isSuccess() { return success; }
    public String getMessage() { return message; }
    public T getData() { return data; }

}
