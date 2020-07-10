package com.ITAcademy.dicegame.service;

//import com.ITAcademy.dicegame.dto.Gamble;
import com.ITAcademy.dicegame.dto.Player;

import java.util.List;
import java.util.Optional;

public interface InterfacePlayerService {

    //CRUD Methods

    public List<Player> findAllPlayers(); // Show all registred players (GET)

    public Player saveNewPlayer(Player player); // Save new registred players (POST)

    public Player changeNamePlayer(Player player); // Change the name for player (PUT)

    public List <Player> showRanking(); // Show general ranking

    public List <Player> showWinners(); // Show winners ranking

    public List <Player> showLosers(); // Show losers ranking
}
