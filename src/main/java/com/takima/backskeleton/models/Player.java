package com.takima.backskeleton.models;


import io.swagger.v3.oas.annotations.tags.Tags;
import jakarta.persistence.*;
import lombok.Getter;

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
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "team_id")
    private Team team;

    private Player(Builder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.pseudo = builder.pseudo;
        this.team = builder.team;
    }
    public Player() {
    }

    public static class Builder {
        private Long id;
        private String firstName;
        private String lastName;
        private String pseudo;
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

        public Player build() {
            return new Player(this);
        }
    }

}
