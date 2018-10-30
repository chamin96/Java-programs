class Ball{
    
    public static double global_time = 0; //global clock
    protected static int num_of_balls = 0; //keep a record of num of balls

    double x;
    double y;
    double speed;
    double angleOfSpeedWithX;

    /*constructor*/ 
    Ball(double x, double y, double speed, double angleOfSpeedWithX){
        num_of_balls++; //increment num of balls

        this.x=x;
        this.y=y;
        this.speed=speed;
        this.angleOfSpeedWithX=angleOfSpeedWithX;
    }

    /*method to update time*/
    public static void updateTime(double time){
        global_time += time;
    }

}


public class E15154Ball{
    public static void main(String[] args) {
        Ball b1 = new Ball(2, 4, 10, 15);
        System.out.println(b1.x);
        System.out.println(b1.angleOfSpeedWithX);

        System.out.println(Ball.global_time);

        Ball.updateTime(20);

        Ball b2 = new Ball(3, 5, 40, 60);
        System.out.println(Ball.global_time);
        System.out.println(Ball.num_of_balls);
    }
}