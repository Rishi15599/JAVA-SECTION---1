public class PatternAssignment31 {
    public static void main(String[] args) {
        int row=4;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row+2;j++){                
                if((i+j)%2==1) {
                    System.out.print("0");
                }  else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
