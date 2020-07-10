package com.ITAcademy.dicegame.controller;

import com.ITAcademy.dicegame.dto.Gamble;
import com.ITAcademy.dicegame.dto.Player;
import com.ITAcademy.dicegame.service.GambleServiceImpl;
import com.ITAcademy.dicegame.service.InterfaceGambleService;
import com.ITAcademy.dicegame.service.PlayerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController

public class GambleController {

    @Autowired
    GambleServiceImpl gambleServiceImpl;

    @GetMapping("/players/{id}/games") // Show gambles of player x
    List<Gamble> all(@PathVariable(name="id") Long id)
    {
        return gambleServiceImpl.findAllByPlayerId(id);
    }

    @PostMapping("/players/{id}/games") //create Gambles
    Gamble saveNewGamble(@RequestBody Gamble gamble)
    {
        return gambleServiceImpl.saveNewGamble(gamble);
    }


    // Delete Gambles of Players

  /*  @DeleteMapping("/players/{id}/games")   // Delete gambles of Player
    public void erasePlayerGambles(@PathVariable(name="id") Long id) {
        InterfaceGambleService.eraseGambles(id);
    }*/
}
