
import java.util.Scanner;
public class TestStudent {
    public static void main(String[] args) {
        Scanner b=new Scanner(System.in);
        
        int a=b.nextInt();
       // int c=b.nextInt();
        if(100==a){
            System.out.println("Excellent");
        }
        else if(99>=a && a>=90){
            System.out.println("A+");
        }

        else if(89>=a && a>=80){
            System.out.println("A");
        }
        else if(79>=a && a>=70){
            System.out.println("B+");

        }
        else if (69>=a && a>=60){
            System.out.println("B");
        }
        else if(59>=a && a>=50){
            System.out.println("C");
        }
        else if(49>=a && a>=35){
            System.out.println("D");
        }
        else{
            System.out.println("Fail");
        }
}
}
