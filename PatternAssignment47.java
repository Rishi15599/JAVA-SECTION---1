// *****
// *    
// *    
// *****
// *    
// *    
// *****

public class PatternAssignment47 {
    int i=7;
    int j=5;
    public static void main(String[] args) {
        for(int i=1;i<=7;i++){
            for(int j=1;j<=5;j++){
                if(i==1||j==1||i==7){
                    System.out.print("*");
                }
                else if(i==(7+1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }   
    }
}
