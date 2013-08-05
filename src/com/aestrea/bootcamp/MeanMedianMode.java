package com.aestrea.bootcamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MeanMedianMode {


    /**
     *
     *         List<String> userInput = new ArrayList<String>();
     int sum;
     userInput = Arrays.asList(args);
     List<Integer> userNumberInput = new ArrayList<Integer>();
     for(String s : userInput) userNumberInput.add(Integer.valueOf(s));
     for(Integer i : userNumberInput) {
     //intList.add(Integer.valueOf(s));
     sum += i;
     }
     * Prints the mean, median and mode for a list of string arguments that are numbers
     *
     * @param args
     */
    public void findMeanMedianMode(String[] args) {
        ArrayList<Integer> userInput = new ArrayList<Integer>();
        userInput = convertStringArgsToInteger(args);

        System.out.println("Mean: "+findMean(userInput));

        /**
         * Assuming the array x is sorted and is of length n:

         If n is odd then the median is x[(n-1)/2].
         If n is even than the median is ( x[n/2] + x[(n/2)-1] ) / 2.
         */
        Collections.sort(userInput);
//        for(int i=0;i<userInput.size();i++){
//            System.out.print(userInput.get(i));
//        }
        System.out.println("Median: "+findMedian(userInput));

//
    }

    private int findMedian(ArrayList<Integer> userInput) {
        boolean isEven = (userInput.size() % 2) == 0;

        if(isEven){
            int upper = userInput.get(userInput.size()/2-1);
            int lower = userInput.get(userInput.size()/2);
            return (upper + lower) / 2;
        } else {
            return userInput.get((userInput.size()+1)/2-1);
        }
    }

    private int findMean(ArrayList<Integer> userInput) {
        int mean;
        int sum = 0;
        for(int j=0;j<userInput.size();j++){
            sum += userInput.get(j);
        }
        mean = sum / userInput.size();
        return mean;
    }

    private ArrayList<Integer> convertStringArgsToInteger(String[] args) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        if(args.length>0){
            for(int i=0;i<args.length;i++){
                temp.add(Integer.parseInt(args[i]));
            }
        }
        return temp;
    }
}
