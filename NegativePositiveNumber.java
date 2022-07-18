import java.util.Scanner;

import java.util.Scanner;
public class NegativePositiveNumber {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=number.nextInt();
        if(a>0){
            System.out.println("Given Number "+a+" is Positive");

        }
        else{
            System.out.println("Given Number "+a+" is Negitive");
        }
    }
}
