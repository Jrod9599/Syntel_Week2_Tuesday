package com.company;

import javax.crypto.Cipher;
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

    public String leetCode(String s){

        char[] charS = s.toCharArray();
        String temp = "";

        for(int i = 0; i < s.length(); i++){

            switch(charS[i]){
                case 'A': case 'a':
                    temp+='4';
                    break;
                case 'E': case 'e':
                    temp+='3';
                    break;
                case 'G': case 'g':
                    temp+='6';
                    break;
                case 'I': case 'i':
                    temp+='1';
                    break;
                case 'O': case 'o':
                    temp+='0';
                    break;
                case 'S': case 's':
                    temp+='5';
                    break;
                case 'T': case 't':
                    temp+='7';
                    break;
                    default:
                        temp+=charS[i];
            }
        }

        return temp;
    }
    public void caesarCipherSwitch(String word){

        char[] wordArray = word.toLowerCase().toCharArray();
        String temp = "";
        int shiftValue = 13;
        int shift;
        int num;

        for(int i = 0; i < wordArray.length; i++) {
            num = (int)wordArray[i];
            if (97 <= num && num <= 122){
                  if((num + shiftValue) > 122){
                      temp += (char)(97 + ((num+shiftValue) - 123));
                  }
                  else{
                      temp += (char)(num+ shiftValue);
                  }
            }
            else
                temp += wordArray[i];
        }
        System.out.println(temp);
    }
}
