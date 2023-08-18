package application;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Main {

	public static void main(String[] args) {
		try {
			HttpClient client = HttpClient.newHttpClient();// Creation HTTP client
			// Préparation de la requete HTTP
			HttpRequest request = HttpRequest.newBuilder()
					  .uri(new URI("http://localhost:8080/articles"))
					  .GET()
					  .build();
			// L'envoir de la requete HTTP et reception de la reponse
			HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
			// affichage du body de la reponse
			System.out.println(response.body());
		} catch (URISyntaxException | IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
