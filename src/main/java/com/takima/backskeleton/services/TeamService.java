package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.TeamDao;
import com.takima.backskeleton.models.Compete;
import com.takima.backskeleton.models.Player;
import com.takima.backskeleton.models.Team;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamService {

    private final TeamDao teamDao;

    public Team getById(Long id) {
        return teamDao.findById(id).orElseThrow();
    }

    public List<Team> findAll() {
        return teamDao.findAll();
    }

    public List<Player> getPlayersOfTeam(Long id) {
        return teamDao.getAllPlayersFromTeam(id);
    }

    public Team createTeam(Team team) {
        return teamDao.save(team);
    }






}
