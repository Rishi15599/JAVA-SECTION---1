//write a program to count even and odd number (range) 1 to 150 by using do while loop

public class DoWhileCount {
    public static void main(String[] args) {
        int a=1;
        int count1=0;
        int count2=0;
        do{
            if(a%2==0){
            count1++;
            }
            if(a%2!=0){
            count2++;
            }
            a++;
        }while(a<=150);
        System.out.println(count1);
        System.out.println(count2);

            

        }
    }

