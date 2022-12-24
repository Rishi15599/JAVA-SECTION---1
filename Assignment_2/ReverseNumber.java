package Assignment_2;
//Write a program to print reverse number

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        //int i = 356;
        int rev=0;
        while(i>0){
            int lost=i%10;
            rev=(rev*10)+lost;
            i=i/10;

        }System.out.println("Reverse = "+rev);
    }
}
