public class PatternAssignment20 {
    public static void main(String[] args) {
        int num=1;
        char c='a';
        int row=4;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                if(i%2==1){
                    System.out.print(num++);
                   
                }
                else{
                    System.out.print(c++);
                   
                }
                
            }
            
            System.out.println();
        }
        
    }
}
