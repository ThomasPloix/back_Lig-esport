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
            joinColumns = @JoinColumn(name = "compete_id"),
            inverseJoinColumns = @JoinColumn(name = "team_id"))
    private List<Team> teams_compete;

    @OneToMany(mappedBy = "compete")
    private List<Match> matches;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="region_id", nullable=false)
    private Region region;

    public Compete() {
    }

    public Compete(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.teams_compete = builder.teams_compete;
        this.matches = builder.matches;
        this.region = builder.region;
    }

    public static class Builder {
        private Long id;
        private String name;
        private List<Team> teams_compete;
        private List<Match> matches;
        private Region region;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder teams_compete(List<Team> teams_compete) {
            this.teams_compete = teams_compete;
            return this;
        }

        public Builder matches(List<Match> matches) {
            this.matches = matches;
            return this;
        }

        public Builder region(Region region) {
            this.region = region;
            return this;
        }

        public Compete build() {
            return new Compete(this);
        }
    }

}
