public class twoDim{
	public static void main(String[] args){
		int[][] a2=new int[10][5];
		for(int i=0;i<10;i++){
			for(int j=0;j<5;j++){
				a2[i][j]=i;
				System.out.print(" "+a2[i][j]);
			}
			System.out.println("");
		}
	}
}