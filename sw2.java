public class sw2{
	public static void main(String[] args) {
		int month=2, year=2012, days=0;
		System.out.println(month);
		System.out.println(year);
		System.out.println(days);
		System.out.println();
		switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			days=31;
			break;
			case 4: case 6: case 9: case 11:
			days=30;
			break;

			case 2:
			if (year%4==0) 
				days=29;
			
				else 
					days=28;

				
			break;
			default:
				System.out.println("Invalid");
				
			}
				System.out.println("Number of days = "+days);
			
		
	}
}