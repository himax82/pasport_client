package org.example;

import org.example.domain.Pasport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Communication {

    @Autowired
    private RestTemplate restTemplate;
    private final String URL = "http://localhost:8080/";

    public List<Pasport> showAll(String path) {

        ResponseEntity<List<Pasport>> responseEntity = restTemplate.exchange(
                URL + path,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Pasport>>() {
                }
        );
        return responseEntity.getBody();
    }

    public void save(Pasport pasport) {
            int id = pasport.getId();
            if (id == 0) {
                restTemplate.postForEntity(URL + "/save",
                        pasport, String.class);
            }
            else {
                restTemplate.put(URL + "/update", pasport);
            }
    }

    public void delete(int id) {
        restTemplate.delete(URL + "/delete?id=" + id);
    }
}
