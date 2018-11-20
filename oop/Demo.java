/*
*object=method+data
*class - blueprint of an objects
*/

public class Demo{

    static void method1(){
        System.out.println("method1");
    }

    static int method1(int x){
        System.out.println("overloaded");
        return x;
    }

    public static void main(String[] args) {
        method1();
        System.out.println(method1(5));
    }
}
