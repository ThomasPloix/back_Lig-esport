package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PlayerDao extends JpaRepository<Player, Long> {
}
