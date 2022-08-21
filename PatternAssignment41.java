public class PatternAssignment41 {
    public static void main(String[] args) {
        int row=9;
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=row;j++)
            {
                if(i<(row/2+1))
                {
                    if(j==1 || i+j==row/2+2)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }else
                {
                    if(j==1 || i==j+row/2)
                    {
                    System.out.print("*");
                    }
                    else
                    {
                    System.out.print(" ");
                    }
                }
            }
            System.out.println();

        }
    }
}
