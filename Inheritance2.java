class MainSalary{
    //public static void M(){
        int salary =2000;
{
System.out.println("Main salary for every emp = "+salary);
}
}
class Fulltime extends MainSalary{
    //public static void F(){
    int fullTimeTotalSalary= salary +((salary*50)/100);
    {
    System.out.println("After increment full time emp salary = "+fullTimeTotalSalary);
    }
}
class HalfTime extends Fulltime{
    //void halfTimeSalary(){
        int halfTimeTotalSalary= (fullTimeTotalSalary/2);
        {
        System.out.println("After increment half time emp salary = "+halfTimeTotalSalary);
        }
        }
public class Inheritance2{
public static void main(String[] args) {
    //Fulltime fte = new Fulltime();
    //fte.fullTimeTotalSalary
    HalfTime hte = new HalfTime();
    //hte.halfTimeSalary();

}

}