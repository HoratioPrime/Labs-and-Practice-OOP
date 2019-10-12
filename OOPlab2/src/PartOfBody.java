abstract class PartOfBody {
    protected double size = 0.;
    protected int energy = 0;
    protected double power = 0.;

    public PartOfBody(){}

    public PartOfBody(double size, int energy, double power) {
        this.size = size;
        this.energy = energy;
        this.power = power;
    }

    @Override
    public String toString() {
        return "PartOfBody{" +
                "size=" + size +
                ", energy=" + energy +
                ", power=" + power +
                '}';
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public abstract void execute();
}
