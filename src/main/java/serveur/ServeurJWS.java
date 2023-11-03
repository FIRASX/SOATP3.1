package serveur;

import jakarta.xml.ws.Endpoint;
import service.Calculatrice;

public class ServeurJWS {
    public static void main(String[] args) {
        String url = "http://localhost:8084/";
        System.out.println("Le service est publié à l'adresse : " + url);
        Endpoint.publish(url, new Calculatrice());
    }
}
