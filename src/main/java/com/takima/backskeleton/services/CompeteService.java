package com.takima.backskeleton.services;
import com.takima.backskeleton.DAO.CompeteDao;
import com.takima.backskeleton.models.Compete;
import com.takima.backskeleton.models.Team;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompeteService {
    private final CompeteDao competeDao;

    public Compete getById(Long id){
        return competeDao.findById(id).orElseThrow();
    }
    public List<Compete> findAll() {
        return competeDao.findAll();
    }

    public Compete createCompete(Compete compete) {
        return competeDao.save(compete);
    }
//    public List<Team> getAllTeamsFromCompete(Long teamId) {
//        return competeDao.getAllTeamsFromCompete(teamId);
//    }

}