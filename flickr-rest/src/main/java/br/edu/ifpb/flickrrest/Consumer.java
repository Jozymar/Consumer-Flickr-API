package br.edu.ifpb.flickrrest;

import br.edu.ifpb.flickrrest.model.Photos;
import com.google.gson.Gson;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Consumer {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        // Coloque aqui sua URL
        String photoResourceUrl = "";

        ResponseEntity<String> response
                = restTemplate.getForEntity(photoResourceUrl, String.class);

        Gson g = new Gson();
        Photos photos = g.fromJson(response.getBody(), Photos.class);

        System.out.println("Id da Foto: " + photos.getPhoto().getId());
        System.out.println("Farm da Foto: " + photos.getPhoto().getFarm());
        System.out.println("Nome do Proprietário da Foto: " + photos.getPhoto().getOwner().getUsername());
    }
}
