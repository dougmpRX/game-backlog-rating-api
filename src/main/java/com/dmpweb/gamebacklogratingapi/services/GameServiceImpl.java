package com.dmpweb.gamebacklogratingapi.services;

import com.dmpweb.gamebacklogratingapi.dtos.request.GameRequestDTO;
import com.dmpweb.gamebacklogratingapi.dtos.response.GameResponseDTO;
import com.dmpweb.gamebacklogratingapi.entities.Game;
import com.dmpweb.gamebacklogratingapi.repositories.GameRepository;
import com.dmpweb.gamebacklogratingapi.utils.GameMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@RequiredArgsConstructor
public class GameServiceImpl implements GameService {

    private final GameRepository gameRepository;

    private final GameMapper gameMapper;

    @Override
    public GameResponseDTO findById(Long id) {
        return gameMapper.toDTO(returnGame(id));
    }

    @Override
    public GameResponseDTO findByTitle(String title) {
        Game game = gameRepository.findByTitle(title).orElseThrow(() -> new RuntimeException("Game not found"));
        return gameMapper.toDTO(game);
    }

    @Override
    public List<GameResponseDTO> findAll() {
        return gameMapper.toDTO(gameRepository.findAll());
    }

    @Override
    public GameResponseDTO save(GameRequestDTO gameRequestDTO) {
        Game game = gameMapper.toEntity(gameRequestDTO);
        return gameMapper.toDTO(gameRepository.save(game));
    }

    @Override
    public GameResponseDTO update(GameRequestDTO gameRequestDTO, Long id) {
        Game game = returnGame(id);
        gameMapper.updateGameData(gameRequestDTO, game);
        return gameMapper.toDTO(gameRepository.save(game));
    }

    @Override
    public void deleteById(Long id) {
        gameRepository.deleteById(id);
    }

    private Game returnGame(Long id) {
        return gameRepository.findById(id).orElseThrow(() -> new RuntimeException("Game not found"));
    }
}
