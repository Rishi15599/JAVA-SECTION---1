//write a program print natural number -10 to 10

public class DoWhileNaturalNumber {
    public static void main(String[] args) {
        int a = -10;
        
        do{
            if(a>0)
            System.out.println(a);
            a++;
        }while(a<=10);
    }
}
