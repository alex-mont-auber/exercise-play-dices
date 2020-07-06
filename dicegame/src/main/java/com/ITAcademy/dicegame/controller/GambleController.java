package com.ITAcademy.dicegame.controller;

import com.ITAcademy.dicegame.dto.Gamble;
import com.ITAcademy.dicegame.service.GambleServiceImpl;
import com.ITAcademy.dicegame.service.InterfaceGambleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class GambleController {

    @Autowired
    GambleServiceImpl gambleServiceImpl;

    @GetMapping("/players/{id}/games") // Show gambles of player x
    List<Gamble> all(@PathVariable(name="id") Long id)
    {
        return gambleServiceImpl.findAllByPlayerId(id);
    }

    //@PostMapping("/players/{id}/games")

    // Delete Gambles of Players

  /*  @DeleteMapping("/players/{id}/games")   // Delete gambles of Player
    public void erasePlayerGambles(@PathVariable(name="id") Long id) {
        InterfaceGambleService.eraseGambles(id);
    }*/
}
