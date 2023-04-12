package class2;

public class FacebookExample {
    public static void main(String[] args) {
        String firstName="Oksana";
        String lastName="Zadvorna";
        String mobileNumber="(571)421-9775";
        /* using int for mobile number can lead to issues
        int mobileNumber=098-9089;
        System.out.println(mobileNumber);
         */
        String password="kvfjnad6346";
        int dayOfMonth=7;
        String month="March";
        int year=2023;
        String gender="Female";

        System.out.println(firstName+" "+lastName);
        System.out.println(mobileNumber);
        System.out.println(password);
        System.out.println(dayOfMonth+" "+month+" "+year);
        System.out.println(gender);


    }
}
