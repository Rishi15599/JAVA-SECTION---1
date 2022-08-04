//write a program to print fibonnaci series

public class FibonnaciSeries {
    public static void main(String[] args) {
        int count=10;
        int num1=0;
        int num2=1;
        System.out.println(num1+" "+num2);
        for(int i=1;count>=i;i++){
            int num3=num1+num2;
            System.out.print(" "+num3);
            num1=num2;
            num2=num3;
        }
    }
}
