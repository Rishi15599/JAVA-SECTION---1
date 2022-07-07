public class MultipleSwitch{
    public static void main(String[] args) {
        char grade = 'Z';
        switch('Y') {
            case 'X' :
            System.out.println("Good");
            break;
            case 'Y' :
            System.out.println("Well done");
            break;
            case 'Z' :
            default:
            System.out.println("Very good");
        }
        System.out.println(grade);

        
    }
}
