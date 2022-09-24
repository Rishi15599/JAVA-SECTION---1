// AAAAA
// 11111
// BBBBB
// 22222
// CCCCC

public class PatternAssignment42 {
    public static void main(String[] args) {
        int num=1;
        char c='A';
        int row=5;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                if(i%2==1){
                    System.out.print(c);
                }
                else{
                    System.out.print(num);
                }
            }
            if(i%2==1){
                c++;
            }
            else{
                num++;
            }
            System.out.println();
        }
        
    }
}
