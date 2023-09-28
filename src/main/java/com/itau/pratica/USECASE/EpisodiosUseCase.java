package com.itau.pratica.USECASE;

import com.itau.pratica.DTO.EpisodioDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EpisodiosUseCase {

    private List<EpisodioDTO> episodios = new ArrayList<>();

    public List<EpisodioDTO> listarTodosEpisodios() {


            return episodios;

    }
}
