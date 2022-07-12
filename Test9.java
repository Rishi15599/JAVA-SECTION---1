import java.util.Scanner;
public class Test9 {
    public static void main(String[] args) {
    int m1 , m2 , m3 , m4 , m5;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your Subject marks:-");
    System.out.println("Enter 1st marks");
    m1=sc.nextInt();
    System.out.println("Enter 2nd marks");
    m2=sc.nextInt();
    System.out.println("Enter 3rd marks");
    m3=sc.nextInt();
    System.out.println("Enter 4th marks");
    m4=sc.nextInt();
    System.out.println("Enter 5th marks");
    m5=sc.nextInt();
    int total=m1+m2+m3+m4+m5;
    System.out.println("Total="+total);
    System.out.println("Avrage Marks="+total/5);
    System.out.println("Percentage ="+(total*100)/500);
    


    }
}
