package com.project.Games.app.project.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_game")
public class Game {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String title;

        @Column(name = "game_year")
        private Integer year;
        private String genre;
        private String platform;
        private String imgUrl;
        private String shortDescription;
        private String longDescription;

        public Game() {

        }

        public Game(String genre, Long id, String imgUrl, String longDescription, String platform, String shortDescription, String title, Integer year) {
            this.genre = genre;
            this.id = id;
            this.imgUrl = imgUrl;
            this.longDescription = longDescription;
            this.platform = platform;
            this.shortDescription = shortDescription;
            this.title = title;
            this.year = year;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Game game = (Game) o;
            return Objects.equals(id, game.id);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(id);
        }
}

