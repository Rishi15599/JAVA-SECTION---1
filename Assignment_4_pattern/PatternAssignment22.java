// 1a3b
// 5c7d
// 9e1f
// 3g5h

public class PatternAssignment22 {
    public static void main(String[] args) {
        int row=4;
        int num=1;
        char  c='a';
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                if(j%2==1){
                    System.out.print(num);
                    num=num+2;
                    if(num>9)
                    num=1;
                 }else{
                    System.out.print(c++);
                 }
                 
                }
            System.out.println();
        }
    }
}
