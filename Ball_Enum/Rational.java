//class to represent rational numbers
public class Rational {
    int numerator;
    int denominator;

    //constructor
    public Rational(int a, int b){
        numerator = a;
        denominator = b;
    }

    //multiply one rational number by another
    public Rational multiply(Rational other){
        int top = this.numerator * other.getNumerator();
        int bot = this.denominator * other.getDenominator();

        Rational result = new Rational(top, bot);
        result.simplify();
        return result;
    }

    //divide one rational number by another
    //this/other
    public Rational divide(Rational other){
        int top = this.numerator*other.getDenominator();
        int bot = this.denominator*other.getNumerator();
        Rational result = new Rational(top,bot);
        result.simplify();
        return result;
    }

    //Take away one rational number from another
    //this - other
    public Rational minus(Rational other){
        int top = this.numerator*other.getDenominator() - other.getNumerator()*this.denominator;
        int bot = this.denominator * other.getDenominator();
        Rational result = new Rational(top,bot);
        result.simplify();
        return result;
    }

    //add one rational number to another
    public Rational plus(Rational other){
        int top = this.numerator*other.getDenominator() + other.getNumerator()*this.denominator;
        int bot = this.denominator * other.getDenominator();

        Rational result = new Rational(top,bot);
        result.simplify();
        return result;
    }

    //method to get the greatest common divisor of two integers
    //used in simplify method
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }

    //reduces the rational number to its simplest form
    public void simplify(){
        int greatComMul= gcd(numerator,denominator);
        this.numerator = numerator/greatComMul;
        this.denominator = denominator/greatComMul;
    }


    //getters
    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    //string representation of Rational number
    public String toString(){
        this.simplify();
        double dec = (double)numerator / (double)denominator;

        return numerator + "/" + denominator + " = " + String.format("%.2f",dec);
    }
}
