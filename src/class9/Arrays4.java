package class9;

public class Arrays4 {
    public static void main(String[] args) {
        /*
        create an array of Strings and store 5 names in that array
        print all the names from that array with the help of
         a 'for' loop and 'while' loop
         */

        String names [] = {"Alex", "Peter", "Bob", "Erica", "Eva"};
        for( int i=0; i< names.length; i++){
            System.out.println(names[i]);
        }

        String names2 [] = {"Alex", "Peter", "Bob", "Erica", "Eva"};
        int counter=0;
        while(counter< names2.length){
            System.out.println(names2[counter]);
            counter++;
        }


    }
}
