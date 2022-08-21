public class PatternAssignment29 {
    public static void main(String[] args) {
        int row=4;
        int num=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num++);
                if(num>5){
                    num=1;
                }
            }
            System.out.println();
        }
    }
}
