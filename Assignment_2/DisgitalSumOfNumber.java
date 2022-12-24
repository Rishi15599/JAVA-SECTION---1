package Assignment_2;
 //write a program to print the digital sum of a number


import java.util.Scanner;
public class DisgitalSumOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
            int last=num%10;
            sum=sum+last;
            num=num/10;
        }
        System.out.println("Sum = "+sum);
    }
}
