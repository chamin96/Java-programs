class Student{
    String name = "default name";



    Student(){
        this.name = "Robin";
    }

    Student(String n){
        this.name=n;
    }

    void sleep(){

    }

    void eat(){

    }

    void info(){
        System.out.println(name);
    }
}