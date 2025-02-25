package scopesAndVariables;
import java.util.Scanner;
// Write a program with an if statement. Declare one variable inside the if block and another one outside.
// Print both variables inside and outside the if block to understand variable scope. 

// Answer: (Compile Time Error) Duplicate local variable b at scopesAndVariables

public class QsNo4 {
	public static void main(String[] args) {		
		int a=10;
		if(a==10) {
			int b=20;
			if(a>5) {
				int b=25;
			}
		}
	}

}
