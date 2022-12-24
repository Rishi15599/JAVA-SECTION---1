package Assignment_2;
//Write a program to cheak given number is perfect square or not

import java.util.Scanner;
class PerfectSquareOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        boolean flag=false;
        for(int i=1;i<num;i++){
            int square=i*i;
            if(square==num){
                flag=true;
                break;
            }
        }
            if( flag==true){
                System.out.println("Perfect square");
            }else{
                System.out.println("not perfect square");
            }
        }

    }

