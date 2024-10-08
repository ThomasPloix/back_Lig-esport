package com.takima.backskeleton.DTO;

import com.takima.backskeleton.models.Team;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PlayerDto {
    private String firstName;
    private String lastName;
    private String pseudo;
    private Team team;
}
