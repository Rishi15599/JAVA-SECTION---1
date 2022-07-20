
//Single inheritance

// parent class
class Number{
    void sum(){    
        int a = 20;
        int b = 30;
        int sum =a+b;
        System.out.println(sum);
}
}
class decimal extends Number{
    void sum1(){
        double x = 4.5;
        double y = 5.5;
        double sum1=x+y;
        System.out.println(sum1);
    }

}
public class inheritanceBasic {
    public static void main(String[] args) {
        decimal A=new decimal();
        
        A.sum();
        A.sum1();
    }
}
    
