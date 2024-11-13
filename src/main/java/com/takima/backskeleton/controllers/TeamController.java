package com.takima.backskeleton.controllers;


import com.takima.backskeleton.DTO.TeamDto;
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
    public TeamDto getTeamById(@PathVariable Long id) {
        return teamService.getById(id);
    }

    @GetMapping("/{id}/players")
    public List<Player> getPlayersOfTeam(@PathVariable Long id) {
        return teamService.getPlayersOfTeam(id);
    }

    @CrossOrigin (origins = "http://localhost:4200")
    @PostMapping("")
    public Team createTeam(@RequestBody TeamDto team) {
        System.out.println(team);
        return teamService.createTeam(team);
    }

    // Endpoint to delete a team by its Name
    @DeleteMapping("/name/{name}")
    public void deleteTeamByName(@PathVariable String name) {
        teamService.deleteTeamByName(name);
    }

}
