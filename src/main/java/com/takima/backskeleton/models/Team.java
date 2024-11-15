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
    private String lieu;
    @Column(name = "partners")
    private String partners;
    @Column(name = "date_created")
    private Date creation_date;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "team")
    private List<Player> players =  new ArrayList<>();

    @ManyToMany(mappedBy = "teams_compete")
    @JsonIgnore
    private List<Compete> competes;

    @ManyToOne
    @JoinColumn(name="region_id", nullable=false)
    @JsonIgnore
    private Region region;


    public Team() {
    }

    private Team(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
        this.logo = builder.logo;
        this.lieu = builder.lieu;
        this.partners = builder.partners;
        this.creation_date = builder.date_creation;
        this.players = builder.players;
        this.competes = builder.competes;
        this.region = builder.region;

    }

    public static class Builder{
        private Long id;
        private String name;
        private String description;
        private String logo;
        private String lieu;
        private String partners;
        private Date date_creation;
        private List<Player> players;
        private List<Compete> competes;
        private Region region;

        public Builder id(Long id){
            this.id = id;
            return this;
        }
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder description(String description){
            this.description = description;
            return this;
        }
        public Builder logo(String logo){
            this.logo = logo;
            return this;
        }
        public Builder lieu(String lieu){
            this.lieu = lieu;
            return this;
        }
        public Builder partners(String partners){
            this.partners = partners;
            return this;
        }
        public Builder date_creation(Date date_creation){
            this.date_creation = date_creation;
            return this;
        }
        public Builder players(List<Player> players){
            this.players = players;
            return this;
        }
        public Builder competes(List<Compete> competes){
            this.competes = competes;
            return this;
        }
        public Builder region(Region region){
            this.region = region;
            return this;
        }

        public Team build(){
            return new Team(this);
        }


    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", logo='" + logo + '\'' +
                ", lieu='" + lieu + '\'' +
                ", partners='" + partners + '\'' +
                ", creation_date=" + creation_date +
                ", players=" + players +
                ", competes=" + competes +
                '}';
    }
}
