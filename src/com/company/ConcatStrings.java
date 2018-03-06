package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConcatStrings {
    String[] students ={"Dina", "Shane", "NaDario", "Amber", "Calder", "Noelle", "Donell"};




    public void concat(String s1, String s2){
        String builder = s1 + " " + s2;
        System.out.println(builder);
    }

    public void findLength(String word){
        System.out.println(word.length());
    }

    public String upCase(String word){
        return word.toUpperCase();
    }

    public String lowCase(String word){
        return word.toLowerCase();
    }


    public void findMe(String strArrayItem){
        int count = 0;
        boolean found = false;
        for (String i: students) {
            String lowCaseStrArray = lowCase(strArrayItem);
            String lowCaseI = lowCase(i);
            if(lowCaseStrArray.equals(lowCaseI)){
                System.out.println("Found at " + count);

                found = true;
            }
            count++;
        }
        if(!found){
            System.out.println("NOT IN LIST");
        }
    }

    public void crawlingFriday(String cFriday){

        String str7= "";
        char[] char7 = cFriday.toCharArray();

        for (int i=0;i<char7.length;i++){

            str7+=char7[i];
            System.out.println(str7);

        }
    }

    public void reverseString (String rString){

        String str8 = "";
        char[] char8 = rString.toCharArray();
        for(int i=char8.length-1;i>=0;i--){
            str8 = str8 + char8[i];

        }
        System.out.println(str8);
    }
}
