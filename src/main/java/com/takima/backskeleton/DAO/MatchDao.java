package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchDao extends JpaRepository<Match, Long> {
}
