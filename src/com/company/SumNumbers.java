package com.company;

public class SumNumbers {

    int[] arr = {12,23,34,45,56,67,78,89};
    int sum = 0;

    public void sumNum(){
        for(int i:arr){
            sum+=i;
        }
        System.out.println(sum);
    }

}
