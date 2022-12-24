package Assignment_3;
//write a program to print Armstrong number m to n

import java.util.Scanner;
public class ArmstrongNumberMtoN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the M :");
        int m=sc.nextInt();
        System.out.println("Enter the N :");
        int n=sc.nextInt();
        for(int i=m+1;i<n;i++){
            int num=i;
            int num1=i;
            int num2=i;
            int count=0;
            int sum=0;
            while(num>0){
                count++;
                num=num/10;
            }
            while(num1>0){
                int last=num1%10;
                int power=1;
                for(int j=1;j<=count;j++){
                    power=power*last;
                }
                sum=sum+power;
                num1=num1/10;
                if(sum==num2){
                    System.out.println(num2);
                }
            }

        }
    }
}

//ArmstrongNumber = 153= 1!+5!+3! =153
