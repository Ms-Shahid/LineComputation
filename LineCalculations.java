package day_3_practice_problems.lineComputational;

public class LineCalculations {

	public static void main(String[] args) {
		//To calculate the length of lines in Cartesian form
		//coordinates of line 1
		int x1 = 5, x2 = 15; 
		int y1 = 4, y2 = 8;
		
		//coordinates of line 2
		int a1 = 5, a2 = 15;
		int b1 = 4, b2 = 8;
			
		Integer length1 = (int) Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		Integer length2 = (int) Math.sqrt(Math.pow((a2-a1),2) + Math.pow((b2-b1),2));
		
		int compare = length1.compareTo(length2);
		switch (compare) {
		case 0: System.out.println("lines are equal");break;
		case 1: System.out.println("line1 is less than line2");break;
		default: System.out.println("line1 is grether than line2");
		}
	}
}
