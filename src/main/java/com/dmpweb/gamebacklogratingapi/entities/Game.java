package com.dmpweb.gamebacklogratingapi.entities;

import com.dmpweb.gamebacklogratingapi.enums.GenreEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.Date;

@Entity
@Table(name = "tb_game")
@NoArgsConstructor
@Getter
@Setter
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    @Setter(AccessLevel.NONE)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "genre")
    @Enumerated(EnumType.STRING)
    private GenreEnum genre;

    @ManyToOne
    @Column(name = "platform")
    private Platform platform;

    @ManyToOne
    @Column(name = "publisher_id")
    private Publisher publisher;

    @ManyToOne
    @Column(name = "developer_id")
    private Developer developer;

    @Column(name = "release_date")
    private Date releaseDate;

    @Column(name = "rating")
    private Float rating;

    @Column(name = "image_url")
    private String imageUrl;

    @Builder
    public Game(String title, String genre, Platform platform, Publisher publisher, Developer developer, Date releaseDate,
                Float rating, String imageUrl) {

        this.title = title;
        this.genre = GenreEnum.valueOf(genre);
        this.platform = platform;
        this.publisher = publisher;
        this.developer = developer;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.imageUrl = imageUrl;
    }
}
