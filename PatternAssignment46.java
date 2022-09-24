//     *
//    * 
//   *  
//  *
// * 

public class PatternAssignment46 {
    int i=5;
    int j=5;
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i+j==6){
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
