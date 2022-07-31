//write aprogram to cheak given number is perfect or not

import java.util.Scanner;
public class PerfectNumberOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=(num/2);i++){
            if(num%i==0){
                sum=sum+i;
            }
        } if(sum==num){
            System.out.println("Given number is perfect !");
        }else{
            System.out.println("Given number is not perfect !");
        }
        
    }
}
