//write a program to print the digital product of a number

import java.util.Scanner;
public class DisgitalProductOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int product=1;
        while(num>0){
            int last=num%10;
            product=product*last;
            num=num/10;
        }
        System.out.println("product = "+product);
    }
}
