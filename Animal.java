public class Animal {
    
    public void eat(){
    System.out.println(" I am eating ");
    }
    public static void main(String[] args) {
        Animal dog=new Animal();
        dog.eat();
        
        Animal cat=new Animal();
        cat.run();

        Birds parrot=new Birds();
        parrot.fly();
        
    }
    public void run(){
        System.out.println(" I am runing ");
    }
    
}
class Birds{
    public void fly(){
        System.out.println(" I am Flying");
    }


}