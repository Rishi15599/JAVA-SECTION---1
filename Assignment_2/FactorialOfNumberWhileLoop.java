package Assignment_2;
//Write a program to print factorial of number by using while loop

import java.util.Scanner;
public class FactorialOfNumberWhileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int i=1;
        int num=sc.nextInt();
        //int num=5;
        int fact=1;
        while(i<=num){
            fact=fact*i;
            i++;
        }System.out.println("Factorial of "+"num "+fact+"!");
    }
}
