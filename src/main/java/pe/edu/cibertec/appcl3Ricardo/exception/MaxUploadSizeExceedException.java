package pe.edu.cibertec.appcl3Ricardo.exception;

public class MaxUploadSizeExceedException extends RuntimeException {
    public MaxUploadSizeExceedException (String message){
        super(message);
    }
}
