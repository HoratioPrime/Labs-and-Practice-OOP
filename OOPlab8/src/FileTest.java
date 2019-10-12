import java.util.Scanner;
import java.io.RandomAccessFile;

public class FileTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String FILE_PATH  = "C:\\Users\\Horatio\\IdeaProjects\\OOPlab8\\myFile.txt";
        try {
            RandomAccessFile myFile = new RandomAccessFile(FILE_PATH, "rw");
            String MENU = "Выберите что вы хотите сделать:\n" +
                    "1.Перезаписать файл\n" +
                    "2.Добавить текст в файл\n" +
                    "3.Показать содержимое файла\n" +
                    "4.Выход";
            System.out.println(MENU);

            int mode = in.nextInt();
            while(mode != 4) {
                switch (mode) {
                    case 1:
                        System.out.println("Введите текст для перезаписи файла:");
                        in.nextLine();
                        String wr = in.nextLine();
                        myFile.setLength(0);
                        myFile.writeChars(wr);
                        break;
                    case 2:
                        System.out.println("Введите текст добавления в файл:");
                        in.nextLine();
                        String app = in.nextLine();
                        myFile.seek(myFile.length());
                        myFile.writeChars(app);
                        break;
                    case 3:
                        System.out.println("Содержимое файла:");
                        int c;
                        myFile.seek(0);
                        while((c=myFile.read())!=-1){
                            System.out.print((char)c);
                        }
                        System.out.println();
                        break;
                }
                System.out.println(MENU);
                mode = in.nextInt();
            }
        }
        catch (Exception e){
            System.out.println("Ничего не работает!");
        }
    }
}
