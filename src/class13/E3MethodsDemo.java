package class13;

public class E3MethodsDemo {
    public static void main(String[] args) {
        String str = "jkbvhsKGFDHDKNdb567384$$$59op";
        System.out.println(str.replaceAll("[^a-z]", ""));//will remove lower case letters if nothing is specified in replacement
        // " ^ "  will tell Java to replace everything else except lower cases a-z; it works like ! operator
        System.out.println(str.replaceAll("[^a-z0-9]", ""));
        System.out.println(str.replaceAll("[A-Z]", "\\$"));


    }
}
