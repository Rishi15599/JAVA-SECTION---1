// a
// ab
// abc
// abcd

public class PatternAssignment25 {
    public static void main(String[] args) {
        int row=4;
        for(int i=1;i<=row;i++){
            char c='a';
            for(int j=1;j<=i;j++){
                    System.out.print(c++);
            }
            System.out.println();
        }
    }
}
