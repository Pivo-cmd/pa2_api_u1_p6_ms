package uce.edu.pa2.api.juego;

import java.util.Random;

import jakarta.enterprise.context.Dependent;

@Dependent
public class Habilidad {

    private int danio;

    public Habilidad(){
        this.danio = new Random().nextInt(10) + 5;
    }

    public int getDanio(){
        return danio;
    }
}
