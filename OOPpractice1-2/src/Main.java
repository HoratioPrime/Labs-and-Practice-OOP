import  java.lang.*;
public class  Main {
    public  static void main(String[] args)
    {
        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Helen", 7);
        Dog d3 = new Dog("Bob");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();

        Ball b1 = new Ball(6, "black");
        Ball b2 = new Ball(2, "blue");
        Ball b3 = new Ball("red");

        System.out.println(b1);

        b1.throwIntoBasket();
        b2.throwIntoBasket();
        b3.throwIntoBasket();

        Author a1 = new Author("Jack London", "jlondon@mail.eng", 'm');
        System.out.println(a1);
        System.out.println(a1.getName());
        a1.setEmail("london@gmail.com");
        System.out.println(a1.getEmail());
        System.out.println(a1.getGender());

        BallUml bu1 = new BallUml(10, 5);
        BallUml bu2 = new BallUml();
        bu2.setXY(54,32);
        bu1.setX(86);
        System.out.println(bu1);
        System.out.println(bu2);
        bu1.move(12, 34);
        bu2.move(234,25);
        System.out.println(bu1);
        System.out.println(bu2);
    }
}
