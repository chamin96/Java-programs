public class array2{
	public static void main(String[] args) {
		int total=0;
		int[] integers;
		integers =new int[5];
		integers[0]=50;
		integers[1]=40;
		integers[2]=30;
		integers[3]=20;
		integers[4]=10;
		for (int i=0;i<5 ;i+=1) {
			total=total+integers[i];
		}
		System.out.println(total);

	}
}