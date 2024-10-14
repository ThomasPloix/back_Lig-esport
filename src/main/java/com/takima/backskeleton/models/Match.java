package com.takima.backskeleton.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "matchs")
@Getter
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "date")
    private Date date;
    @ManyToOne
    @JoinColumn(name="team1_id", nullable=false)
    private Team team1;
    @ManyToOne
    @JoinColumn(name="team2_id", nullable=false)
    private Team team2;
    @Column(name = "result")
    private boolean result;
    @Column(name = "score")
    private String score;
    @ManyToMany
    @JoinTable(
            name = "match_champion",
            joinColumns = @JoinColumn(name = "match_id"),
            inverseJoinColumns = @JoinColumn(name = "champion_id"))
    private List<Champion> champions_picked;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="compete_id", nullable=false)
    private Compete compete;
}
