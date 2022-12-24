
//Create a class named Shape with a method to print "This is THis is shape".
//THen create two other classes named Rectangle ,Circle inheriting the Shape
//class both having a methode to print This is rectangular shape and This is 
//square of Rectangle having a methode to print Square is a rectangle Now call
//the methode of Shape and Ractangle class by the object of Square class.


class Shape{
    void printShape(){
        System.out.println("This is the Shape");
    }
}
class Rectangle extends Shape{
    void printRectangle(){
        System.out.println("This is the Rectangle Shape");
    }
}
class Circle extends Shape{
    void printCircle(){
        System.out.println("This is the Circle Shape");
    }
}
class Square extends Rectangle{
    void printSquare(){
        System.out.println("Square is Rectangle");
    }
}

public class Test17 {
    public static void main(String[] args) {
        Square sq= new Square();
        sq.printRectangle();
        sq.printShape();
        sq.printSquare();
        Circle cr=new Circle();

        cr.printCircle();
    }
}
