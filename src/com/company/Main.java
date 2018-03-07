package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
	    // Sum Numbers
        SumNumbers one = new SumNumbers();
        one.sumNum();

        //Largest Number, which calls positive Numbers
        LargestNumber two = new LargestNumber();
        two.largeNum();

        //PositiveNumbers three = new PositiveNumbers();
        //three.getNumbers();

        //Phonebook
        Phonebook four = new Phonebook();
        four.getNum("Elizabeth");
        four.addPerson("Kareem", "938-489-1234");
        four.removePerson("Alice");
        four.changeNum("Bob", "968-345-2345");
        four.printPhonebook();

        //Concatinating
        ConcatStrings five = new ConcatStrings();
        String str1 = "Java";
        String str2 = "Programming";
        five.concat(str1, str2);

        //Finding the length of a String
        String str3 = "ABcdeF";
        five.findLength(str3);

        //Upper and lower casing strings

        System.out.println(five.upCase(str3));
        System.out.println(five.lowCase(str3));

        //Find Me

        five.findMe("Noelle");
        five.findMe("Jake");
        five.findMe("NaDario");
        five.findMe("Dina");

        try{
            five.crawlingFriday(console.readLine());
            five.reverseString(console.readLine());
            System.out.println(five.leetCode("Leet speak"));
            System.out.println(five.leetCode("Sign up for our park newsletter and we’ll let you know immediately if you’ve won two tickets to Six Flags!"));


        }catch (Exception e){}

        five.caesarCipherSwitch("dina");
    }
}
