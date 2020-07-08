package com.ITAcademy.dicegame.dao;

import com.ITAcademy.dicegame.dto.Gamble;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GambleDAO extends JpaRepository<Gamble, Long>
{
    List<Gamble> findAllByPlayerIdPlayer(Long id);
}
