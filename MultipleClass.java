class Example 
{
    int a,b,total;
    void add()
    {
        total = a+b;

    }
}
public class MultipleClass {
    public static void main(String[] args) {
        Example obj = new Example();
        obj.a = 100;
        obj.b = 200;
        obj.add();
        System.out.println("Addtion = "+obj.total);

        
    }

}
