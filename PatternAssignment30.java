// 1
// 32
// 654
// 10987

public class PatternAssignment30 {
    public static void main(String[] args) {
        int row=4;
        int num=0;
        for(int i=1;i<=row;i++){
            num=num+i;
            int a=num;
            for(int j=1;j<=i;j++){
                System.out.print(a--);
            }
            
            System.out.println();
        }
    }
}
