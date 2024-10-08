package com.takima.backskeleton.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Table(name = "teams")
@Getter
@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "logo")
    private String logo;
    @Column(name = "lieu")
    private String place;
    @Column(name = "partners")
    private String partners;
    @Column(name = "date_created")
    private Date creation_date;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "team")
    private List<Player> players =  new ArrayList<>();

    @ManyToMany(mappedBy = "teams_compete")
    private List<Compete> competes;

    @ManyToOne
    @JsonIgnore
    private Region region;
}
