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

    /*method to check collision*/
    protected void willCollide(Ball b0){
        double angleOfSpeed_inRadians=Math.toRadians(angleOfSpeedWithX); //convert degrees to radians

        double speedX = Math.cos(angleOfSpeed_inRadians);
        double speedY = Math.sin(angleOfSpeed_inRadians);

        System.out.println(speedX);
        System.out.println(speedY);

        System.out.println(b0.angleOfSpeedWithX==angleOfSpeedWithX);
    }

}


public class E15154Ball{
    public static void main(String[] args) {
        Ball b1 = new Ball(2, 4, 10, 45);
        System.out.println(b1.x);
        System.out.println(b1.angleOfSpeedWithX);

        System.out.println(Ball.global_time);

        Ball.updateTime(20);

        Ball b2 = new Ball(3, 5, 40, 45);
        System.out.println(Ball.global_time);
        System.out.println(Ball.num_of_balls);

        b2.willCollide(b1);
    }
}