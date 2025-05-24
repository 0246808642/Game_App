package com.project.Games.app.project.dto;

import com.project.Games.app.project.entities.Game;
import com.project.Games.app.project.projections.GameMinProjection;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(){

    }
    public GameMinDTO(Game entity) {
        id = entity.getId();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
        title = entity.getTitle();
        year = entity.getYear();
    }
    public GameMinDTO(GameMinProjection projection) {
        id = projection.getId();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
        title = projection.getTitle();
        year = projection.getYear();
    }

    public Long getId() {
        return id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }
}
