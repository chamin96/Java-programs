class Fruits{
	String name;
	String clr;
	void disc(){
		System.out.println("Fruit is "+name);
		System.out.println("Color is "+clr);
	}
}
class Fruits1{
	public static void main(String args[]){
		Fruits apple=new Fruits();
		apple.name="APPLE";
		apple.clr="RED";
		apple.disc();
	}
}