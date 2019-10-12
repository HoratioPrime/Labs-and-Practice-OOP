abstract public class Dish {
    private String material = "none";
    private double size = 0.;
    private String picture = "none";

    public Dish(){}

    public Dish(String material, double size, String picture) {
        this.material = material;
        this.size = size;
        this.picture = picture;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
