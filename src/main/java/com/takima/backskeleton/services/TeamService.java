package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.TeamDao;
import com.takima.backskeleton.DTO.TeamDto;
import com.takima.backskeleton.DTO.TeamMapper;
import com.takima.backskeleton.models.Compete;
import com.takima.backskeleton.models.Player;
import com.takima.backskeleton.models.Region;
import com.takima.backskeleton.models.Team;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.tags.HtmlEscapingAwareTag;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamService {

    private final TeamDao teamDao;
    private final RegionService regionService;

    public TeamDto getById(Long id) {

            Team team = teamDao.findById(id).orElseThrow();
        return TeamMapper.toDto(team);
    }

    public List<Team> findAll() {

        return teamDao.findAll();
    }

    public List<Player> getPlayersOfTeam(Long id) {
        return teamDao.getAllPlayersFromTeam(id);
    }

    @Transactional
    public Team createTeam(TeamDto teamDto) {
        System.out.printf("Creating team %s\n", teamDto.toString() );
        Team team ;
        try{
            Region region= regionService.getById(teamDto.getRegion_id());
            System.out.printf("Region %s\n", region.toString() );
            team = TeamMapper.fromDto(teamDto, null, region);
            System.out.printf("Team %s\n", team.toString() );
        } catch (Exception e) {
            throw new RuntimeException("Error with Team image", e);
        }
        return teamDao.save(team);
    }






}
