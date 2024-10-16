package com.takima.backskeleton.DTO;

import com.takima.backskeleton.DAO.TeamDao;
import com.takima.backskeleton.models.Region;
import com.takima.backskeleton.models.Team;

import java.text.DateFormat;
import java.util.Date;

public class TeamMapper {

    public static Team fromDto(TeamDto dto, Long id, Region region) {
        return new Team.Builder()
                .id(id)
                .name(dto.getName())
                .description(dto.getDescription())
                .logo(dto.getLogo())
                .date_creation(new Date())
                .lieu(dto.getLieu())
                .partners(dto.getPartners())
                .players(dto.getPlayers())
                .region(region)
                .build();
    }

    public static TeamDto toDto(Team team) {
        return  TeamDto.builder()
                .name(team.getName())
                .description(team.getDescription())
                .logo(team.getLogo())
                .creation_date(DateFormat.getDateInstance().format(team.getCreation_date()))
                .lieu(team.getLieu())
                .partners(team.getPartners())
                .players(team.getPlayers())
                .region_id(team.getRegion().getId())
                .build();
    }
}
