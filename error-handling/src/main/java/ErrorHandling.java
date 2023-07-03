import java.io.IOException;
import java.util.Optional;

class ErrorHandling {

    void handleErrorByThrowingIllegalArgumentException() {
        throw new IllegalArgumentException();
    }

    void handleErrorByThrowingIllegalArgumentExceptionWithDetailMessage(String message) {
        throw new IllegalArgumentException(message);
    }

    void handleErrorByThrowingAnyCheckedException() throws IOException{
        throw new IOException();
    }

    void handleErrorByThrowingAnyCheckedExceptionWithDetailMessage(String message) throws IOException {
        throw new IOException(message);
    }

    void handleErrorByThrowingAnyUncheckedException() {
        try{

        }catch(NullPointerException e){

        }
    }

    void handleErrorByThrowingAnyUncheckedExceptionWithDetailMessage(String message) {
        try{

        }catch(NullPointerException e)
        {

        }
    }

    void handleErrorByThrowingCustomCheckedException() throws CustomCheckedException{

            throw new CustomCheckedException();

    }

    void handleErrorByThrowingCustomCheckedExceptionWithDetailMessage(String message) throws CustomCheckedException {
            throw new CustomCheckedException(message);

    }

    void handleErrorByThrowingCustomUncheckedException() {
        throw new CustomUncheckedException();
    }

    void handleErrorByThrowingCustomUncheckedExceptionWithDetailMessage(String message) {
        throw new CustomUncheckedException(message);
    }

    Optional<Integer> handleErrorByReturningOptionalInstance(String integer) {
        Optional<Integer> ans ;
        if(integer.equals("1"))
        {
            return Optional.of(Integer.valueOf(integer));
        }
        return Optional.empty();
    }

}
