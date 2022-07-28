//write a program count the digit of a number

import java.util.Scanner;
public class CountTheDigitOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        //int num=253;
        int count = 0;
        while(num>0){
            count++;
            num=num/10;

        }
        System.out.println(count);
    }
    
}
