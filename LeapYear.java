//write a program to cheak Leap year

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year :");
        int year=sc.nextInt();
        if((year%4)==0 && (year%400)==0 || (year%100!=0) && (year%4==0)){
            System.out.println("Leap year");
        }else{
            System.out.println("not leap year");
        }
    }
}
