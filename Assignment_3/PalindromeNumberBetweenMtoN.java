package Assignment_3;
import java.util.Scanner;
public class PalindromeNumberBetweenMtoN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the M :");
        int m=sc.nextInt();
        System.out.println("Enter the N :");
        int n=sc.nextInt();
        for(int i=(m+1);i<n;i++){
            int num=i;
            int num1=num;
            int rev=0;
            while(num>0){
                int last=num%10;
                rev=rev*10+last;
                num=num/10;
            }if(num1==rev){
                System.out.println(num1);
            }

        }
        
    }
}
