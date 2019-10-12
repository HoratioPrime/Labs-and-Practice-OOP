
public class TestHuman {
    public static void main(String[] args)
    {
        Human Denis = new Human();
        for (int i = 0; i < 10; i++) {
            for (var part : Denis.parts) {
                System.out.println(part);
                part.execute();
            }
        }
    }
}
