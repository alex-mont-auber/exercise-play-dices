package com.ITAcademy.dicegame.dao;

import com.ITAcademy.dicegame.dto.Gamble;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IPlayerDAO extends JpaRepository<Gamble, Long> {
}
