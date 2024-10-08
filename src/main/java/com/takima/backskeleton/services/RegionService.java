package com.takima.backskeleton.services;


import com.takima.backskeleton.DAO.RegionDao;
import com.takima.backskeleton.models.Region;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RegionService {
    private final RegionDao regionDao;

    public Region getById(Long id){
        return regionDao.findById(id).orElseThrow();
    }

    public List<Region> findAll() {
        return regionDao.findAll();
    }

}
