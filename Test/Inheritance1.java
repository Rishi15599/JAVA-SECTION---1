//Malti layer inheritance

// parent class
class Book{
    void prakashan1(){
        System.out.println("'R.K.Singh' is writer of Book.");
    }

}
//child class
class Math extends Book{
    void prakashan2(){
        System.out.println("'Bhagat' is writer of Math.");
    }
}
//child class
class English extends Math{
    void prakashan3(){
        System.out.println("'Gupta' is writer of English.");
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        English A=new English();
        A.prakashan1();
        A.prakashan2();
        A.prakashan3();
        
    }
}
