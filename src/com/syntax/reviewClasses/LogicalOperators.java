package com.syntax.reviewClasses;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean loginButtonDisplay=true;
        boolean loginClick=true;

        if(loginButtonDisplay && loginClick){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }

        boolean confirmSelected=false;
        if(!confirmSelected){
            System.out.println("Let's click on confirm checkbox");
        }
        System.out.println("Click on Pay button");
    }
}
