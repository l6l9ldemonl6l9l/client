package story_client.ds.client;

import story_client.ds.entity.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestTest {
    private static final String URL = "http://localhost:8080";
    private static final HttpHeaders headers = new HttpHeaders();
    private static final RestTemplate restTemplate = new RestTemplate();
    private static final HttpEntity<Object> headersEntity = new HttpEntity<>(headers);

    public void testClient() {
        headers.setContentType(MediaType.APPLICATION_JSON);

        //add Foods
        Food small = new Food("Small Food", 5);
        Food medium = new Food("Medium Food", 15);
        Food big = new Food("Big Food", 30);

        addEntity("/food", small);
        addEntity("/food", medium);
        addEntity("/food", big);

        //add Deitys
        Deity deity1 = new Deity("Small Deity", 20);
        Deity deity2 = new Deity("Medium Deity", 15);
        Deity deity3 = new Deity("Big Deity", 30);

        addEntity("/deity", deity1);
        addEntity("/deity", deity2);
        addEntity("/deity", deity3);

        //add Terrains
        Terrain terrain1 = new Terrain("Small Terrain", 5);
        Terrain terrain2 = new Terrain("Medium Terrain", 15);
        Terrain terrain3 = new Terrain("Big Terrain", 30);

        addEntity("/terrain", terrain1);
        addEntity("/terrain", terrain2);
        addEntity("/terrain", terrain3);

        //add FaityAnimals
        FairyAnimal fox = new FairyAnimal("Small FaityAnimal", 5,4);
        FairyAnimal crow = new FairyAnimal("Medium FaityAnimal", 15,30);
        FairyAnimal crow2 = new FairyAnimal("Big FaityAnimal", 30,34);

        addEntity("/fairyanimal", fox);
        addEntity("/fairyanimal", crow);
        addEntity("/fairyanimal", crow2);

    }

    private void addEntity(String path, Object entity) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String entityJson = objectMapper.writeValueAsString(entity);
            HttpEntity<String> entityJsonHttp = new HttpEntity<>(entityJson, headers);
            ResponseEntity<Void> response = restTemplate.postForEntity(URL +
                    path, entityJsonHttp, Void.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}