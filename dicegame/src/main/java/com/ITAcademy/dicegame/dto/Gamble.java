package com.ITAcademy.dicegame.dto;

import sun.jvm.hotspot.gc.shared.Generation;

import javax.persistence.*;

@Entity
@Table(name="gamble")
public class Gamble
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGamble;
    @Column(name="dice_result")
    private int diceResult;
    @Column(name="winner")
    private boolean winOrNot;

    @ManyToOne
    @JoinColumn(name="id_player_for_gamble")
    private Player player;

    public Gamble() {
    }

    public Gamble(Long idGamble, int diceResult, boolean winOrNot)
    {
        this.idGamble = idGamble;
        this.diceResult = diceResult;
        this.winOrNot = winOrNot;
    }

    public Long getIdGamble() {
        return idGamble;
    }

    public void setIdGamble(Long idGamble) {
        this.idGamble = idGamble;
    }

    public int getDiceResult() {
        return diceResult;
    }

    public void setDiceResult(int diceResult) {
        this.diceResult = diceResult;
    }

    public boolean isWinOrNot() {
        return winOrNot;
    }

    public void setWinOrNot(boolean winOrNot) {
        this.winOrNot = winOrNot;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
