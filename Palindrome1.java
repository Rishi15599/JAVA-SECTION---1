//write a program to cheak palindrome number
import java.util.Scanner;
public class Palindrome1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  number=sc.nextInt();
        int temp=number;
        int rev=0,rem;
        while(temp !=0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(number==rev)
        {
            System.out.println(number + " palindrome");
        }
        else
        {
            System.out.println(number + " not palindrome");
        }
    }

}
//pailndrome number , 171=171
