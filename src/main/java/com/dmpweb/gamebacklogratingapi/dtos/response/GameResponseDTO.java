package com.dmpweb.gamebacklogratingapi.dtos.response;

import com.dmpweb.gamebacklogratingapi.entities.Game;
import com.dmpweb.gamebacklogratingapi.enums.GenreEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class GameResponseDTO {

    private Long id;

    private String title;

    private GenreEnum genre;

    private String platform;

    private String publisher;

    private String developer;

    private Date releaseDate;

    private Float rating;

    private String imageUrl;

    public GameResponseDTO(Game game) {
        this.id = game.getId();
        this.title = game.getTitle();
        this.genre = game.getGenre();
        this.platform = game.getPlatform();
        this.publisher = game.getPublisher();
        this.developer = game.getDeveloper();
        this.releaseDate = game.getReleaseDate();
        this.rating = game.getRating();
        this.imageUrl = game.getImageUrl();
    }
}
