package baseline;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Solution43 {
    private static final Scanner in = new Scanner(System.in).useDelimiter("\n");

    private static String readFromUser(String prompt) {
        System.out.println(prompt);
        //take in the password from the user
        return in.next();
    }
    public static void main(String[] args) throws IOException {
        /*
         *  UCF COP3330 Fall 2021 Assignment 4 Solutions 43
         *  Copyright 2021 Alexys Veloz
         */
        /*So in this one we're gonna take in two strings, where we take in whatever they send us.
        then we'll take in another two strings, either y or n, and if they don't say those two, we repeat.
        we repeat. then in another class we create the folder and any additional folders we need
         */

        //take in a string and prompt for website name
        String websiteName = readFromUser("What's going to be the name of the website?");
        //take in a string and prompt for the author
        String author = readFromUser("And who is going to be the author of this website?");

        //take in a string, prompting for javascript files
        String javaScript = readFromUser("Do you want a folder for Javascript? (y/n)");
        javaScript = javaScript.toLowerCase();
        //while that string doesn't equal y or n,  repeat question
        while(!javaScript.equals("y") && !javaScript.equals("n"))
        {
            javaScript = readFromUser("please use only y or n. Try again.");
            javaScript = javaScript.toLowerCase();
        }

        //take in a string, prompting for css files
        String css = readFromUser("Do you want a folder for css? (y/n)");
        css = css.toLowerCase();
        //while that string doesn't equal y or n,  repeat question
        while(!css.equals("y") && !css.equals("n"))
        {
            css = readFromUser("please use only y or n. Try again.");
            css = css.toLowerCase();
        }

        //send it to another class
        new SiteCreator(websiteName,author,javaScript,css);
    }
}
