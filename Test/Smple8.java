import java.util.Scanner;
public class Smple8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first value :");
        int a=sc.nextInt();
        System.out.println("Enter the second value :");
        int b=sc.nextInt();
        System.out.println("Enter");
        int s=sc.nextInt();
        switch(s){
            case 1:
            System.out.println(a+b);
            break;
            case 2:
            System.out.println(a-b);
            break;
            case 3:
            System.out.println(a*b);
            break;
            case 4:
            System.out.println(a/b);
            break;


        }
    }
}
