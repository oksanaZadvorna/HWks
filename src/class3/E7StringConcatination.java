package class3;

public class E7StringConcatination {
    public static void main(String[] args) {
        String firstName="Leo";
        String lastName="Neo";
        String fullName=firstName+lastName;
        String text=firstName+10;

        System.out.println(fullName);
        System.out.println(text);
        //Java reads top to the botton, and left to right;
        System.out.println("Leo"+10+10);
        //due to parentesis, the math operation will happen first
        System.out.println("Leo"+(10+10));
        System.out.println(10+10+"Leo");
        //left to right rule is not applicable to Math, here math rules work first multipl, then add
        System.out.println(2+2*2);
        //here addition will take place first
        System.out.println((2+2)*2);
    }
}
