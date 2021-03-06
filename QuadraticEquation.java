import java.util.Scanner;
import static java.lang.Math.sqrt;


public class QuadraticEquation {
	
	
	public String GiaiPT(double a, double b, float c){
		double delta = (b*b - 4*a*c);		
		
		if( a == 0)
			return "Error value of a";
		if (a + b + c == 0)
			return "Equation have value of x1 = 1 and value of x2 = " + String.valueOf(c/a);
		if (a - b + c == 0)
			return "Equation have value of x1 = -1 and value of x2 = " + String.valueOf(-c/a);
		else if(delta < 0)
			return "Equation have no values of x1 and x2";
		else if(delta == 0)
			return " Equation have x1 = x2 = " + String.valueOf(-b/(2*a));
		else
			return "Equation have x1 = " + String.valueOf((-b - sqrt(delta))/(2*a)) +
					    "and have x2 = " + String.valueOf((-b + sqrt(delta))/(2*a));
		}
	public static void main(){
		QuadraticEquation quadraticEquation = new  QuadraticEquation();
		QuadraticEquation quadraticEquation1 = new  QuadraticEquation();
		QuadraticEquation quadraticEquation2 = new  QuadraticEquation();
		QuadraticEquation quadraticEquation3 = new  QuadraticEquation();
		QuadraticEquation quadraticEquation4 = new  QuadraticEquation();
		QuadraticEquation quadraticEquation5 = new  QuadraticEquation();
		System.out.print(quadraticEquation.GiaiPT(0, 2, 3));
		System.out.print(quadraticEquation1.GiaiPT(3, -2, 1));
		System.out.print(quadraticEquation2.GiaiPT(2, 3, 1));
		System.out.print(quadraticEquation.GiaiPT(3, 2, 1));
		System.out.print(quadraticEquation.GiaiPT(4, 4, 2));
		System.out.print(quadraticEquation.GiaiPT(2, 4, 1));
	}
	}


	


