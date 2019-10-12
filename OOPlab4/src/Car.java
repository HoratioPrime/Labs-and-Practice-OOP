public class Car implements Nameable {
    private String name = "none";
    // other


    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.getClass().getName();
    }
}
