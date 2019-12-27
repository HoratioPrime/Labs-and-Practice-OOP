import java.lang.invoke.WrongMethodTypeException;
import java.util.Scanner;

public class INN {
    private String name;
    private String inn;

    void setTransProp(String name, String inn){
        try{
            if(inn.length() != 12){
                throw new WrongINNException();
            }else
            {
                this.inn = inn;
                this.name = name;
            }
        }
        catch (WrongINNException e){
            e.what();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your inn: ");
        String inn = scanner.next();
        INN infoAboutCustomer = new INN();
        infoAboutCustomer.setTransProp(name, inn);
    }
}
