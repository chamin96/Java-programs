/*
*object=method+data
*class - blueprint of an objects
*/

public class Demo{

    public static void main(String[] args) {
        Person p =  new Person();

        Std st1 = new Std("Nimal");
        Person st2 = new Std("Wimal");
        Person l1  = new Lecturer();
    
    
        System.out.println(st1.name);
        st1.info();
        p.info();
        st2.info();
        l1.info();

    }


}
