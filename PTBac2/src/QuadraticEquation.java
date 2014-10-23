import java.util.Scanner;


public class QuadraticEquation {
	
	float a,b,c;
	double x1,x2;
	double delta;
	Scanner input = new Scanner(System.in);
	
	public void input(float a,float b,float c){
		
		System.out.print("Nhập vào hệ số a: ");
		a = input.nextFloat();
		System.out.print("Nhập vào hệ số b: ");
		b = input.nextFloat();
		System.out.print("Nhập vào hệ số c ");
		c = input.nextFloat();
	}
	
	public double tinh_delta(){	
		delta = (b*b) - 4*a*c;
		return delta;
		
	}

	public double nghiemduynhat(){
		x1 = -c/b;
		return x1;
		
	}
	
	public double nghiemkep(){
		x1 = -b/(2*a);
		x2 = -b/(2*a);
		return x1;
	}
	
	public double nghiemphanbiet(){
		
		x1 = (-b - Math.sqrt(delta))/(2*a);
		
	}
}
