public class ArmstrongNumber{
    public static void main(String[] args) {
        int num=1634;
        int count=0;
        int num2=num;
        int num1=num;
        int sum=0;

        while(num>0){
            count++;
            num=num/10;
        }
        while(num1>0){
            int last=num1%10;
            int power=1;
            for(int i=1;i<=count;i++){
                 power=power*last;
            }        
        sum=sum+power;
        num1=num1/10;
        }
        if(sum==num2){
            System.out.println("Number is Armstrong Number");
        }else{
            System.out.println("Number is not Armstrong number");
        }
    }
}