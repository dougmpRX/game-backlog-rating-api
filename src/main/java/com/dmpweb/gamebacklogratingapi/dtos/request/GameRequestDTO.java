package com.dmpweb.gamebacklogratingapi.dtos.request;

import com.dmpweb.gamebacklogratingapi.entities.Developer;
import com.dmpweb.gamebacklogratingapi.entities.Platform;
import com.dmpweb.gamebacklogratingapi.entities.Publisher;
import com.dmpweb.gamebacklogratingapi.enums.GenreEnum;
import lombok.Getter;

import java.util.Date;

@Getter
public class GameRequestDTO {

    private String title;

    private GenreEnum genre;

    private Platform platform;

    private Publisher publisher;

    private Developer developer;

    private Date releaseDate;

    private Float rating;

    private String imageUrl;
}
