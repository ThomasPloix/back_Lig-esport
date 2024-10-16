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
    private List<Team> teams;
    private Long regionId;
    private List<Match> match;


    @Override
    public String toString() {
        return "CompeteDto{" +
                "name='" + name + '\'' +
                ", teams=" + teams +
                ", regionID=" + regionId +
                ", match=" + match +
                '}';
    }
}
