package com.company;

public class Main {


    public static void main(String[] args) {
Hero[] heroes ={new Magic(), new  Medic(), new Warrior()};
        for (int i = 0; i < heroes.length; i++) {
allHeroes(heroes[i]);
        }
    }
    public static void allHeroes(HavingSuperAbility obj) {
        obj.applySuperAbility();
        System.out.println(obj);

    }
}
