package Assignment_3;
//write a program to cheak sunny number

public class SunnyNumber {
    public static void main(String[] args) {
        int num=15;
        int num1=num+1;
        int square=1;
        boolean flag=true;
        for(int i=1;(num1/2)>=0;i++){
            square=i*i;
            num1=num1/10;
        if(square==num1){
            flag=true;
            break;
        }
        }
        if(flag==true){
            System.out.println("Sunny Number ");
        }else{
            System.out.println("not sunny number ");
        }

    }
}

//sunny number = 15 {(15+1)=16^2=4}
