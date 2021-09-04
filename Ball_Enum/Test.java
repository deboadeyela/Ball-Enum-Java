//Test class to test Rational class and Ball enum
public class Test {

    public static void main(String args[]){
        for(Ball b : Ball.values()){
            //System.out.println( b.name() + "\t" +  b.weight + "g\t" + b.diameter + "mm");
            System.out.println(b);
        }

        System.out.println("The circumference of a golf ball = " + String.format("%.2f", Ball.GOLF.getCircumference()) + "mm");
        System.out.println("The volume of a baseball = " + String.format("%.2f", Ball.BASEBALL.getVolume()) + "mm^3");

        Rational r1 = new Rational((int)Ball.BASEBALL.weight, (int)Ball.BASKETBALL.weight);
        Rational r2 = new Rational((int)Ball.FOOTBALL.weight, (int)Ball.GOLF.weight);
        Rational r3 = new Rational((int)Ball.POOL.diameter, (int)Ball.SOFTBALL.diameter);
        Rational r4 = new Rational((int)Ball.TENNIS.diameter, (int)Ball.VOLLEYBALL.diameter);

        System.out.println();
        System.out.println("15/40 = " + new Rational(15,40));
        System.out.println("(149/624) + (450/46) = " + r1.plus(r2));
        System.out.println("(450/46) - (60/97) = " + r2.minus(r3));
        System.out.println("(60/97) * (64/218) = " + r3.multiply(r4));
        System.out.println("(64/218) / (149/624) = " + r4.divide(r1));
    }
}
