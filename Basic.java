public class Basic{



	int age;

	public int getAge(int age){

		int mYage = age;
		return mYage;
	}

	public static void main(String[] args){

		Basic b = new Basic();

		int age = b.getAge(23);
		System.out.println(age);

	}




}