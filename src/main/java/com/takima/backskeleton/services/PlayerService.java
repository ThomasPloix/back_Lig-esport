package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.PlayerDao;
import com.takima.backskeleton.models.Player;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PlayerService {
    private final PlayerDao playerDao;

    public Player getById(Long id){


        return playerDao.findById(id).orElseThrow();
    }

    public Player updatePlayer(Player player) {
        Optional<Player> player1 = playerDao.findByPseudo(player.getPseudo());
        player1.ifPresent(value ->
                player.setId(value.getId()));
        return playerDao.saveAndFlush(player);
    }

    public List<Player> findAll() {
        Iterable<Player> it = playerDao.findAll();
        List <Player> users = new ArrayList<>();
        it.forEach(users::add);
        return users ;
    }
}
