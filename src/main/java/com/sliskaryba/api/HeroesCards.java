package com.sliskaryba.api;

import com.sliskaryba.api.enums.Dice;

import java.util.Objects;

public class HeroesCards {
    private String name;
    private String colour;
    private int experience;
    Dice dice1;
    Dice dice2;

    public HeroesCards(final String name, final String colour, final int experience, final Dice dice1, final Dice dice2) {
        this.name = name;
        this.colour = colour;
        this.experience = experience;
        this.dice1 = dice1;
        this.dice2 = dice2;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(final String colour) {
        this.colour = colour;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(final int experience) {
        this.experience = experience;
    }

    public Dice getDice1() {
        return dice1;
    }

    public void setDice1(final Dice dice1) {
        this.dice1 = dice1;
    }

    public Dice getDice2() {
        return dice2;
    }

    public void setDice2(final Dice dice2) {
        this.dice2 = dice2;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final HeroesCards that = (HeroesCards) o;

        if (experience != that.experience) return false;
        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(colour, that.colour)) return false;
        if (dice1 != that.dice1) return false;
        return dice2 == that.dice2;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (colour != null ? colour.hashCode() : 0);
        result = 31 * result + experience;
        result = 31 * result + (dice1 != null ? dice1.hashCode() : 0);
        result = 31 * result + (dice2 != null ? dice2.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "HeroesCards{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", experience=" + experience +
                ", dice1=" + dice1 +
                ", dice2=" + dice2 +
                '}';
    }
}
