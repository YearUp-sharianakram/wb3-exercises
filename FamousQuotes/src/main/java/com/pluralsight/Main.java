package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        String[] quotes = {
                "Dream big, act bigger",
                "Progress, not perfection, is key",
                "Believe you can, and you will",
                "Every step forward counts",
                "Stay focused, stay strong",
                "Your only limit is you",
                "Embrace challenges, they help you grow",
                "Small steps lead to big changes",
                "Be the change you seek",
                "Today’s effort builds tomorrow’s success"

            };
        do {
            try {
                int number = Console.promptForInt("Select a number from 1 - 10 to receive a quote: ");
                number--;

                System.out.println(quotes[number]);
            } catch (Exception e) {
                System.out.println("This quote is unavailable");
             //   System.out.println(e.getMessage());
            }
            boolean repeat = Console.PromptForYesNo("Would you like to select a quote again?");
            if(!repeat){
                break;
            }
        }while (true);
    }
}