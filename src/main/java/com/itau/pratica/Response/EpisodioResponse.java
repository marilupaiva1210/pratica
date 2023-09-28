package com.itau.pratica.Response;

import com.itau.pratica.DTO.EpisodioDTO;
import lombok.Getter;

import java.util.List;

@Getter
public class EpisodioResponse {

    private List<EpisodioDTO> results;
}
