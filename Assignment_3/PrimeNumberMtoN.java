package Assignment_3;
//write a program to print prime number m to n

import java.util.Scanner;;
public class PrimeNumberMtoN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the M :");
        int m=sc.nextInt();
        System.out.println("Enter the N :");
        int n=sc.nextInt();
        
        for(int i=m;i<=n;i++){
            int num=i;
            int count=0;
            for(int j=1;j<=num;j++){
                if(num%j==0)
                count++;
            }
            if(count==2){
                System.out.println(num +" is prime number");
            }

            }
        }
    }

    //Prime number = 7=1*7
