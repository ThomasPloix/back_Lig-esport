package com.takima.backskeleton.controllers;


import com.takima.backskeleton.models.Player;
import com.takima.backskeleton.models.Team;
import com.takima.backskeleton.services.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("teams")
@RestController
@RequiredArgsConstructor
public class TeamController {
    private final TeamService teamService;

    @GetMapping("")
    public List<Team> listTeams() {
        return teamService.findAll();
    }

    @GetMapping("/{id}")
    public Team getTeamById(@PathVariable Long id) {
        return teamService.getById(id);
    }

    @GetMapping("/{id}/players")
    public List<Player> getPlayersOfTeam(@PathVariable Long id) {
        return teamService.getPlayersOfTeam(id);
    }
}
