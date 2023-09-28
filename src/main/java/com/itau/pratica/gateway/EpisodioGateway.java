package com.itau.pratica.gateway;

import com.itau.pratica.DTO.EpisodioDTO;
import com.itau.pratica.Response.EpisodioResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
public class EpisodioGateway {

    private final String apiUrl = "https://rickandmortyapi.com/api/episode";
    private RestTemplate restTemplate = new RestTemplate();

    public List<EpisodioDTO> getEpisodios() {

        EpisodioResponse episodioResponse = restTemplate.getForObject(apiUrl, EpisodioResponse.class);
        return episodioResponse.getResults();

    }
}

