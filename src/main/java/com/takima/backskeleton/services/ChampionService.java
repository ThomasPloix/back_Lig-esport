package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.ChampionDao;
import com.takima.backskeleton.models.Champion;
import com.takima.backskeleton.models.Region;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChampionService {
    private final ChampionDao championDao;
    public Champion getById(Long id){
        return championDao.findById(id).orElseThrow();
    }

}
