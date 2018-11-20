class Person{
    String name;
    int age;

    void info(){
        System.out.println("person");
    }
}

class Std extends Person{
    double gpa;

    Std(String name){
        this.name = name;
        age = age;
        gpa = gpa;
    }

    void info(){
        System.out.println("student");
    }
}

class Lecturer extends Person{
    double salary;

    void info(){
        System.out.println("lecturer");
    }
}