package com.project.Games.app.project.repositories;

import com.project.Games.app.project.entities.Game;
import com.project.Games.app.project.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList,Long> {
}
