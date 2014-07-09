import java.util.Scanner;
import java.util.ArrayList;

public class HighestGrade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double [] grades = new double[5];
		
		for(int x = 0; x <= 4; x++){
			System.out.println("Enter Grade: ");
			double grade = input.nextDouble();
			grades[x] = grade;
		}
		double value1;
		double value2;
		double nextValue = 0;
		double prevValue = 0;
		double maximum = 0;
		
		
		for(int x = 0; x <= (5-2); x++){
			value1 = grades[x];
			value2 = grades[x+1];
			
			if (value1 > value2 ){
				nextValue = value1;
			}else{
				nextValue = value2;
			}
			
			if (prevValue > nextValue){
				maximum = prevValue;
			}else{
				maximum = nextValue;
			}
		}
		System.out.println("The Maximum of the Data set is = " + maximum);
	}

}
