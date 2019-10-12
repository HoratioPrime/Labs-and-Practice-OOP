public class Head extends PartOfBody{
    private int intelligence = 0;
    public Head() {
        super(5, 7, 9);
    }

    public Head(int intelligence) {
        this.intelligence = intelligence;
    }

    public Head(double size, int energy, double power, int intelligence) {
        super(size, energy, power);
        this.intelligence = intelligence;
    }

    @Override
    public void execute() {
        if(energy != 0)
        {
            intelligence += power;
            energy-= power/size;
        }else
        {
            System.out.println("Tired.. :(");
        }
    }
}
