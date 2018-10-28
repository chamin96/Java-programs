public class ClassesAndObjects{
    public static void main(String[] args) {
        Dog obj1 = new Dog();
        obj1.bark();
        obj1.walk();

        Phone p1 = new Phone();
        p1.showDetail();

        Phone p2 = new Phone("Samsung","Note");
        p2.showDetail();
    }
}

class Dog{
    String breed;
    String color;

    void bark(){
        System.out.println("Barks");
    }

    void walk(){
        System.out.println("Walks");
    }
}

class Phone{
    String brand;
    String model;

    //constructor
    Phone(){
        brand="Brand-X";
        model="Model-X";
    }

    //constructor
    Phone(String b, String m){
        this.brand=b;
        this.model=m;
    }

    void showDetail(){
        System.out.println(brand);
        System.out.println(model);
    }
}