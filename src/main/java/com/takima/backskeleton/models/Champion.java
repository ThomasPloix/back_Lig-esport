package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;

@Table(name = "champions")
@Getter
@Entity
public class Champion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "title")
    private String title;
    @Column(name = "lore")
    private String lore;
    @Column(name = "tags")
    private String tags;
}
