public class do3{
	public static void main(String[] args){
		int a=1;
		do{
			int b=1;
			System.out.println(a);
			a+=1;
			do{
				System.out.print(b);
				b+=1;
			}while(b<=10);
		}while(a<=10);
	}
}