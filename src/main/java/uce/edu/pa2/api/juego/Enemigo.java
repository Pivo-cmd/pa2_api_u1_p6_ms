package uce.edu.pa2.api.juego;

public class Enemigo {
    private int vida = 20;
    public Enemigo(){

    }
    public void recibirDanio(int danio){
        vida -= danio;
    }
    public boolean estaVivo(){
        return vida > 0;
    }
}
