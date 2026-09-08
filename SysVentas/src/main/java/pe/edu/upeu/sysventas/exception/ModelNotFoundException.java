package pe.edu.upeu.sysventas.exception;

import pe.edu.upeu.sysventas.model.Proveedor;

public class ModelNotFoundException extends RuntimeException {
    public ModelNotFoundException(String message) {
        super(message);
    }
}
