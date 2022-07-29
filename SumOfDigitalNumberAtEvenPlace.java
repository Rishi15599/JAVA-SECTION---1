//writw a program to print digital number of sum of even place

import java.util.Scanner;
public class SumOfDigitalNumberAtEvenPlace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        //int i=234567;
        int sum=0;
        int rev=0;
        int count=0;
        while(i>0){
            int last=i%10;
            rev =(rev*10)+last;
            i=i/10;
        }while(rev>0){
            int last=rev%10;
            count++;
            if(count%2==0){
                sum=sum+last;
                
            }
            rev=rev/10;
        }
        System.out.println("Sum of digital number at even place = "+sum);

    }
}
