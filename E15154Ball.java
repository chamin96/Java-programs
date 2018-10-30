class Ball{
    
    public static double global_time = 0; //global clock
    protected static int num_of_balls = 0; //keep a record of num of balls

    double x;
    double y;
    double speed;
    double angleOfSpeedWithX;
    double initial_time;

    /*constructor*/ 
    Ball(double x, double y, double speed, double angleOfSpeedWithX){
        num_of_balls++; //increment num of balls
        initial_time = global_time;

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
        double angleOfSpeed_inRadians=Math.toRadians(b0.angleOfSpeedWithX); //convert degrees to radians

        double speedX = b0.speed * Math.cos(angleOfSpeed_inRadians);
        double speedY = b0.speed * Math.sin(angleOfSpeed_inRadians);

        System.out.println(speedX);
        System.out.println(speedY);

        double distanceX;
        double distanceY;

        distanceX = speedX * (global_time-b0.initial_time); 
        distanceY = speedY * (global_time-b0.initial_time);

        System.out.println(distanceX);
        System.out.println(distanceY);



        System.out.println(b0.angleOfSpeedWithX==angleOfSpeedWithX);
        //System.out.println(b0.);
    }

}


public class E15154Ball{
    public static void main(String[] args) {
        Ball b1 = new Ball(2, 4, 10, 0);
        System.out.println(b1.speed);
        System.out.println(b1.angleOfSpeedWithX);

        System.out.println(Ball.global_time);

        Ball.updateTime(20);

        Ball b2 = new Ball(3, 5, 40, 60);
        //System.out.println(Ball.global_time);
        //System.out.println(Ball.num_of_balls);

        b1.willCollide(b2);
    }
}