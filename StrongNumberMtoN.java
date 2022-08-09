// Write a program to print Strong number m to n

import java.util.Scanner;
public class StrongNumberMtoN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the M :");
        int m=sc.nextInt();
        System.out.println("Enter tha N :");
        int n=sc.nextInt();
        for(int i=m;i<=n;i++){
            int num=i;
            int sum=0;
            int num1=i;
            while(num>0){
                int last=num%10;
                int fact=1;
                for(int j=1;j<=last;j++){
                    fact=fact*j;
                }
                sum=sum+fact;
                num=num/10;
            }if(sum==num1){
                System.out.println(num1+" is Strong number");
            }

            
        }     
    }    
}

// Strong number , 153= 1!+5!+3!=153

