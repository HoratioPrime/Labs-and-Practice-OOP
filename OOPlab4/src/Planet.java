public class Planet implements Nameable {
    private String name = "none";

    public Planet() {
    }

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
