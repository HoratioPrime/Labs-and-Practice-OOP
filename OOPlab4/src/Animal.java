public class Animal implements Nameable {
    private String name = "none";

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
