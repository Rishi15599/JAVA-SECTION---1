//by using reference variable

public class Employee {
    String name;
    String Gender;
    int Salary;
    String Address;
    public static void main(String[] args) {
        Employee a=new Employee();
        a.name="Raju";
        a.Gender="Male";
        a.Salary=50000;
        a.Address="Patna";
        System.out.println(a.name+" "+a.Gender+" "+a.Salary+" "+a.Address);
    }
}
