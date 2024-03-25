package com.dmpweb.gamebacklogratingapi.controllers;

import com.dmpweb.gamebacklogratingapi.dtos.request.GameRequestDTO;
import com.dmpweb.gamebacklogratingapi.dtos.response.GameResponseDTO;
import com.dmpweb.gamebacklogratingapi.services.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/game")
@RequiredArgsConstructor
public class GameController {

    private final GameService gameService;

    @GetMapping("/{id}")
    public ResponseEntity<GameResponseDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(gameService.findById(id));
    }

    @GetMapping("/title/{title}")
    public ResponseEntity<GameResponseDTO> findByTitle(@PathVariable String title) {
        return ResponseEntity.ok().body(gameService.findByTitle(title));
    }

    @GetMapping
    public ResponseEntity<List<GameResponseDTO>> findAll() {
        return ResponseEntity.ok().body(gameService.findAll());
    }

    @PostMapping
    public ResponseEntity<GameResponseDTO> save(@RequestBody GameRequestDTO gameRequestDTO) {
        GameResponseDTO gameResponseDTO = gameService.save(gameRequestDTO);
        URI location = URI.create(String.format("/%s", gameResponseDTO.getId()));
        return ResponseEntity.created(location).body(gameResponseDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GameResponseDTO> update(@RequestBody GameRequestDTO gameRequestDTO, @PathVariable Long id) {
        GameResponseDTO gameResponseDTO = gameService.update(gameRequestDTO, id);
        return ResponseEntity.ok().body(gameResponseDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        gameService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
