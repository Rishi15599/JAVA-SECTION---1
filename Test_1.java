//write a program to cheak number is happy or not !

//82=8*8+2*2=68
//68=6*6+8*8=10
//100=1*1+0*0+0*0=1(yes)
public class Test_1 {
    public static void main(String[] args) {
        int num=82;
    
        while(num!=1 && num!=2 && num!=3 && num!=4 && num!=5 && num!=6 && num!=7 && num!=8 && num!=9){
            int sum=0;
            while(num>0){
                int last=num%10;
                sum=sum+(last*last);
                num=num/10;
            }
            num=sum;
            
        }if(num==1){
            System.out.println("yes");
        }

    }
}
