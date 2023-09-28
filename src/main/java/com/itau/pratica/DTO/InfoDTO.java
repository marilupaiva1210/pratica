package com.itau.pratica.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InfoDTO {

    @JsonProperty("count")
    private String contar;

    @JsonProperty("pages")
    private String paginas;

    @JsonProperty("next")
    private String proximo;

    @JsonProperty("prev")
    private String prev;

    @JsonProperty("results")
    private EpisodioDTO episodioDTO;


}
