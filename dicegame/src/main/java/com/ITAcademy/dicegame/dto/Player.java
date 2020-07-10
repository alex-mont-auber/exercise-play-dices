package com.ITAcademy.dicegame.dto;

import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="player") // Tab Cliente
public class Player
{
    // Attributes for Player

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPlayer;

    @Column(name="name_player")
    private String playerName;

    @Column(name="percent_success")
    private int perCentSuccess;

    @Column(name="number_games")
    private int numberGames;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRegistrer;

    // Constructors

    public Player(){

    }

    public Player(Long idPlayer, String playerName, int perCentSuccess, int numberGames, Date dateRegistrer)
    {
        this.idPlayer = idPlayer;
        this.playerName = playerName;
        this.perCentSuccess = perCentSuccess;
        this.numberGames = numberGames;
        this.dateRegistrer = dateRegistrer;
    }

    public Long getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(Long idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPerCentSuccess() {
        return perCentSuccess;
    }

    public void setPerCentSuccess(int perCentSuccess) {
        this.perCentSuccess = perCentSuccess;
    }

    public int getNumberGames() {
        return numberGames;
    }

    public void setNumberGames(int numberGames) {
        this.numberGames = numberGames;
    }

    public Date getDateRegistrer() {
        return dateRegistrer;
    }

    public void setDateRegistrer(Date dateRegistrer) {
        this.dateRegistrer = dateRegistrer;
    }
}
