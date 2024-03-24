package com.dmpweb.gamebacklogratingapi.utils;

import com.dmpweb.gamebacklogratingapi.dtos.request.GameRequestDTO;
import com.dmpweb.gamebacklogratingapi.dtos.response.GameResponseDTO;
import com.dmpweb.gamebacklogratingapi.entities.Game;
import com.dmpweb.gamebacklogratingapi.enums.GenreEnum;

import java.util.List;
import java.util.stream.Collectors;

public class GameMapper {

    public Game toEntity(GameRequestDTO gameRequestDTO) {
        return Game.builder()
                .title(gameRequestDTO.getTitle())
                .genre(String.valueOf(gameRequestDTO.getGenre()))
                .platform(gameRequestDTO.getPlatform())
                .publisher(gameRequestDTO.getPublisher())
                .developer(gameRequestDTO.getDeveloper())
                .releaseDate(gameRequestDTO.getReleaseDate())
                .rating(gameRequestDTO.getRating())
                .imageUrl(gameRequestDTO.getImageUrl())
                .build();
    }

    public GameResponseDTO toDTO(Game game) {
        return new GameResponseDTO(game);
    }

    public List<GameResponseDTO> toDTO(List<Game> games) {
        return games.stream().map(GameResponseDTO::new).collect(Collectors.toList());
    }

    public void updateGameData (GameRequestDTO gameRequestDTO, Game game) {
        game.setTitle(gameRequestDTO.getTitle());
        game.setGenre(gameRequestDTO.getGenre());
        game.setPlatform(gameRequestDTO.getPlatform());
        game.setPublisher(gameRequestDTO.getPublisher());
        game.setDeveloper(gameRequestDTO.getDeveloper());
        game.setReleaseDate(gameRequestDTO.getReleaseDate());
        game.setRating(gameRequestDTO.getRating());
        game.setImageUrl(gameRequestDTO.getImageUrl());
    }
}
