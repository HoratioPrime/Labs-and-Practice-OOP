public class WrongINNException extends Exception {
    public void what(){
        System.out.println("Incorrect INN format!");
    }
}
