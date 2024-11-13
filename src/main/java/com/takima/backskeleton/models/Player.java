package com.takima.backskeleton.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.tags.Tags;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Table(name = "players")
@Getter
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "pseudo")
    private String pseudo;
    @Column(name = "role")
    private String role;
    @ManyToMany
    @JoinTable(
            name = "player_champion",
            joinColumns = @JoinColumn(name = "player_id"),
            inverseJoinColumns = @JoinColumn(name = "champion_id"))
    private List<Champion> champion_prefs;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "team_id", referencedColumnName = "id")
    @JsonIgnore
    private Team team;
    //private Long player_team_id = team.getId();


    private Player(Builder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.pseudo = builder.pseudo;
        this.team = builder.team;
        this.role = builder.role;
        this.champion_prefs = builder.champion_prefs;
    }
    public Player() {
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void setChampion_prefs(List<Champion> championPrefs) {
        this.champion_prefs = championPrefs;
    }

    public static class Builder {
        public List<Champion> champion_prefs;
        private Long id;
        private String firstName;
        private String lastName;
        private String pseudo;
        private String role;
        private Team team;

        public Builder id (Long id) {
            this.id = id;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder pseudo(String pseudo) {
            this.pseudo = pseudo;
            return this;
        }
        public Builder team(Team team) {
            this.team = team;
            return this;
        }
        public Builder role(String role) {
            this.role = role;
            return this;
        }
        public Builder champion_prefs(List<Champion> champion_prefs) {
            this.champion_prefs = champion_prefs;
            return this;
        }

        public Player build() {
            return new Player(this);
        }
    }

    public void setId(Long id) {
        this.id = id;
    }

}
