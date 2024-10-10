package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        do {
            try {
                System.out.println("Goldilocks");
                System.out.println("Hansel and Gretel");
                System.out.println("Mary had a little lamb");
                String userInput = Console.PromptForString("Please choose a story from the choices above: ");
                userInput = (userInput.toLowerCase()).replace(' ', '_');
                FileInputStream fis = new FileInputStream(userInput + ".txt");
                Scanner scanner = new Scanner(fis);
                int lineNumber = 1;
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    System.out.println(lineNumber + ": " + line);
                    lineNumber++;
                }
                scanner.close();
                break;
            } catch (Exception e) {
                System.out.println("File Not found");
            }
        }while(true);
    }


    public static String getStory(){
        System.out.println("1 - Goldilocks");
        System.out.println("2 - Hansel and Gretel");
        System.out.println("3 - Mary had a little lamb");
        String userInput = Console.PromptForString("Please choose a story from the choices above: ");
        do{
            if (Objects.equals(userInput, "1") || userInput.equalsIgnoreCase("Goldilocks")){
                return "goldilocks.txt";

            }else if(Objects.equals(userInput, "2") || userInput.equalsIgnoreCase("Hansel and Gretel")){
                return "hansel_and_gretel.txt";

            }else if (Objects.equals(userInput, "3") || userInput.equalsIgnoreCase("Mary had a little lamb")){
                return "mary_had_a_little_lamb.txt";

            }else{
                userInput = Console.PromptForString("Story not available, PLease choose an option from the list provided: ");
            }

        }while(true);
    }
}

