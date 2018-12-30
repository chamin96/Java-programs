class Animal{

	public Animal(){

	}

	public Animal(int age,String color){
		this.age=age;
		this.color=color;
	}

	int age;
	String color;
}


public class Pet{

	public static void dispInfo(Animal x){
		System.out.println(x.age+" - "+x.color);
	}

public static void main(String[] args){
	Animal Tomy=new Animal(2,"Brown");
	dispInfo(Tomy);

	Animal Bonny = new Animal();
	Animal Kitty = new Animal();
	Animal Simba = new Animal();
	Animal Shabby = new Animal();
}

}
