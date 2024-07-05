package alura.forohub.infra.errors;

public class ValidationIntegratyException extends RuntimeException{
    public ValidationIntegratyException(String message) {
        super(message);
    }
}
