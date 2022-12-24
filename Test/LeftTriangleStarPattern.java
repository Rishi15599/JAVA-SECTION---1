//write a program to Left Triangle Star Pattern
public class LeftTriangleStarPattern {
    public static void main(String[] args) {
        int row=5;
        for(int i=(row-1);i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
