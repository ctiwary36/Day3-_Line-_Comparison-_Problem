
import java.util.Scanner;
import java.lang.Math;
public class Comparison{
	public static void main(String[] args){
			System.out.print("Welcome to Line comparision Problrm ");
	double x1;
	double y1;
	double x2;
	double y2;
	Scanner reader = new Scanner(System.in);
	System.out.print("Enter Four numbers: ");
	x1 = reader.nextDouble();
	y1 = reader.nextDouble();
	x2 = reader.nextDouble();
	y2 = reader.nextDouble();
	
	double Length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	System.out.println("Length of Line is: "+ Length);
	}
       }