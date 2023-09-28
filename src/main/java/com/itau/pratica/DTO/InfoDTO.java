package com.itau.pratica.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;

@Getter
@Setter
public class InfoDTO implements Serializable {

    @JsonProperty("count")
    private String contar;

    @JsonProperty("pages")
    private String paginas;

    @JsonProperty("next")
    private String proximo;

    @JsonProperty("prev")
    private String prev;

    @JsonProperty("results")
    private ArrayList<EpisodioDTO> results;


}
