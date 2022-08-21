public class PatternAssignment23 {
    public static void main(String[] args) {
        int row=5;
        int num=1;
        for(int i=1;i<=row-1;i++){
            for(int j=1;j<=row;j++){
                
                System.out.print(num++);
                if(num>9){
                    num=1;
                }
            }
            System.out.println();
        }
    }
}
