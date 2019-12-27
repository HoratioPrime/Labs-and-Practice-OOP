import java.io.IOException;
import java.util.Scanner;

public class ThrowsDemo {
    // Задание 5
    /*
    public void getDetails(String key){
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            // do smth with key
        }
        catch (NullPointerException e)
        {
            System.out.println("Поймал! в ThrowsDemo было..");
        }
    }
     */
    /*
    null - java.lang.NullPointerException: null key in getDetails
    Hi - data forHi
     */
    /*
    public void printMessage(String key){
        try {
            String message = getDetails(key);
            System.out.println(message);
        }
        catch (NullPointerException e)
        {
            System.out.println("Null pointer exception in getDetails(your key = null)");
        }
    }
    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for" + key;
    }
     */

    // Задание 6
    /*
    // Есть вопросы, по поводу "Добавьте блоки ТО,
    // чтобы в конечном итоге один из ни обрабатывал исключение

    public void getKey(){
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        try {
            printDetails(key);
        }
        catch (Exception e)
        {
            System.out.println("Java не справляетяся");
        }
    }
    public void printDetails(String key) throws Exception{
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception{
        if (key == "") {
            throw new Exception("Key set to empty string");
        }
        return "data fo" + key;
    }
     */

    // Задание 7 или это предыдущее было седьмым?
    // ничего непонятно, но очень интересно
    // Есть вопросы, по поводу "Добавьте блоки ТО,
    // чтобы в конечном итоге один из ни обрабатывал исключение

    // Задание 8 (надеюсь)
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter Key(q to quit) ");
            String key = myScanner.nextLine();
            if(key.equals("q")){
               break;
            }
            try {
                printDetails(key);
            } catch (Exception e) {
                System.out.println("Ввод некорректный, было выброшено исключение");
            }
        }
    }
    public void printDetails(String key) throws Exception{
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception{
        if (key == "") {
            throw new Exception("Key set to empty string");
        }
        return "data fo" + key;
    }

}
