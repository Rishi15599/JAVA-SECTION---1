//write a program to show pattern

public class Star5X5Space {
    public static void main(String[] args) {
        int row=5;
        for(int i=1;i<=row;i++){
            for(int j=1;j<row;j++){
                System.out.print(" *");
            }
            System.out.println(" *");
        }
    }
}
