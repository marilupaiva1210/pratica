package com.itau.pratica.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EpisodioDTO {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String nome;

    @JsonProperty("air_date")
    private String data;

    @JsonProperty("episode")
    private String episodio;

    @JsonProperty("characters")
    private RotaEpisodioDTO rotaEpisodioDTO;

    @JsonProperty("url")
    private String rota;

    @JsonProperty("created")
    private String criado;
}
