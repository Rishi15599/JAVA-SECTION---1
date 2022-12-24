package Assignment_2;
// 2.Write a program to print every digit of a given number in reverse order

import java.util.Scanner;
public class ReverseOrder {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      while(num>0){
        int lost=num%10;
        System.out.print(lost);
        num=num/10;
      }
    }
}
