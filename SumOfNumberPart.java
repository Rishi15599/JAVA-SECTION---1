public class SumOfNumberPart {
    public static void main(String[] args) {
        int num=3276;
        int sum=0;
        while(num>0){
            int lost=num%100;
            sum=sum+lost;
            num=num/100; 
        }
        System.out.println(sum);
    }
}
