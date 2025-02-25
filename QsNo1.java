package scopesAndVariables;
import java.util.Scanner;
// 1.Write a program to convert Celsius to Fahrenheit using appropriate datatypes and literal conventions
public class QsNo1 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter temperature in Celsius: ");
	        double celsius=sc.nextDouble();  // Using double for precision
	        double fahrenheit=(celsius*9.0/5.0)+32.0;
	        System.out.print("Temperature in Fahrenheit: "+fahrenheit);
	    }
}
  
