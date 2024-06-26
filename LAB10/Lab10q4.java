class errorMsgException extends Exception{
    public String toString(){
        return "Error message";
    }
}

public class Lab10q4 {

    public static void checkError() throws errorMsgException{
        throw new errorMsgException();
    }

    public static void main(String[] args) {
        try{
            checkError();
        }
        catch(errorMsgException e){
            System.out.println("Caught: "+e);
        }
    }
}