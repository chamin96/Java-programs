class Ball{
    
    public static double global_time = 0; //global clock
    protected static int num_of_balls = 0; //keep a record of num of balls

    double x;
    double y;
    double speed;
    double angleOfSpeedWithX;
    double initial_time;
    double newX;
    double newY;
    double angleOfSpeed_inRadians;
    double speedX;
    double speedY;
    double distanceX;
    double distanceY;

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
        
        b0.angleOfSpeed_inRadians=Math.toRadians(b0.angleOfSpeedWithX); //convert degrees to radians
        this.angleOfSpeed_inRadians=Math.toRadians(this.angleOfSpeedWithX);

        b0.speedX = b0.speed * Math.cos(angleOfSpeed_inRadians); //velocity along x-axis
        b0.speedY = b0.speed * Math.sin(angleOfSpeed_inRadians); //velocity along y-axis

        this.speedX = this.speed * Math.cos(angleOfSpeed_inRadians); //velocity along x-axis
        this.speedY = this.speed * Math.sin(angleOfSpeed_inRadians); //velocity along y-axis


        b0.distanceX = speedX * (global_time-b0.initial_time);  //s=ut
        b0.distanceY = speedY * (global_time-b0.initial_time);

        this.distanceX = speedX * (global_time-this.initial_time);  //s=ut
        this.distanceY = speedY * (global_time-this.initial_time);

        b0.newX = b0.x + distanceX; //current position
        b0.newY = b0.y + distanceY;

        this.newX = this.x + distanceX; //current position
        this.newY = this.y + distanceY;


        System.out.println(b0.newX);
        System.out.println(b0.newY);
        System.out.println(this.newX);
        System.out.println(this.newY);

        System.out.println(this.newX==b0.newX);
        System.out.println(this.newY==b0.newY);
    
    }

}


public class E15154Ball{
    public static void main(String[] args) {
        Ball b1 = new Ball(2, 4, 10, 0);
        

        Ball.updateTime(20);

        Ball b2 = new Ball(2, 2, 30, 0);
        //System.out.println(Ball.global_time);
        //System.out.println(Ball.num_of_balls);

        Ball.updateTime(10);

        b2.willCollide(b1);
    }
}