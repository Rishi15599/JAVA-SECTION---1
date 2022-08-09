//write a program to print palindrome number m to n

import java.util.Scanner;
public class PalindromeInRange {
	
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the starting range");
		int r1=ob.nextInt();
		System.out.println("enter the end range");
		int r2=ob.nextInt();
		int count=0;
		System.out.println(r1 + " to " + r2 + " palindrome numbers are");
		for(int i=r1;i<=r2;i++) {
			int x=i;
			int rem=0;
			while(x !=0){
				int n=x%10;
				rem=rem*10+n;
				x=x/10;
			}
			if(rem==i){
				count++;
				System.out.print(i+" ");
			}
		}
		System.out.println("count: "+count);
	}
}