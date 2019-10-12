public class Leg extends PartOfBody {
    private double distanceTraveled = 0.;

    public Leg(){
        super(1,5,10);
    }

    public Leg(double distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public Leg(double size, int energy, double power, double distanceTraveled) {
        super(size, energy, power);
        this.distanceTraveled = distanceTraveled;
    }

    @Override
    public void execute() {
        if(energy != 0)
        {
            distanceTraveled+= power/size;
            energy--;
        }else
        {
            System.out.println("Tired.. :(");
        }
    }
}
