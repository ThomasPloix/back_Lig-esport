package com.takima.backskeleton.DTO;


import com.takima.backskeleton.models.Team;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MatchDto {
    private Long id;
    private int order_match;
    private int team1_id;
    private int team2_id;
    private boolean result;
    private String score;

    @Override
    public String toString() {
        return "MatchDto{" +
                "id=" + id +
                ", order_match=" + order_match +
                ", team1=" + team1_id +
                ", team2=" + team2_id +
                ", result=" + result +
                ", score='" + score + '\'' +
                '}';
    }

}
