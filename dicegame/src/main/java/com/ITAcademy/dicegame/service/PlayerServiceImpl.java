package com.ITAcademy.dicegame.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.ITAcademy.dicegame.dao.GambleDAO;
//import com.ITAcademy.dicegame.dto.Gamble;
import com.ITAcademy.dicegame.dao.PlayerDAO;
import com.ITAcademy.dicegame.dto.Player;

import java.util.Date;
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
    {
        // Save new registred players (POST)

        Date date = new Date();
        player.setDateRegistrer(date);

        if(player.getPlayerName() == null) {
            player.setPlayerName("Anonymous");
            return playerDAO.save(player);
        } else {
           return playerDAO.save(player);
        }

        //return playerDAO.save(player);
    }

    @Override
    public Player changeNamePlayer(Player player)
    {                                           // Change the name for player (PUT)
        return playerDAO.save(player);
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
    public List<Player> showLosers(){
        return playerDAO.findAll();
    }
}
