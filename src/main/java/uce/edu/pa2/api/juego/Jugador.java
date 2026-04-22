package uce.edu.pa2.api.juego;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class Jugador {
    
    @Inject
    MotorJuego motorJuego;
    
    @Inject
    Partida partida;

    public void combatir(){
        Enemigo enemigo = new Enemigo();
        System.out.println("----Nuevo Combate-----");
        while(enemigo.estaVivo()){
            Habilidad accion = crearHabilidad();
            int danio = accion.getDanio();
            System.out.println("Daño causado: " + danio);

            enemigo.recibirDanio(danio);
        }
        motorJuego.registrarDerrota();
        partida.ganarRecompensa(10,20);
        System.out.println("Enemigo derrotado. Oro: " + partida.getOro() + ", Experiencia: " + partida.getExperiencia());
        System.out.println("Total enemigos derrotados: " + motorJuego.getTotalEnemigosDerrotados());
        System.out.println("-----------------------");
    }

    @Inject
    public Habilidad crearHabilidad(){
        return new Habilidad();
    }

}
