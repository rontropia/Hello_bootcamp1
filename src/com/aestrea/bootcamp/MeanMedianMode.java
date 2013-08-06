package com.aestrea.bootcamp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MeanMedianMode {
    /**
     *
     * Prints the mean, median and mode for a list of string arguments that are numbers
     *
     * @param args
     */
    public void findMeanMedianMode(String[] args) {
        ArrayList<Integer> userInput = new ArrayList<Integer>();
        userInput = convertStringArgsToInteger(args);

        System.out.println("Mean: "+findMean(userInput));
        Collections.sort(userInput);
        System.out.println("Median: "+findMedian(userInput));

        System.out.println("Mode: "+findMode(userInput));
    }

    /**
     *
     * @param userInput
     * @return
     */

    private static ArrayList findMode(ArrayList<Integer> userInput) {
        HashMap<Integer, Integer> seen = new HashMap();
        ArrayList<Integer> modeElements = new ArrayList<Integer>();
        int max = 0;

        for(int i=0;i<userInput.size();i++){
            if (seen.containsKey(userInput.get(i))){
                seen.put(userInput.get(i), seen.get(userInput.get(i))+1);
            } else {
                seen.put(userInput.get(i),1);
            }
            if (seen.get(userInput.get(i)) > max) {
                max = seen.get(userInput.get(i));
                modeElements.clear();
                modeElements.add(userInput.get(i));
            } else if (seen.get(userInput.get(i)) == max) {
                modeElements.add(userInput.get(i));
            }
        }
        return modeElements;
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
