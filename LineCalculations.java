package day_3_practice_problems.lineComputational;

public class LineCalculations {

	public static void main(String[] args) {
		//To calculate the length of line in Cartesian form
		int x1 = 5, x2 = 15;
		int y1 = 4, y2 = 8;
		int a1 = 5, a2 = 15;
		int b1 = 4, b2 = 8;
		double length1 = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		double length2 = Math.sqrt(Math.pow((a2-a1),2) + Math.pow((b2-b1),2));
		System.out.println("Length of Line joining points " +"("+x1 + "," + y1 +")" +" " + "("+x2 + "," +y2 +")" + " is " + length1);
		System.out.println("Length of Line joining points " +"("+a1 + "," + b1 +")" +" " + "("+a2 + "," +b2 +")" + " is " + length2);
		}
}
