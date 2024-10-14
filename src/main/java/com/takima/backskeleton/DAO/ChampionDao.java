package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Champion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChampionDao extends JpaRepository<Champion, Long> {
}
