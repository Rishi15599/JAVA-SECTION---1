//writw a program to print digital number of sum of odd place

public class SumOfDigitalNumberAtOddPlace {
    public static void main(String[] args) {
        int i=2345;
        int sum=0;
        int count=0;
        int rev=0;
        while(i>0){
            int last=i%10;
            rev=(rev*10)+last;
            i=i/10;
        }while(rev>0){
            int last=rev%10;
            count++;
            if(count%2!=0){
                sum=sum+last;
            }
            rev=rev/10;
        }
        System.out.println(sum);
    }
}
