import java.util.Scanner;

public class BinomialExpansion {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("To what power?  ");
		int power = input.nextInt();
		
		while(power < 0) { 
			System.out.println("\nEnter a Positive Power Number: ");
			power = input.nextInt();
		}
		if ( power == 0) {
			System.out.println("1");
			power = input.nextInt();
		}else if ( power == 1 ) {
			System.out.println("1");
			System.out.println("1   1");
		}else if (power >=2 ){
		
		int[][] expansion = new int[power + 1][power + 1];
		
		expansion[0][0] = 1;
		expansion[0][1] = 2;
		expansion[0][2] = 1;
		
		int y = 0;
		
		System.out.println("\n1");
		System.out.print("1   1");
		
		for(int x = 2; x <= power; x++) {
			//System.out.println("\nx = " + x);
			//System.out.println("y = " + y);
			expansion[y][0] = 1;
			//System.out.println("expansion[y][0] = " + expansion[y][0]);
			expansion[y][x] = 1;
			//System.out.println("expansion[y][x] = " + expansion[y][x]);
			y++;
		
		}
		
		int b2 = 2;
		
		for (int a = 1; a <= (power - 2); a++) {
			b2++;
			//System.out.println("a = " + a);
			
			for	( int b = 1; b < b2; b++) {
				expansion[a][b] = expansion[a-1][b-1] + expansion[a-1][b];
				/*System.out.println("b = " + b);
				System.out.println("expansion[a][b] = expansion[a-1][b-1] + expansion[a-1][b]: ");
				System.out.println("expansion[a][b] = " + expansion[a][b] );
				System.out.println("expansion[a-1][b-1] = " + expansion[a-1][b-1]);
				System.out.println("expansion[a-1][b] = " + expansion[a-1][b]);
				System.out.println();*/
				
			}
		}
		int index = -1;
		int b21 = 1;
		for(int row = 0; row <=power-2; row++){
		System.out.println();
		
		b21++;
		for(int col = 0; col <= b21; col ++) {
			System.out.print(expansion[row][col] +"   ");	
		}
	}
	}
}
}