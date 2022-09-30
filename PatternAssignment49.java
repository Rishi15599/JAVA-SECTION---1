public class PatternAssignment49 {
    int i=10;
    int j=10;
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                if(i==1||j==1||(i==10&&j<=(10+1)/2)||(i==(10+1)/2&&j>=(10+1)/2)||(i>=(10+1)/2&&j==10)||(i>=(10+1)/2&&j==(10+1)/2)){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }   
    }
}
