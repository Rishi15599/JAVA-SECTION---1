//1
//4 9
//16 25 36
//49 64 81 100





public class PatternAssignment43 {
    public static void main(String[] args) {
        int row=4;
        int num=1;
        int num1=num;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print((num++)*(num1++));
            }
            System.out.println();
        }
    }
}
