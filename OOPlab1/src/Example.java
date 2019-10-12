import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        System.out.println("Введите 5 целых чисел:");
        for (int i = 0; i < 5; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
        }
        System.out.println("Sum of array elements: " + sum);
    }
}
