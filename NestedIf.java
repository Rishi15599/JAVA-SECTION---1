import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        int a=sc.nextInt();
        if(a>=18){
            if(a<=45){
                System.out.println("your are welcome "+"your age is "+a);
            }
            else if(a>45 && a<+75){
                System.out.println("Your are not egligbal "+"your age is "+a);


            }
            else{
                System.out.println("Gone case "+"your age is "+a);
            }
        }
        else{
            System.out.println("Your are too much younger "+"and your age is "+a);
        }
    }
}
