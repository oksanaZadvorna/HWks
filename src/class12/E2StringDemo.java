package class12;

import java.nio.charset.StandardCharsets;

public class E2StringDemo {
    public static void main(String[] args) {
        //write code to check the user name and password
        //if password is less than 8 chars then this message is printed "Sign up is successful"
        //otherwise "User name and password can't be more that 8 chars"

        String username = "admin";
        String password = "Pass123";
        System.out.println(username.length());
        System.out.println(password.length());

        if(username.length()>8 && password.length()>8){
            System.out.println("Username and password cannot be more than 8");
        }else{
            System.out.println("Sign up is successful");
        }



    }
}
