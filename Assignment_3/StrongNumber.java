package Assignment_3;
//write a program to cheak number is Strong number or not

public class StrongNumber{
    public static void main(String[] args) {
        int num=145;
        int num1=num;
        int sum=0;
    
        while(num>0){
            int last=num%10;
            int fact=1;
            //fact=fact*last;
            for(int i=1;i<=last;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            num=num/10;
        }if(sum==num1){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not a strong number");
        }
    }
}


// Strong number = 145,