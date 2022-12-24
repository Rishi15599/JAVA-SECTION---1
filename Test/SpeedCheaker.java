import java.util.Scanner;
public class SpeedCheaker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the speed");
        int speed=sc.nextInt();
        if(speed>=30){
        if(speed>30 && speed<=60){
            System.out.println("Modurate speed");
        }
        else{
            System.err.println("Over speed");
        }
    }
    else{
        System.out.println("Your speed is very slow please learn driving first and you speed is "+speed);
    }
    }
}
