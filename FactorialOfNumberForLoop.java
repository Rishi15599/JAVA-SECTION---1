//Write a program to print factorial of number by using for loop

import java.util.Scanner;
public class FactorialOfNumberForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int i=1;
        //int num=5;
        int num=sc.nextInt();
        int fact=1;
        for(i=1;i<=num;i++){
            fact=fact*i;
        } System.out.println("Factorial of "+num+" = "+fact);
    }
}
