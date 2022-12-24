package Assignment_1;
import java.util.Scanner;
public class EvenOddNumber {
    public static void main(String[] args) {
        
        Scanner number=new Scanner(System.in);
        System.out.println("Enter the number");
        int i=number.nextInt();
        if(i%2==0){
            System.out.println("Given number "+i+" is even");
        }
        else{
            System.out.println("Given number "+i+" is odd");
        }

    }
}
