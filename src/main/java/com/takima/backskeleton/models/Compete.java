package com.takima.backskeleton.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Table(name = "competes")
@Getter
public class Compete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;

    @ManyToMany
    @JoinTable(
            name = "team_compete",
            joinColumns = @JoinColumn(name = "team_id"),
            inverseJoinColumns = @JoinColumn(name = "compete_id"))
    private List<Team> teams_compete;

    @OneToMany(mappedBy = "compete")
    private List<Match> matches;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="region_id", nullable=false)
    private Region region;
}
