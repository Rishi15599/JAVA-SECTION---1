//Write a program to print X^N

import java.util.Scanner;
public class XToPowerN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the X : ");
        int x=sc.nextInt();
        System.out.println("Enter the N : ");
        int n=sc.nextInt();
        int power=1;
        for(int i=1;i<=4;i++){
            power=power*x;
        }System.out.println("X"+" ^"+" N = "+power);
        
    }
}
