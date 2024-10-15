package com.takima.backskeleton.controllers;


import com.takima.backskeleton.models.Compete;
import com.takima.backskeleton.models.Player;
import com.takima.backskeleton.models.Team;
import com.takima.backskeleton.services.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin (origins = "http://localhost:4200")
@RequestMapping("team")
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

    @CrossOrigin (origins = "http://localhost:4200")
    @PostMapping("")
    public Team createTeam(@RequestBody Team team) {
        System.out.println(team);
        return teamService.createTeam(team);
    }

}
