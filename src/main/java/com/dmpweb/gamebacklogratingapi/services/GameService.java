package com.dmpweb.gamebacklogratingapi.services;

import com.dmpweb.gamebacklogratingapi.dtos.request.GameRequestDTO;
import com.dmpweb.gamebacklogratingapi.dtos.response.GameResponseDTO;

import java.util.List;

public interface GameService {

    GameResponseDTO findById(Long id);

    GameResponseDTO findByTitle(String title);

    List<GameResponseDTO> findAll();

    GameResponseDTO save(GameRequestDTO gameRequestDTO);

    GameResponseDTO update(GameRequestDTO gameRequestDTO, Long id);

    void deleteById(Long id);
}
