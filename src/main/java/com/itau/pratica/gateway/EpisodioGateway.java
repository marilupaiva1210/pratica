package com.itau.pratica.gateway;

import com.itau.pratica.DTO.EpisodioDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class EpisodioGateway {

    private final String EPISODE_URL = "https://rickandmortyapi.com/api/episode";
    private RestTemplate restTemplate = new RestTemplate();

    public EpisodioDTO getEpisodio() {

        EpisodioDTO episodio = restTemplate.getForObject(EPISODE_URL, EpisodioDTO.class);

        return episodio;
    }
}
