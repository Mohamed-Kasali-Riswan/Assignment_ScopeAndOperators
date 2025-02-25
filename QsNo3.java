package scopesAndVariables;
import java.util.Scanner;
//  3.Get two numbers from user and perform bitwise AND< OR, XOR, left and right shift operations on them.

public class QsNo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of num1: ");
		int a=sc.nextInt();
		
		System.out.println("Enter the value of num2: ");
		int b=sc.nextInt();
		
		int and=a&b;
		int or=a|b;
		int xor=a^b;
		int not=~a;
		
		int leftShift=a<<1;
		int leftShiftt=a<<2;
		
		int rightShift=a>>1;
		int rightShiftt=a>>2;

		int unsignedRightShift=a>>>1;
		int unsignedRightShiftt=a>>>2;
		
		System.out.println("AND value : "+and);
		System.out.println("OR value : "+or);
		System.out.println("XOR value : "+xor);
		System.out.println("NOT value : "+not);
		System.out.println("LeftShift value of a<<1 : "+leftShift);
		System.out.println("LeftShift value of a<<2 : "+leftShiftt);
		System.out.println("RightShift value of a>>1: "+rightShift);
		System.out.println("RightShift value of a>>2: "+rightShiftt);
		System.out.println("Unsigned Right Shift value of a>>>1: "+unsignedRightShift);
		System.out.println("Unsigned Right Shift value of a>>>2: "+unsignedRightShiftt);


	}

}
