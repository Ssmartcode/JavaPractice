import java.util.Scanner;

import apps.RandomWinners;


public class Main {
    public static void main(String[] args) {
        RandomWinners randomWinnersApp = new RandomWinners();

        System.out.println("Please choose one of the options below");
        System.out.println("*** Press (1) for 'Random winners application' ***");
        int userOption = 0;

        while (userOption == 0) {
            Scanner userInputScanner = new Scanner(System.in);
            try {
                userOption = userInputScanner.nextInt();
                System.out.println();
            } catch (Exception e) {
                System.out.println("Your option is not valid. Please try again.");
            }
        }

        switch (userOption) {
            case 1 -> {
                randomWinnersApp.GetRandomWinners();
            }
            default -> System.out.println("The option is out of range.");
        }
    }
}
