package class13;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create a String that should be combination of letters, numbers and special characters.
         Find out how many Alphabets(abd AZ 284) characters are there in the String.
         */
        String str = "ABCdefg1234%@!";
       String  str1 = str.replaceAll("[^a-zA-Z]","" );
        System.out.println(str1);//will print anlt alphabts
        System.out.println(str1.length());//will tell how much indexes are there
    }
}