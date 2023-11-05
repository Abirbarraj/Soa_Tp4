package Serveur;


import javax.xml.ws.Endpoint;
import Service.CalculatriceWS;

public class ServeurJWS {
    public static void main(String[] args) {
        // Spécifiez l'URL pour publier le service, par exemple, http://localhost:8084/
        String url = "http://localhost:8084/calculatrice";
        
        // Publiez le service web à l'URL spécifiée
        Endpoint.publish(url, new CalculatriceWS());
        
        System.out.println("Service web CalculatriceWS publié à l'URL : " + url);
    }
}