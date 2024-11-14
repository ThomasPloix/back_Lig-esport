package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Player;
import com.takima.backskeleton.models.Team;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TeamDao extends JpaRepository<Team, Long> {
    @Query("SELECT t.players FROM Team t WHERE t.id= :teamId")
    List<Player> getAllPlayersFromTeam(Long teamId);
    void deleteByName(String name);
    Optional<Team> findByName(String name);
}
