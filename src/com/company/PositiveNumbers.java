package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PositiveNumbers {

//    public void getNumbers(){
//        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
//
//        int j = 0;
//        ArrayList<Integer> inputArr = new ArrayList<Integer>();
//        System.out.println("Enter 7 values: ");
//
//        while(j < 7){
//
//            try {
//                int input = Integer.parseInt(console.readLine());
//                inputArr.add(input);
//            }
//            catch(Exception e){
//                System.out.println(e);
//            }
//
//            j++;
//        }
//
//        getPositive(inputArr);
//    }

    public void getPositive(ArrayList<Integer> inputArr){

        ArrayList<Integer> posArr = new ArrayList<Integer>();
        for(int i: inputArr){
            if(i > 0){
                posArr.add(i);
            }
        }

        System.out.println("Positive Numbers: ");
        for(int i:posArr){
            System.out.println(i);
        }


    }

}
