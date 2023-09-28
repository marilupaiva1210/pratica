package com.itau.pratica.USECASE;

import com.itau.pratica.DTO.EpisodioDTO;
import com.itau.pratica.gateway.EpisodioGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EpisodiosUseCase {

    @Autowired
    private EpisodioGateway episodioGateway;

    public EpisodiosUseCase(EpisodioGateway episodioGateway) {
        this.episodioGateway = episodioGateway;
    }

    public List<EpisodioDTO> listarTodosEpisodios() {
        return episodioGateway.getEpisodios();
    }
}
