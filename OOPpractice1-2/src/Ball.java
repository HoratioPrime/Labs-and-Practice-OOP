public class Ball {

    private double size;
    private String color;

    public Ball() {
        size = 1;
        color = "white";
    }
    public Ball(String color) {
        this.color = color;
        size = 1;
    }
    public Ball(double size, String color) {
        this.size = size;
        this.color = color;
    }

    public void setSize(double size) {
        this.size = size;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public double getSize() {
        return size;
    }

    public String toString()
    {
        return color + " ball, size " + size;
    }

    public void throwIntoBasket()
    {
        if(size > 4)
            System.out.println(color + " ball does not fit in basket!" );
        else
            System.out.println(color + " ball in basket!");
    }


}
