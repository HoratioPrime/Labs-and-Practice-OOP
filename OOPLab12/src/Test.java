import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        // Задачи №2
        /*
        String pattern = "^abcdefghijklmnopqrstuv18340$";
        Pattern r = Pattern.compile(pattern);
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        Matcher m = r.matcher(str);
        if(m.find()){
            System.out.println("Это нужная строка");
        }else{
            System.out.println("Это не та строка");
        }
         */

        // Задание по варианту
        String pUSD = "\\d+\\.(\\d+)\\sUSD";
        String pRUB = "\\d+\\.(\\d+)\\sRUB";
        String pEU = "\\d+\\.(\\d+)\\sEU";
        Pattern rUSD = Pattern.compile(pUSD);
        Pattern rRUB = Pattern.compile(pRUB);
        Pattern rEU = Pattern.compile(pEU);
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Matcher m = rUSD.matcher(str);
        while(m.find()){
            System.out.println(str.substring(m.start(), m.end()));
        }
        m = rRUB.matcher(str);
        while(m.find()){
            System.out.println(str.substring(m.start(), m.end()));
        }
        m = rEU.matcher(str);
        while(m.find()){
            System.out.println(str.substring(m.start(), m.end()));
        }
    }
}
