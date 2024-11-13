package com.takima.backskeleton.DTO;

import com.takima.backskeleton.models.Match;
import com.takima.backskeleton.models.Region;
import com.takima.backskeleton.models.Team;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@Builder
@Getter
public class CompeteDto {
    private String name;
    private List<Team> teams_compete;
    private Long region;
    private List<Match> matches;


    @Override
    public String toString() {
        return "CompeteDto{" +
                "name='" + name + '\'' +
                ", teams=" + teams_compete +
                ", regionID=" + region +
                ", match=" + matches +
                '}';
    }
}
