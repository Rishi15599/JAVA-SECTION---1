//Print happe number 1 to 100 !
public class Test_2 {
    public static void main(String[] args) {
        int n=1;
        int m=100;
        for(int i=n;i<=m;i++){
            int num=i;
            //while(num!=1 && num!=2 && num!=3 && num!=4 && num!=5 && num!=6 && num!=7 && num!=8 && num!=9){
            while(num!=1&&num!=4){
            //while(num>9){
                int sum=0;
                while(num>0){
                    int last=num%10;
                    sum=sum+(last*last);
                    num=num/10;
                }
                num=sum;
            }if(num==1){
                System.out.println(i);
            }
        }
    }
}
