package class3;

public class E8ShortHandOperators {
    public static void main(String[] args) {
        int number=10;
        number=number+20;//30
        number+=20;//this is a shortcut

        System.out.println(number);

        //*********************************
        int num=10;
        num+=90;//100
        num-=50;//100-50-=>50;
        num=+50;
        num*=2;
        num/=10;

        System.out.println(num);
    }
}
