// 1010101
// 01010
// 101
// 0

public class PatternAssignment33 {
    public static void main(String[] args) {
        int row=4;
        for(int i=row;i>=1;i--){
            for(int j=1;j<=i*2-1;j++){
                if((i+j)%2==1){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
