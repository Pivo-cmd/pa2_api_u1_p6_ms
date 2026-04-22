package uce.edu.pa2.api.juego;

import jakarta.inject.Singleton;

@Singleton
public class MotorJuego {

    private int enemigosDerrotados = 0;

    public void registrarDerrota() {
        enemigosDerrotados++;
    }

    public int getTotalEnemigosDerrotados() {
        return enemigosDerrotados;
    }
}
