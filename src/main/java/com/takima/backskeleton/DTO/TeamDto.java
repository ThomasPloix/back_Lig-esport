package com.takima.backskeleton.DTO;

import com.takima.backskeleton.models.Player;
import lombok.Builder;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@Builder
@Getter
public class TeamDto {
    private String name;
    private String description;
    private String logo;
    private String partners;
    private String creation_date;
    private List<Player> players;
    private String lieu;
    private Long region_id;

    @Override
    public String toString() {
        return "TeamDto{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", logo='" + logo + '\'' +
                ", date_creation=" + creation_date +
                ", lieu='" + lieu + '\'' +
                ", partners='" + partners + '\'' +
                ", region_id=" + region_id +
                '}';
    }
}
