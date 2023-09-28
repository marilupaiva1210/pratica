package com.itau.pratica.controllers;

import com.itau.pratica.USECASE.EpisodiosUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EpisodioController {

    @Autowired
    private EpisodiosUseCase episodiosUseCase;

    @GetMapping("/episodios")
    public ResponseEntity todosEpisodios() {

            return new ResponseEntity(episodiosUseCase.listarTodosEpisodios(), HttpStatus.OK);

    }
}

