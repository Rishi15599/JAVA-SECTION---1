import java.util.Scanner;

public class AmstrogNumberInRange {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		System.out.println("enter your starting range");
		int r1=sc.nextInt();
		System.out.println("enter your ending range");
		int r2=sc.nextInt();
        System.out.println(r1 + " to " + r2 + " amstrong numbers are -");
        for(int j1=r1;j1<=r2;j1++)
        {
            int sum=0,rem=j1,n=j1,n1=n;
            int count=0;
            while(n !=0)
            {
                count++;
                n=n/10;
            }
            while(n1 !=0){
                int num=n1%10;
                int pow=1;
                for(int i=1;i<=count;i++) {
                    pow=pow*num;
                }
                sum=sum+pow;
                n1=n1/10;
            }
            if(rem==sum){
                System.out.print(rem);
            }
        }
    }
}
