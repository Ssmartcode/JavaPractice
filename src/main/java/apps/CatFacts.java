package apps;

import models.CatFactsResponse;
import utils.Fetch;

import java.util.Scanner;

public class CatFacts {
    private final Fetch<CatFactsResponse> fetch = new Fetch(CatFactsResponse.class);

    public void GetCatFact() {
        String getNextCatFact = "y";

        while (getNextCatFact.equals("y")) {
            CatFactsResponse catFactsResponse = fetch.get("https://catfact.ninja/fact", 10);
            System.out.println(catFactsResponse.getFact());

            Scanner userInputScanner = new Scanner(System.in);

            System.out.println("Want to see another cat fact?(y/n)");
            getNextCatFact = userInputScanner.next().toLowerCase();
        }
    }
}
