package com.sliskaryba.api;

import java.util.List;
import java.util.Objects;

public class MonstersCards {
    private String name;
    private int healthPoints;
    private int victoryPoints;
    private int heroExp;
    private String heroColour;
    private List<MonstersCards> monsters;

    public MonstersCards(final String name, final int healthPoints, final int victoryPoints, final int heroExp, final String heroColour) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.victoryPoints = victoryPoints;
        this.heroExp = heroExp;
        this.heroColour = heroColour;

    }


    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(final int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getVictoryPoints() {
        return victoryPoints;
    }

    public void setVictoryPoints(final int victoryPoints) {
        this.victoryPoints = victoryPoints;
    }

    public int getHeroExp() {
        return heroExp;
    }

    public void setHeroExp(final int heroExp) {
        this.heroExp = heroExp;
    }

    public String getHeroColour() {
        return heroColour;
    }

    public void setHeroColour(final String heroColour) {
        this.heroColour = heroColour;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final MonstersCards that = (MonstersCards) o;

        if (healthPoints != that.healthPoints) return false;
        if (victoryPoints != that.victoryPoints) return false;
        if (heroExp != that.heroExp) return false;
        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(heroColour, that.heroColour)) return false;
        return Objects.equals(monsters, that.monsters);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + healthPoints;
        result = 31 * result + victoryPoints;
        result = 31 * result + heroExp;
        result = 31 * result + (heroColour != null ? heroColour.hashCode() : 0);
        result = 31 * result + (monsters != null ? monsters.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MonstersCards{" +
                "name='" + name + '\'' +
                ", healthPoints=" + healthPoints +
                ", victoryPoints=" + victoryPoints +
                ", heroExp=" + heroExp +
                ", heroColour='" + heroColour + '\'' +
                ", monsters=" + monsters +
                '}';
    }
}
