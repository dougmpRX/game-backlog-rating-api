package com.dmpweb.gamebacklogratingapi.dtos.response;

import com.dmpweb.gamebacklogratingapi.entities.Developer;
import com.dmpweb.gamebacklogratingapi.entities.Game;
import com.dmpweb.gamebacklogratingapi.entities.Platform;
import com.dmpweb.gamebacklogratingapi.entities.Publisher;
import com.dmpweb.gamebacklogratingapi.enums.GenreEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
public class GameResponseDTO {

    private Long id;

    private String title;

    private GenreEnum genre;

    private Platform platform;

    private Publisher publisher;

    private Developer developer;

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
