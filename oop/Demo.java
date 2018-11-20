/*
*object=method+data
*class - blueprint of an objects
*/

public class Demo{
    public static void main(String[] args) {
        /*Student std1 = new Student("Smith",22,2.6);  //creating objects

        Student std2 = new Student("John",23,3.2);*/

        
        
        Student std3 = new Student();
        Student std4 = new Student();

        std3.info();
        std4.info();
    }
}

class ExampleClass{
    int x;
    int y;
    double c;

    void hello(){

    }
}