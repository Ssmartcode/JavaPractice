package apps;

import java.util.Random;
import java.util.Scanner;

public class TossTheCoin {

    public void TossTheCoin() {
        String keepTossing = "y";
        Random randomGenerator = new Random();


        while (keepTossing.equals("y")) {
            String headOrTails = randomGenerator.nextInt(2) == 0 ? "heads" : "tails";
            System.out.println("Your side of the coin is: " + headOrTails);

            Scanner userInputScanner = new Scanner(System.in);

            System.out.println("Want to toss the coin again?(y/n)");
            keepTossing = userInputScanner.next().toLowerCase();
        }

    }
}
