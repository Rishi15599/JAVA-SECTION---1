//write a program to cheak number is Armstrong number or not

import java.util.Scanner;
public class ArmstrongNumber1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        int num1=num;
        int num2=num;
        int count=0;
        int sum=0;
        while(0<num){
            count++;
            num=num/10;
        }System.out.println("Number Of Digit "+count);
        while(num1>0){
            int last=num1%10;
            int power=1;
            for(int i=1;i<=count;i++){
                power=power*last;
            }
            sum=sum+power;
            num1=num1/10;
            
        }if(sum==num2){
            System.out.println("Number is armstrong");
        }else{
            System.out.println("Number is not armstrong");
        }
    }
}
