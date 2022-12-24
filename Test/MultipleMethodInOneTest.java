public class MultipleMethodInOneTest {
    public void display() { // method with no parameters
        System.out.println("display() method with no parameter");
     }
     public void display(String name) { // method with a single parameter
        System.out.println("display() method with a single parameter");
     }
     public void display(String firstName, String lastName) { // method with multiple parameters
        System.out.println("display() method with multiple parameters");
     }
     public static void main(String args[]) {
        MultipleMethodInOneTest test = new MultipleMethodInOneTest();
        test.display();
        test.display("raja");
        test.display("raja", "ramesh");
     }
}
