class Student{
    static String name;
    static int age;
    static double gpa;

    /*Student(){} //default constructor

    //user defined constructor
    Student(String n, int a, double g){
        name = n;
        age = a;
        gpa = g;
    }*/

    static{
        name = "Thor";

        System.out.println("Hello");
    }

    void sleep(){

    }

    void eat(){

    }

    void info(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(gpa);
    }
}