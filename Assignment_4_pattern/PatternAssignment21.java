// A1111
// 1B  1
// 1 C 1
// 1  D1
// 1111E

public class PatternAssignment21 {
    public static void main(String[] args) {
        int row=5;
        char c='A';
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                if(i==j){
                    System.out.print(c++);
                }else if(i==1 || i==row || j==1 || j==row){
                    System.out.print(1);

                }else{
                    System.out.print(" ");
                }
            
            }
            System.out.println();
        }
    }
}
