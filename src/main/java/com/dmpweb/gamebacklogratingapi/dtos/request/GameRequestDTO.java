package com.dmpweb.gamebacklogratingapi.dtos.request;

import com.dmpweb.gamebacklogratingapi.enums.GenreEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class GameRequestDTO {

    private String title;

    private GenreEnum genre;

    private String platform;

    private String publisher;

    private String developer;

    private Date releaseDate;

    private Float rating;

    private String imageUrl;
}
