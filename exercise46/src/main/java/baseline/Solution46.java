package baseline;

import java.io.FileNotFoundException;

public class Solution46 {

    private static String lowerCaseIt(String[] input){
        //turn it into a string and use .toLowerCase
        //return the string
        return  null;
    }

    public static void main(String[] args) throws FileNotFoundException {
        /*
         *  UCF COP3330 Fall 2021 Assignment 4 Solutions 46
         *  Copyright 2021 Alexys Veloz
         */
        /* okay so the goal for this one is to take in a input.txt as a string and then sanitize it here
        so that it's all lowercase since words are the same lowercase or uppercase. Then I'll send it to another
        class in which it breaks up the string to many strings in which each word is a seperate string in the arraylist
        How I'll figure that out idk but that's the goal. then we'll have two counters, lets go with i and k.
        in a function, we'll have i go from 0 to the size of the arraylist. and k to go from 0  to i.
        If the arraylist.get(i) is equal to arraylist.get(k)  we'll have a  counter go up in an int array[i] and somehow
        keep an eye on the word by using what i element it is. Then once that's done I'll have a sort function where
        it copies the int array, and sorts it. Then in the print function using a 2 for loops, an i and k,
        I use sortedarray[i] and find a array[k] that matches the number, and whatever that is, I print arraylist.get(k)
        and *'s equal to whatever number sorteredarray equals. Its nasty goblin code that I'm sure can be cleaned up
        but I'm bad at coding--I didn't pass the foundation exam
         */

        //make a string[] to hold the input
        String[] input;

        //take in the  input.txt, using the try, do, and catch to make sure everything works

        //also use a while to make sure it continues after the delimiter

        //while there is more to read
        //put it into a arrayList

        //put in the catch


        //send it to a function to turn the entire String[] lowercase
        String lowerInput = lowerCaseIt(input);

        //send it to a class to count, sort, and print the histogram
        WordCounter userwords = new WordCounter(lowerInput);

    }
