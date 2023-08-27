package apps;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomWinners {
    private final String[] names = {"Suvra", "Razvan", "Andrei", "George", "Luca", "Don", "Sumana", "Ana", "Tanishta"};

    public void GetRandomWinners() {
        Random rand = new Random();
        int randomNumber;

        List<Integer> winners = new ArrayList<Integer>();

        System.out.println("And the winners are: ");
        for (int i = 0; i <= 2; i++) {
            randomNumber = rand.nextInt(0, 9);
            while (winners.contains(randomNumber)) {
                randomNumber = rand.nextInt(0, 9);
            }
            winners.add(randomNumber);

            String separator = i == 2 ? "" : ", ";
            System.out.print(names[randomNumber] + separator);
        }
    }
}
