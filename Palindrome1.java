
public class Palindrome1 {
    public static void main(String[] args) {
        int  number=171;
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
