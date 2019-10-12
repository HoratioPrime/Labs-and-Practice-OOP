import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        Integer number = in.nextInt();
        System.out.println("Сумма цифр вашего числа: " + sumOfDigits(number));
        System.out.print("Простое ли выше число? - "); isSimple(number, number/2);
        System.out.println();
        System.out.println("Все множители этого числа:");
        Integer curMult = 2;
       try{
            allMultip(number, curMult);
        }
        catch (Exception e)
        {}
       //allMultipV2(number);

        System.out.println();
        System.out.println("Введите слово:");
        in.nextLine();
        String word = in.nextLine();
        System.out.print("Палиндром ли оно? - ");
        isPalindrom(word);

    }

    public static int sumOfDigits(int n)
    {
        if(n < 10)
        {
            return n;
        }else
        {
            return n % 10 + sumOfDigits(n/10);
        }
    }

    public static void isSimple(int n, int div)
    {
        if(n == 1){
            System.out.println("YES");
            return;
        }
        if(div == 1){
            System.out.println("YES");
            return;
        }
        if((n % div) == 0)
        {
            System.out.println("NO");
            return;
        }

        isSimple(n, div - 1);
    }

    public static void allMultip(Integer number, Integer curMult) throws Exception
    {
        if(number % curMult == 0) {
            while(number % curMult == 0) {
                System.out.print(" " + curMult);
                number /= curMult;
            }
           allMultip(number, ++curMult);
        }
        if(curMult > number/2)
        {
            if(number != 1) {
                System.out.print(" " + number);
            }
            //throw(new Exception());
            return;
        }
        allMultip(number, ++curMult);
    }

    public static void allMultipV2(Integer number){
        Integer a = 2;
        while(a <= number){
            if((number % a) == 0){
                if(a != number){
                    System.out.print(a + " ");
                    allMultipV2(number/a);
                }else{
                    System.out.println(a);
                }
                return;
            }
            a++;
        }

    }

    public  static void isPalindrom(String word)
    {
       if(word.length() == 1 || word.length() == 0) {
           System.out.println("YES");
           return;
       }
       if(word.toCharArray()[0] == word.toCharArray()[word.length()-1])
       {
           isPalindrom(word.substring(1, word.length() - 1));
       }else
       {
           System.out.println("NO");
       }
    }


}
