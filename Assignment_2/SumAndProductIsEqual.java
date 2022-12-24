package Assignment_2;
//Write a program

import java.util.Scanner;
public class SumAndProductIsEqual {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        int product=1;
        int sum=0;
        while(num>0){
            int last=num%10;
            product=product*last;
            sum=sum+last;
            num=num/10;
        }
        System.out.println("sum = "+sum);
        System.out.println("product = "+product);
        if(sum==product){
        System.out.println("sum==product ");
        }
        else{
            System.out.println("sum!=product ");
        }
    }
}
