//write a program to print Right down Mirror Star Pattern
public class RightdownMirrorStarPattern {
    public static void main(String[] args) {
        int row=5;
        for(int i=row;i>=0;i--){
            for(int j=row;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
            System.out.print("*");
            }
            System.out.println("");
    }
    }
}
