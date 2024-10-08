package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Player;
import com.takima.backskeleton.services.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("players")
@RestController
@RequiredArgsConstructor
public class PlayerController {

    private final PlayerService playerService;

    @GetMapping("")
    public List<Player> listPlayers() {
        return playerService.findAll();
    }

    @GetMapping("/{id}")
    public Player getPlayerById(@PathVariable Long id) {
        return playerService.getById(id);
    }
}
