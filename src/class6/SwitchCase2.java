package class6;

public class SwitchCase2 {
    public static void main(String[] args) {
        char gender = 'F';

        switch (gender){
            case 'F':
                System.out.println("Female");
                break;
            case 'M':
                System.out.println("Male");
                break;
            case '0':
                System.out.println("other");
                break;
            default:
                System.out.println("no output");
        }
    }
}
