public class PatternAssignment17 {
    public static void main(String[] args) {
        int row=3;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=(row-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
