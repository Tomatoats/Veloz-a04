package baseline;

import com.google.gson.Gson;
import com.google.gson.JsonArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Solution44 {
    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 4 Solutions 44
         *  Copyright 2021 Alexys Veloz
         */
     /*So for this one we're gonna take in a .json file and read
     in the file using Gson parser. Then we'll take in the
     name, price, and quantity, then in the next class we're gonna use a scanner
     in which it asks for user for the product name. If the product ddoesn't
     exist, it tells us to ask again. Once they find a product name, print out
     name, price, and quantity
      */

        //we're gonna put it all in an arrayList cause i'm a rat bastard like that
        //ArrayList<String> products = new ArrayList<>();
        //initialize Gson
        Product p1;
        Product p2;
        Product p3;
        try {

            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get("data/exercise44_input.json"));
            Map<?, ?> map = gson.fromJson(reader, Map.class);
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                entry.getKey();
                entry.getValue();
            }
            reader.close();

            //have it read in on what Products are
            //convert JSON Strings to the arrayList

        }
         catch (IOException | NoSuchElementException | IllegalStateException e)
        {
            e.printStackTrace();
        //send to another class

        new inventoryManager();
        }
    }
}
