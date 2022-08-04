//write a program to cheak wheather number is neon or not

public class NeonNumber {
    public static void main(String[] args) {
        int num=9;
        int prod=1;
        int sum=0;
        prod=num*num;
        System.out.println("prod of the number = "+prod);
        while(prod>0){
            int last=prod%10;
            sum=sum+last;
            prod=prod/10;
        }if(sum==num){
            System.out.println("Neon Number");
        }else{
            System.out.println("Not a neon number");
        }
    }    
}
//neon number = 9