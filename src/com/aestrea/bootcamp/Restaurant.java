package com.aestrea.bootcamp;

import java.util.ArrayList;

public class Restaurant {
    /**
     *
     * Prints the menu/submenu for our restaurant based on passed args
     *
     *
     * @param args
     */
    public void printMenu(String[] args) {
        if(args.length>0){
            //dito na yung mga pagpipilian
            if(args[0].equals("Seafood")){
                printSeafood();
            } else if(args[0].equals("Meat")){
                printMeat();
            } else if(args[0].equals("Appetizers")) {
                printAppetizers();
            } else {
                System.out.println("Error! no matched keyword for "+args[0]);
            }
        } else {
            printMenuCategories();
        }
    }

    private void printMenuCategories() {
        System.out.println("Seafood");
        System.out.println("Meat");
        System.out.println("Appetizer");
    }

    private void printAppetizers() {
        System.out.println("Chicaron Bulaklak");
        System.out.println("Calamares");
    }

    private void printMeat() {
        System.out.println("Steak");
        System.out.println("Sinigang");
        System.out.println("Breaded Pork");
    }

    private void printSeafood() {
        System.out.println("Crab");
        System.out.println("Lobster");
        System.out.println("Shrimp");
    }
}
