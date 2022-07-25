//write a program count the number which are divisible by 3 and 7 both range is 1 to 100000


public class WhileLoopCount {
    public static void main(String[] args) {
        int a=1;
        int count=0;
        while(a<=100000){
            if(a%3==0 && a%7==0){
                count++;
            }a++;
        }
        System.out.println(count);

    }
}
