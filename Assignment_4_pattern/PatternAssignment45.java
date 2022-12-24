// *    
//  *   
//   *  
//    * 
//     *
public class PatternAssignment45 {
    int i=5;
    int j=5;
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==j){
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
