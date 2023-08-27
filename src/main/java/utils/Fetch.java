package utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import static java.time.temporal.ChronoUnit.SECONDS;

public class Fetch<T> {
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final Class serializeClass;

    public Fetch(Class serializeClass) {
        this.serializeClass = serializeClass;
    }

    public T get(String uri, int duration) {
        HttpResponse<String> response;

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(uri))
                    .timeout(Duration.of(duration, SECONDS))
                    .GET()
                    .build();
            response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return (T) objectMapper.readValue(response.body(), this.serializeClass);


        } catch (Exception e) {
            System.out.println("Something went wrong when getting the fact. Meow :(");
            System.out.println(e);

            throw new Error("Something went wrong when getting the cat fact. Please try again.");
        }
    }
}
