package Control_Statement;
import java.util.Scanner;
public class SwitchPro {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the marks");
        int b=a.nextInt();
        int c=b/10;
        switch(c)
        {
            case 8:{
                System.out.println("Excelent "+c);
            }break;
            case 7:{
                System.out.println("A+");
            }break;
            case 6:{
                System.out.println("A");
            }break;
            case 5:{
                System.out.println("B+");
            }break;
            case 4:{
                System.out.println("B");
            }break;
            case 3:{
                System.out.println("C");
            }break;
            case 2:{
                System.out.println("D");
            }break;
            case 1:{
                System.out.println("FAIL");
            }break;
            default:{
                System.out.println("Your num is "+b);
            }

        }
    }
}
