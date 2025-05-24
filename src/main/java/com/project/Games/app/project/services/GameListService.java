package com.project.Games.app.project.services;

import com.project.Games.app.project.dto.GameDTO;
import com.project.Games.app.project.dto.GameListDTO;
import com.project.Games.app.project.dto.GameMinDTO;
import com.project.Games.app.project.entities.Game;
import com.project.Games.app.project.entities.GameList;
import com.project.Games.app.project.repositories.GameListRepository;
import com.project.Games.app.project.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository   gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
       List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }
}
