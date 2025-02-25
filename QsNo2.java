package scopesAndVariables;
import java.util.Scanner;
// 2.Write a program to solve a quadratic equation (ax^2+bx+c). Take a,b and c from user and use quadratic formula.

public class QsNo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		double a=sc.nextDouble();
		System.out.println("Enter the value of b:");
		double b=sc.nextDouble();
		System.out.println("Enter the value of c:");
		double c=sc.nextDouble();
		
		double val=(b*b)-4*a*c;
		
		if(val>0){         
			double ans1=(-b+Math.sqrt(val))/(2*a);
			double ans2=(-b-Math.sqrt(val))/(2*a);
			System.out.println("Answers are "+ans1+" and "+ans2);
		}
		else if(val==0){
			double ans= -b/(2*a);
			System.out.println("Answer is "+ans);
		}
		else{
			double ans1= -b/2*a;
			double ans2=Math.sqrt(-val)/(2*a);
			System.out.println("Answers is "+ans1+" +/- "+ans2);
		}
	}

}
