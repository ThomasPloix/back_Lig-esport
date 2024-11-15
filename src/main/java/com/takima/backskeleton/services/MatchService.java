package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.MatchDao;
import com.takima.backskeleton.models.Match;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MatchService {
    private final MatchDao matchDao;
    public Match createMatch(Match match) {
        return matchDao.save(match);
    }
}
