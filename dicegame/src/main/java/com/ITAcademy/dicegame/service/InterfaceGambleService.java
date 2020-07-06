package com.ITAcademy.dicegame.service;

import com.ITAcademy.dicegame.dto.Gamble;

import java.util.List;

public interface InterfaceGambleService
{
    List<Gamble> findAllByPlayerId(Long id); // find Player details

    //public void eraseGambles(Long id); // Erase gambles of player
}
