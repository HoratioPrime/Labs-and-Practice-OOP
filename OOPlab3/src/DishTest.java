import java.util.ArrayList;
import java.util.Scanner;

public class DishTest {
    public static void main(String[] args) {
        ArrayList<Dish> dishes = new ArrayList<>();
        System.out.println("Введите посуду(1 - plate, 2 - pan, 3 - cup):\n");
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 5; i++)
        {
           switch (in.nextInt()) {
               case 1:
                   dishes.add(new Plate("ceramic", 4 ,"flower", "white"));
                   break;
               case 2:
                   dishes.add(new Pan("aluminum", 9, "none", 6));
                   break;
               case 3:
                   dishes.add(new Cup("glass", 2, "Risk of Rain 2", "matcha"));
                   break;

           }
        }
        for (var dish : dishes) {
            System.out.println(dish);
        }
    }
}
