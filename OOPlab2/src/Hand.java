public class Hand extends PartOfBody {
    private int motility = 0;
    public Hand() {
        super(4, 6, 8);
    }

    public Hand(int intelligence) {
        this.motility = intelligence;
    }

    public Hand(double size, int energy, double power, int intelligence) {
        super(size, energy, power);
        this.motility = intelligence;
    }

    @Override
    public void execute() {
        if(energy != 0)
        {
            motility += power/size;
            energy--;
        }else
        {
            System.out.println("Tired.. :(");
        }
    }
}
