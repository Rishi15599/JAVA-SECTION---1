//write a program to print perfect squares b/w m to n

import java.util.Scanner;
public class PerfectSquaresMtoN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the M :");
        int m=sc.nextInt();
        System.out.println("Enter the N :");
        int n=sc.nextInt();
        for(int i=(m+1);i<n;i++){
            int num=i;
            for(int j=1;j<=num;j++){
                int square=j*j;
                if(square==num){
                    System.out.println(num);
                    break;
                }
            }
        }
    }
}
//Perfect Square = 16 = 4*4 = 16
