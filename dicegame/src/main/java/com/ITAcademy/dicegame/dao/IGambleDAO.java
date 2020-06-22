package com.ITAcademy.dicegame.dao;

import com.ITAcademy.dicegame.dto.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGambleDAO extends JpaRepository<Player, Long> {
}
