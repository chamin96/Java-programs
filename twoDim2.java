public class twoDim2{
	public static void main(String[] args) {
		String names[][]=new String[][]{
			{"Chamin","Nayanashan"},
			{"Udana","Praneeth"},
			{"CN","96"}

		};
		for (int row=0;row<3;row++) {
			System.out.println(" ");
			for (int col=0;col<2;col++) {
				System.out.print('\t'+names[row][col]+'\t');
			}
		}
	}
}