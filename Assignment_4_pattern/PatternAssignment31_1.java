// 0101
// 1010
// 0101
// 1010

public class PatternAssignment31_1 {
    public static void main(String[] args) {
        int row=4;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                System.out.print((i+j)%2);
            }
            System.out.println();
        }
    }
}
