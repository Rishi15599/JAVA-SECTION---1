//Write a program 3276:- 2+7+6=15


public class ReverseAndSum {
    public static void main(String[] args) {
        int num=3276;
        int sum=0;
        while(num>9){
            int lost=num%10;
            sum=sum+lost;
            
            
            num=num/10; 
        }
        System.out.println(sum);
    }
}
