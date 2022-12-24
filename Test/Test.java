//Write a program to cheak given number is happy number or not !
class Test{
    public static void main(String[] args) {
        int num=82;
        int sum=0;
        while(num>0){
            int last=num%10;
            sum=sum+(last*last);
            num=num/10;
            int sum1=0;
            int num1=sum;
            while(num1>0){
                int last1=num1%10;
                sum1=sum1+(last1*last1);
                num1=num1/10;
                int sum2=0;
                int num2=sum1;
                while(num2>0){
                    int last2=num2%10;
                    sum2=sum2+(last2*last2);
                    num2=num2/10;
                    if(sum2==1){
                        System.out.println("yes");
                    }
                    
                }
            }
        }
    }
}