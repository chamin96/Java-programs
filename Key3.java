import java.io.*;
public class Key3{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String day;
		System.out.println("enter  day: ");
		day=br.readLine();
		switch (day) {
			case "1":
				System.out.println("Sunday");
				break;
			case "2":
				System.out.println("Monday");
				break;
			case "3":
				System.out.println("Tuesday");
				break;
			case "4":
				System.out.println("Wedenesday");
				break;
			case "5":
				System.out.println("Thursday");
				break;
			case "6":
				System.out.println("Friday");
				break;
			case "7":
				System.out.println("Saturday");
				break;
				default:
					System.out.println("Invalid input!!!");
					break;
		}
	}
}
