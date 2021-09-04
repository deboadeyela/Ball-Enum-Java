public enum Ball {
    BASEBALL(149, 73),
    BASKETBALL(624, 239),
    FOOTBALL(450 , 216),
    GOLF(46, 43),
    POOL(156, 60),
    SOFTBALL(180, 97),
    TENNIS(59, 64),
    VOLLEYBALL(260, 218);

    double weight;
    double diameter;

    //constructor
    private Ball(double weight, double diameter){
        this.weight = weight;
        this.diameter = diameter;
    }

    //gets the circumference of the ball
    public double getCircumference(){
        return Math.PI*diameter;
    }

    //gets the volume of the ball
    public double getVolume(){
        double radius = diameter/2;
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }

    //string representation of Ball
    public String toString(){
        return this.name() + "\t" + (int)weight + " g " + (int)diameter + " mm";
    }

}
