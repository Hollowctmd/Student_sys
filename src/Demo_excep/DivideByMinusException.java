package Demo_excep;

class DivideByMinusException extends Exception {
    public DivideByMinusException(){
        super();
    }
    public DivideByMinusException(String message) {
        super(message);
    }
}
