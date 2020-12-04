package com.fauziallagan.javaLearningProject;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner inputUser = new Scanner(System.in);
        String userOption;
        boolean isNext = true;
        while (isNext){
            clearScreen();
            System.out.println("==============================");
            System.out.println("Welcome to Sirius Food Project");
            System.out.println("==============================");
            System.out.println("1. \tMakanan");
            System.out.println("2. \tMinuman");
            System.out.println("3. \tdessert");

            System.out.print("\n\nPilihan Anda : ");
            userOption = inputUser.next();

            switch (userOption) {
                case "1" -> Food.fastFood();
                case "2" -> Drink.drink();
                case "3" -> Dessert.dessert();
                default -> System.err.println("\nError! Try Again!");
            }


            isNext = getChoice("Apakah Anda Ingin Melanjutkan ");

        }

    }
    public static boolean getChoice(String message){
        Scanner inputUser = new Scanner(System.in);
        System.out.print("\n" + message + "(y/n) ? ");
        String userOption = inputUser.next();
        while (!userOption.equalsIgnoreCase("y") && !userOption.equalsIgnoreCase("n")){
            System.err.println("Wrong Choice! Try Again!");
            System.out.print("\n" + message + "(y/n) ? ");
            userOption  = inputUser.next();
        }
        return userOption.equalsIgnoreCase("y");

    }
    public static void clearScreen(){
        try{
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }else {
                System.out.print("\n033\143");
            }
        }catch (Exception ex){
            System.err.println("Not Supported!");
        }
    }

}
