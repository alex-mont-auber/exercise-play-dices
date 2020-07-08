package com.ITAcademy.dicegame.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import sun.jvm.hotspot.gc.shared.Generation;

import javax.persistence.*;

@Entity
@Table(name="gamble")
public class Gamble
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGamble;

    @Column(name="dice_one")
    private int diceOne;

    @Column(name="dice_two")
    private int diceTwo;

    @Column(name="dice_three")
    private int diceThree;

    @Column(name="dice_four")
    private int diceFour;

    @Column(name="dice_five")
    private int diceFive;

    @Column(name="dice_six")
    private int diceSix;

    @Column(name="dice_result")
    private int diceResult;

    @Column(name="winner")
    private boolean winOrNot;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_player_for_gamble")
    @JsonIgnore
    private Player player;

    public Gamble() {
    }

    /*public Gamble(Long idGamble, int diceResult, boolean winOrNot)
    {
        this.idGamble = idGamble;
        this.diceResult = diceResult;
        this.winOrNot = winOrNot;
    }*/

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

    public int getDiceOne() {
        return diceOne;
    }

    public void setDiceOne(int diceOne) {
        this.diceOne = diceOne;
    }

    public int getDiceTwo() {
        return diceTwo;
    }

    public void setDiceTwo(int diceTwo) {
        this.diceTwo = diceTwo;
    }

    public int getDiceThree() {
        return diceThree;
    }

    public void setDiceThree(int diceThree) {
        this.diceThree = diceThree;
    }

    public int getDiceFour() {
        return diceFour;
    }

    public void setDiceFour(int diceFour) {
        this.diceFour = diceFour;
    }

    public int getDiceFive() {
        return diceFive;
    }

    public void setDiceFive(int diceFive) {
        this.diceFive = diceFive;
    }

    public int getDiceSix() {
        return diceSix;
    }

    public void setDiceSix(int diceSix) {
        this.diceSix = diceSix;
    }
/* public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }*/
}
