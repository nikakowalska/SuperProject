package com.sliskaryba.api;

import com.sliskaryba.api.enums.Dice;

import java.util.List;

public class Menu {
    public String displayA() {
                return "A - Show monster's cards";
    }
    public String displayB() {
                return "B - Show heroes cards";
    }
    public String displayMonsters() {
        return List.of((new MonstersCards("Slasher", 2,3,4,"blue"))).toString();
    }
    public String displayHeroes() {
        return List.of((new HeroesCards("Catrambo", "black",3, Dice.ONE,Dice.TWO))).toString();
    }}
