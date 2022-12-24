/*Logical AND Operator */
public class Test10 {
    public static void main(String[] args) {
        System.out.println("Logical AND Operator ");
        System.out.println((10>2) && (5>3)); //true
        System.out.println((10>5) && (5<3)); //false
        System.out.println((10<5) && (5<3)); //false



/*Logical OR Opreter */
        System.out.println("Logical OR Opreter ");
        System.out.println((10>2) || (5>3));  //true
        System.out.println((10>5) || (5<3));  //true
        System.out.println((10<5) || (5<3));  //false


/*Logical NOT Opreter */
        System.out.println("Logical NOT Opereter");
        System.out.println(!(5<10));  //false
        System.out.println(!(5>10));  //true

    }
}