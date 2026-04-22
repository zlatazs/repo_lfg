package com.uep.wap.service;

import com.uep.wap.dto.PlayerDTO;
import com.uep.wap.model.Player;
import com.uep.wap.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Player addPlayer(PlayerDTO playerDTO) {

        Player player = new Player();
        player.setNickname(playerDTO.getNickname());
        player.setSkillLevel(playerDTO.getSkillLevel());
        player.setMmr(playerDTO.getMmr());

        return playerRepository.save(player);
    }

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }
}