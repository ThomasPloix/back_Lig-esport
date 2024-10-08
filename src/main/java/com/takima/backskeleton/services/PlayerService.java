package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.PlayerDao;
import com.takima.backskeleton.models.Player;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerService {
    private final PlayerDao playerDao;

    public Player getById(Long id){
        return playerDao.findById(id).orElseThrow();
    }

    public List<Player> findAll() {
        return playerDao.findAll();
    }
}
