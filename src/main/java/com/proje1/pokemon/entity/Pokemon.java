package com.proje1.pokemon.entity;

import jakarta.persistence.*;

@Entity
@Table(name="pokemon")
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String firstName;

    @Column(name="hp")
    private int hp;

    @Column(name="attack")
    private int attack;

    @Column(name="defense")
    private int defense;

    @Column(name="special")
    private int special;

    @Column(name="speed")
    private int speed;

    public Pokemon() {
    }

    public Pokemon(String firstName, int hp, int attack, int defense, int special, int speed) {
        this.firstName = firstName;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.special = special;
        this.speed = speed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpecial() {
        return special;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", hp=" + hp +
                ", attack=" + attack +
                ", defense=" + defense +
                ", special=" + special +
                ", speed=" + speed +
                '}';
    }
}
