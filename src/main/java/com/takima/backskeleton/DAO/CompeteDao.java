package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Compete;
import com.takima.backskeleton.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CompeteDao extends JpaRepository<Compete, Long>{
//
//    @Query("SELECT t.id, t.name FROM Team JOIN T tc ON t.id = tc.team_id JOIN competes c ON tc.compete_id = c.id WHERE c.id = ?")
//    List<Team> getAllTeamsFromCompete(Long competeId);
}