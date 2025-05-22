package com.project.Games.app.project.repositories;

import com.project.Games.app.project.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
}
