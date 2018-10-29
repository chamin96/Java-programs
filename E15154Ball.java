class Ball{
    
    //public static global_time = 0; //global clock
    //private static num_of_balls = 0; //keep a record of num of balls

    double x;
    double y;
    double speed;
    double angleOfSpeedWithX;

    /*constructor*/ 
    Ball(double x, double y, double speed, double angleOfSpeedWithX){
        this.x=x;
        this.y=y;
        this.speed=speed;
        this.angleOfSpeedWithX=angleOfSpeedWithX;
    }

}

public class E15154Ball{
    public static void main(String[] args) {
        Ball b1 = new Ball(2, 4, 10, 15);
        System.out.println(b1.x);
        System.out.println(b1.angleOfSpeedWithX);
    }
}