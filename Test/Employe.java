

public class Employe {
    public void employeName(){
        System.out.println("Employe Name : "+"Rishi");
    }
    public void gender(){
        System.out.println("Gender : "+"Male");
    }
    public void salary(){
        System.out.println("Salary : "+"50000");
    }
    public void address(){
        System.out.println("Address : "+"Patna");
    }
    public static void main(String[] args) {
        Employe a=new Employe();
        a.employeName();
        a.gender();
        a.salary();
        a.address();
    }
}
