package class12;

public class E11StringDemo {
    public static void main(String[] args) {
        //please check the index of the character

        String name = "Today is Saturday";
        System.out.println(name.indexOf('i'));
        System.out.println(name.indexOf('a'));// will find the first one
        System.out.println(name.indexOf('a', 4)); //will ignore everything before and start searching after index #4

        //print all of the 'a' indexes

        System.out.print(name.lastIndexOf('a'));
        
    }
}
