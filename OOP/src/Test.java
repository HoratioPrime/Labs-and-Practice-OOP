import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) {
        // Задание 1
        /*
        Person person1 = new Person();
        Person person2 = new Person("Samokhin", "Oleg", "Romanovich");
        Person person3 = new Person("Samokhin", "-", "-");
        Person person4 = new Person("Samokhin");

        System.out.println(person1.getInitials());
        System.out.println(person2.getInitials());
        System.out.println(person3.getInitials());
        System.out.println(person4.getInitials());
         */
        // Задание 2
        /*
        Address addr = new Address();

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        addr.setToken(",.;-");
        addr.parseStringIntoAddr(str);

        System.out.println(addr);
         */
        // Задание 3
        /*
        String [] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";

        Shirt[] myShirts = new Shirt[11];

        for(int i = 0; i < 11; i++){
            myShirts[i] = new Shirt(shirts[i]);
        }

        for(int i = 0; i < 11; i++){
            System.out.println(myShirts[i]);
        }
         */
        // Задание 4

        String phoneNumber;
        Scanner scanner = new Scanner(System.in);
        phoneNumber = scanner.next();

        PhoneNumber phoneNumber1 = new PhoneNumber();
        System.out.println(phoneNumber1.parseNewFormat(new StringBuffer(phoneNumber)));


    }
}
