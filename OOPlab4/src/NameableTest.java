public class NameableTest {
    public static void main(String[] args) {
        Nameable [] nameables = { new Car("Ferrari"), new Planet("Earth"), new Animal("RTUstudent")};

        for (var nameable: nameables) {
            System.out.println(nameable.getName());
        }

    }
}
