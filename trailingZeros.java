import java.io.*;
public class trailingZeros{
	
	public static void main(String[] args){
		int x=0;
		long f;
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			x=Integer.parseInt(br.readLine());
		}
		catch(NumberFormatException ne)
		{
			System.out.println("Invalid input");
			System.exit(0);
		}
		catch(IOException ioe)
		{
			System.out.println("IO Error"+ioe);
			System.exit(0);
		}
		f=factorial(x);
		
		System.out.println(x+"! = "+f);
		
		if(f%10==0){
			long k=f;
			int count=0;
			while(k%10==0){
				count++;
				k=k/10;
			}
			System.out.println(f+" has "+count+" trailing zeros.");
		}
		else {
			System.out.println("There are no trailing zeros in "+f);
		}
		
	}
	public static long factorial(int x){
	long f=1;
	if(x==0){
		return f;
	}
	else 
	{
		while(x>0){
			f*=x;
			x--;
		}
		return f;
	}
}
}

