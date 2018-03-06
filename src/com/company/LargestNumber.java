package com.company;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.BufferedReader;


public class LargestNumber {

    public void largeNum(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        //prompt for input

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter 7 values: ");
        int j = 0;
        while(j < 7){
            try {
                int input = Integer.parseInt(console.readLine());
                arr.add(input);
            }
            catch(Exception e){
                System.out.println(e);
            }
            j++;
        }

        System.out.println("Largest Number: " + Collections.max(arr));
        PositiveNumbers temp = new PositiveNumbers();
        temp.getPositive(arr);
    }

}
