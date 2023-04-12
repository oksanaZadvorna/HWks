package com.syntax.reviewClasses;

public class SwitchStatement {
    public static void main(String[] args) {
        String color = "red";

        switch (color.toLowerCase()){
            case "red":
                System.out.println("stop");
                break;
            case "orange":
                System.out.println("Yield");
                break;
            case "green":
                System.out.println("Go");
                break;
        }
    }
}
