package com.ITAcademy.dicegame.controller;

import com.ITAcademy.dicegame.dao.PlayerDAO;
import com.ITAcademy.dicegame.dto.Gamble;
import com.ITAcademy.dicegame.dto.Player;
import com.ITAcademy.dicegame.service.GambleServiceImpl;
import com.ITAcademy.dicegame.service.InterfaceGambleService;
import com.ITAcademy.dicegame.service.InterfacePlayerService;
import com.ITAcademy.dicegame.service.PlayerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost")

public class PlayerController {

    @Autowired
    PlayerServiceImpl playerServiceImpl;

    //GETS of Players

        // Show all players

    @GetMapping("/players")
    public List<Player> getAllPlayers()
    {
        return playerServiceImpl.findAllPlayers();
    }

        // Ranking general

    @GetMapping("/players/ranking")
    public List <Player> showRanking() {return playerServiceImpl.showRanking();}

        // Ranking Winners

   @GetMapping("/players/ranking/winner")
    public List <Player> showRankingWinners() {return playerServiceImpl.showWinners();}

        // Ranking Loosers

    @GetMapping("/players/ranking/looser")
    public List <Player> showRankingLoosers() {return playerServiceImpl.showLosers();}

    //POST of Players

    @PostMapping("/players") // Create Players
    public Player saveNewPlayer(@RequestBody Player player)
    {
        return playerServiceImpl.saveNewPlayer(player);
    }

    //PUT of Players

    @PutMapping("/players") // Modify Players
    public Player changeNamePlayer(@RequestBody Player player)
    {
        Player playerToModify = new Player();
        Player playerModified = new Player();

        playerToModify.setPlayerName(player.getPlayerName());
        //playerToModify.setDateRegistrer(player.getDateRegistrer());
        //playerToModify.setIdPlayer(player.getIdPlayer());
        //playerToModify.setPerCentSuccess(player.getPerCentSuccess());

        playerModified = playerServiceImpl.changeNamePlayer(playerToModify);

        return playerModified;
    }

}
