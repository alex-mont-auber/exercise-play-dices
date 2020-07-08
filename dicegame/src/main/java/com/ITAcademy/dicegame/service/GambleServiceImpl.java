package com.ITAcademy.dicegame.service;

import com.ITAcademy.dicegame.dto.Gamble;
import com.ITAcademy.dicegame.dao.GambleDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GambleServiceImpl implements InterfaceGambleService
{
    @Autowired
    GambleDAO gambleDAO;

    @Override
    public List<Gamble> findAllByPlayerId(Long id) {
        return gambleDAO.findAllByPlayerIdPlayer(id);
    }

    /*@Override
    public void eraseGamble() { return gambleDAO.deleteAll();}*/
}
