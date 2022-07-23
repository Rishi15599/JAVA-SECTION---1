//Write a program to print multipls of 3 , from 1 to 100 by using while loop

public class WhileLoop3 {
    public static void main(String[] args) {
        int a=1;
        while(a<=100){
            if(a%3==0)
            System.out.println(a);
            a=a+1;
        }
    }
}
