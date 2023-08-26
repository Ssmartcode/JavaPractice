import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        String[] names = {"Suvra", "Razvan", "Andrei", "George", "Luca", "Don", "Sumana", "Ana", "Tanishta"};

        Random rand = new Random();
        int randomNumber = 0;

        List<Integer> winners = new ArrayList<Integer>();

        System.out.println("And the winners are: ");
        for(int i = 0; i <= 2; i++){
            randomNumber = rand.nextInt(0,9);
            while (winners.contains(randomNumber)){
                randomNumber = rand.nextInt(0,9);
            }
            winners.add(randomNumber);

            String separator = i == 2 ? "" : ", ";
            System.out.print(names[randomNumber] + separator);
        }
    }
}
