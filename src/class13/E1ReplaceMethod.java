package class13;

public class E1ReplaceMethod {
    public static void main(String[] args) {
        String str = "Batch 16 is good batch";
        str = str.replace("good", "Excelent");
       // System.out.println(str.replace("good", "Excelent"));
        System.out.println(str);
        System.out.println(str.replace('e', 'E')); //will replace all the 'e's with capitals one

    }
}
