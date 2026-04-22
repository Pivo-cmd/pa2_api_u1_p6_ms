package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import uce.edu.pa2.api.juego.Jugador;

@QuarkusMain
public class Main {
    public static void main(String... args) {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {
        
        @Inject
        private Jugador mario;

        @Override
        public int run(String... args) {
            System.out.println("Iniciando el juego...");
            mario.combatir();
            mario.combatir();
            
            return 0;
        }
    }
}
