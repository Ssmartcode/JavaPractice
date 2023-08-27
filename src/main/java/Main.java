import java.util.Scanner;

import apps.RandomWinners;
import apps.TossTheCoin;
import apps.CatFacts;

public class Main {
    public static void main(String[] args) {
        RandomWinners randomWinnersApp = new RandomWinners();
        TossTheCoin tossTheCoinApp = new TossTheCoin();
        CatFacts catFactsApp = new CatFacts();

        System.out.println("Please choose one of the options below");
        System.out.println("*** Press (1) for 'Random winners application' ***");
        System.out.println("*** Press (2) for 'Toss the coin application' ***");
        System.out.println("*** Press (3) for 'Get cat facts' ***");
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
            case 1 ->  randomWinnersApp.GetRandomWinners();
            case 2 -> tossTheCoinApp.TossTheCoin();
            case 3 -> catFactsApp.GetCatFact();
            default -> System.out.println("The option is out of range.");
        }
    }
}
