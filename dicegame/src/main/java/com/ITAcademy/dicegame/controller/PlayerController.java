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

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost")

public class PlayerController {

    @Autowired
    PlayerServiceImpl playerServiceImpl;

    //GETS of Players

    @GetMapping("/players") // Show all players
    public List<Player> getAllPlayers()
    {
        return playerServiceImpl.findAllPlayers();
    }

        // Rankings

    @GetMapping("/players/ranking")
    public List <Player> showRanking() {return playerServiceImpl.showRanking();}

   @GetMapping("/players/ranking/winner")
    public List <Player> showRankingWinners() {return playerServiceImpl.showWinners();}

    @GetMapping("/players/ranking/looser")
    public List <Player> showRankingLoosers() {return playerServiceImpl.showLoosers();}

    //POST of Players

    @PostMapping("/players") // Create Players
    public Player createPlayer(Player player)
    {
        if(player.getPlayerName() == null) {
            player.setPlayerName("Anonymous");
        }
        else
        {
            //player.getPlayerName();
        }
        return playerServiceImpl.saveNewPlayer(player);
    }

    //PUT of Players

   /* @PutMapping("/players") // Modify Players
    public Player modifyPlayer(@PathVariable (name="id")Long id, @RequestBody Player player)
    {
        Player playerToModify = new Player();
        Player playerModified = new Player();

        playerModified =playerServiceImpl.changeNamePlayer(id);
        return playerServiceImpl.changeNamePlayer(player);
    }*/

}
