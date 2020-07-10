package com.ITAcademy.dicegame.dao;

import com.ITAcademy.dicegame.dto.Gamble;
import com.ITAcademy.dicegame.dto.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlayerDAO extends JpaRepository<Player, Long> {
    Player findPlayersByIdPlayer(Long id);
}

//public interface PlayerDAO extends CrudRepository<Player, Long> { }
