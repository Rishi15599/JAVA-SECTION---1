public class ArmstrongNumber {
    public static void main(String[] args) {
        int num=153;
        int a=num;
        int sum=0;
        while(num>0){
            int last=num%10;
            sum=sum+(last*last*last);
            num=num/10;
        }if(sum==a){
            System.out.println("Number is armstrong");
        }else{
            System.out.println("Number is not armstrong");
        }
    }
}
// Wrong method