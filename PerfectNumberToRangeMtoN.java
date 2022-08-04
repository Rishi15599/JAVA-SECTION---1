//write a program to print perfect number range m to n 

public class PerfectNumberToRangeMtoN {
    public static void main(String[] args) {
        int m=10;
        int n=100000;
        for(int i=m;i<=(n);i++){
            int num=i;
            int sum=0;
            for(int j=1;j<=(num/2);j++){

                if(num%j==0){
                    sum=sum+j;
                }
            }
            if(sum==num){
                System.out.println(num);
            }
        }   
        
    }
}
//perfect number = 28
