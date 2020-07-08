package com.ITAcademy.dicegame.dao;

import com.ITAcademy.dicegame.dto.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PlayerDAO extends JpaRepository<Player, Long> { }

//public interface PlayerDAO extends CrudRepository<Player, Long> { }
