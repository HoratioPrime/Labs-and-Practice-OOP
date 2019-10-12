public class Plate extends Dish {
    private String color = "white";

    public Plate() {
    }

    public Plate(String color) {
        this.color = color;
    }

    public Plate(String material, double size, String picture, String color) {
        super(material, size, picture);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "color='" + color + '\'' +
                '}';
    }
}
