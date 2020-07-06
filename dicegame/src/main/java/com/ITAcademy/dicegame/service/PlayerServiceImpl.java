package com.ITAcademy.dicegame.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.ITAcademy.dicegame.dao.GambleDAO;
//import com.ITAcademy.dicegame.dto.Gamble;
import com.ITAcademy.dicegame.dao.PlayerDAO;
import com.ITAcademy.dicegame.dto.Player;

import java.util.List;

@Service
public class PlayerServiceImpl implements InterfacePlayerService
{

    @Autowired
    PlayerDAO playerDAO;
    //GambleDAO gambleDAO;

    @Override
    public List<Player> findAllPlayers()
    {                                           // Show all registred players (GET)
        return playerDAO.findAll();
    }

    @Override
    public Player saveNewPlayer(Player player)
    {                                           // Save new registred players (POST)
        return playerDAO.save(player);
    }

    @Override
    public Player changeNamePlayer(Long id)
    {                                           // Change the name for player (PUT)
        return playerDAO.findById(id).get();
    }

    @Override
    public List <Player> showRanking()
    {                                           // Show general ranking / winners / loosers
        return playerDAO.findAll();
    }

    @Override
    public List<Player> showWinners() {
        return playerDAO.findAll();
    }

    @Override
    public List<Player> showLoosers(){
        return playerDAO.findAll();
    }
}
