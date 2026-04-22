package uce.edu.pa2.api.juego;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Partida {

    private int oro = 0;
    private int experiencia = 0;

    public Partida(){
        
    }

    public void ganarRecompensa(int oro, int exp) {
        this.oro += oro;
        this.experiencia += exp;
    }
    
    public int getOro() {
        return oro;
    }
    
    public int getExperiencia() {
        return experiencia;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}
