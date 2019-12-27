import java.util.Scanner;

public class Exception1 {
    // Задание 1
    /*
    public  void exceptionDemo(){
        System.out.println(2./0.); // Infinity
    }
    */
    /*
    public  void exceptionDemo(){
        System.out.println(2/0); // java.lang.ArithmeticException: / by zero
    }
    */
    /*
    public  void exceptionDemo(){
        try{
            System.out.println(2/0);
        } catch (ArithmeticException e)
        {
            System.out.println("Attemted division by zero");
        }
    }
    */

    // Задание 2
    /*
    * Qwerty - java.lang.NumberFormatException: For input string: "Qwerty"
    * 0 - java.lang.ArithmeticException: / by zero
    * 1.2 - java.lang.NumberFormatException: For input string: "1.2"
    * 1 - 2
    */
    /*
    public  void exceptionDemo(){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer");
        String intString = myScanner.next();
        int i = 0;
        try {
            i = Integer.parseInt(intString);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Wrong input format");
        }
        try {
            System.out.println(2 / i);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Attemted division by zero");
        }
    }
     */

    // Задание 3
    // Поймать да? а оно не ловится...
    /*
    public  void exceptionDemo(){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer");
        String intString = myScanner.next();
        int i = 0;
        try {
            i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (Exception e)
        {
            System.out.println("Hahahahhahhhaha.. oops");
        }
        catch (NumberFormatException e)
        {
            System.out.println("Wrong input format");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Attemted division by zero");
        }
    }
     */

    // Задание 4
    /*
    public  void exceptionDemo(){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer");
        String intString = myScanner.next();
        int i = 0;
        try {
            i = Integer.parseInt(intString);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Wrong input format");
        }
        try {
            System.out.println(2 / i);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Attemted division by zero");
        }
        finally {
            System.out.println("Как же долго писать System.out.println(), в C++ cout удобнее");
        }
    }
    */

    // Задание 5
    /*
    java.lang.NullPointerException: null key in getDetails
    */

    public static void main(String[] args) {
        // Задания 1-4
        /*
        Exception1 exception1 = new Exception1();
        exception1.exceptionDemo();
        */

        // Задание 5
        /*
        ThrowsDemo throwsDemo = new ThrowsDemo();
        throwsDemo.printMessage(null);
         */
        ThrowsDemo throwsDemo = new ThrowsDemo();

        throwsDemo.getKey();

    }
}
