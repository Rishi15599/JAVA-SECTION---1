// 1
// ab
// 123
// abcd

public class PatternAssignment27 {
 public static void main(String[] args) {
    int row=4;
    
    for(int i=1;i<=row;i++){
        int num=1;
        char c='a';
        for(int j=1;j<=i;j++){
            if(i%2==1){
                System.out.print(num);
            }else{
                System.out.print(c);
            }
            num++;
            c++;
        }
        System.out.println();
    }
 }   
}
