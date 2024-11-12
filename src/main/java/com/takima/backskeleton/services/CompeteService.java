package com.takima.backskeleton.services;
import com.takima.backskeleton.DAO.CompeteDao;
import com.takima.backskeleton.DAO.MajorDao;
import com.takima.backskeleton.DTO.CompeteDto;
import com.takima.backskeleton.DTO.CompeteMapper;
import com.takima.backskeleton.DTO.MatchDto;
import com.takima.backskeleton.models.Compete;
import com.takima.backskeleton.models.Match;
import com.takima.backskeleton.models.Region;
import com.takima.backskeleton.models.Team;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompeteService {
    private final CompeteDao competeDao;
    private final RegionService regionService;

    public Compete getById(Long id){
        return competeDao.findById(id).orElseThrow();
    }
    public List<Compete> findAll() {
        return competeDao.findAll();
    }

    public List<Match> getCompeteWithMatch(Long id) {
        List<Match> competeDto= competeDao.getCompeteWithMatch(id);
        System.out.println(competeDao.getCompeteWithMatch(id));

        return competeDto;
    }

    @Transactional
    public Compete addCompete(CompeteDto competeDto) {
        Compete compete;
        try {
            Region region= regionService.getById(competeDto.getRegionId());
            compete = CompeteMapper.fromDto(competeDto, null, region);
        } catch (Exception e) {
            throw new RuntimeException("Error with Compete", e);
        }
        return competeDao.save(compete);
    }
//    public List<Team> getAllTeamsFromCompete(Long teamId) {
//        return competeDao.getAllTeamsFromCompete(teamId);
//    }

}