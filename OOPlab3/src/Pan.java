public class Pan extends Dish {
    private double volume = 0.;

    public Pan() {
    }

    public Pan(double volume) {
        this.volume = volume;
    }

    public Pan(String material, double size, String picture, double volume) {
        super(material, size, picture);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Pan{" +
                "volume=" + volume +
                '}';
    }
}
