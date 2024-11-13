package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface PlayerDao extends JpaRepository<Player, Long> {
    @Query("SELECT p FROM Player p WHERE p.team.id = :id")
    Iterable<Player> getAllPlayersFromTeam(Long id);

    Optional<Player> findByPseudo(String name);
}
