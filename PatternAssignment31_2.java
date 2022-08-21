public class PatternAssignment31_2 {
    public static void main(String[] args) {
        int row=4;
        for(int i=1;i<=row;i++){
            for(int j=0;j<row;j++){
                System.out.print((i+j)%2);
            }
            System.out.println();
        }
    }
}
