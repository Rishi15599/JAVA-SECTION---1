package Assignment_3;
//write a program to cheak Armstrong number

import java.util.Scanner;
public class ArmstrongNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        int count=0;
        int num2=num;
        int num1=num;
        int sum=0;

        while(num>0){
            count++;
            num=num/10;
        }
        while(num1>0){
            int last=num1%10;
            int power=1;
            for(int i=1;i<=count;i++){
                 power=power*last;
            }        
        sum=sum+power;
        num1=num1/10;
        }
        if(sum==num2){
            System.out.println("Number is Armstrong Number");
        }else{
            System.out.println("Number is not Armstrong number");
        }
    }
}
//ArmstrongNumber = 153 = 1!+ 5! +3! = 153