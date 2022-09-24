// 1
// 23
// 456
// 78910

public class PatternAssignment24 {
    public static void main(String[] args) {
        int num=1;
        int row=4;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num++);
            }
            System.out.println();
        }
    }
}
