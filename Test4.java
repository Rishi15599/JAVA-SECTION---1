import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) {
        int base, i, exponent;
		long power = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please Enter any Number:");
		base = sc.nextInt();	
		
		System.out.print("Please Enter the Exponent Value : ");
		exponent = sc.nextInt();	
		
		for(i = 1; i <= exponent; i++)
		{
			power = power * base;
		}
		System.out.println("\n The Final result of " + base + " power " + exponent + " = " + power);
	}
       
}
