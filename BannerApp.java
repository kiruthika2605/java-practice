package com.bannerapp;

public class BannerApp {

    public static void main(String[] args) {

        String text = "OOPS";

        String[] banner = {
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"),
                String.join("", "*", " ", " ", " ", " ", " ", " ", " ", " ", "*"),
                String.join("", "*", " ", text, " ", " ", " ", " ", " ", "*"),
                String.join("", "*", " ", " ", " ", " ", " ", " ", " ", " ", "*"),
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"),
                String.join("", " "),
                String.join("", "**********")
        };

        // Enhanced for loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}