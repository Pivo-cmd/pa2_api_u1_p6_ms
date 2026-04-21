package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {
    public static void main(String... args) {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {
        
        @Inject
        private AmbitoAplicacion ambitoApp;
        
        @Inject
        private ClaseIntermedia claseInter;

        @Inject
        private AmbitoRequest ambitoReq;

        @Inject
        private AmbitoSingleton ambitoSingleton;
        
        @Inject
        private AmbitoInyect ambitoInyect;
        @Override 
        public int run(String... args) throws Exception {
            
            System.out.println(this.ambitoApp);

            System.out.println(this.ambitoApp.incrementar());
            System.out.println(this.ambitoApp.incrementar());
            System.out.println(this.ambitoApp.incrementar());

            this.claseInter.metodoA();

            //System.out.println("---Ambito request---");
            //System.out.println(this.ambitoReq.incrementar());
            //System.out.println(this.ambitoReq.incrementar());
            //System.out.println(this.ambitoReq.incrementar());
            
            System.out.println("---Ambito Dependent---");
            System.out.println(this.ambitoInyect.incrementar());
            System.out.println(this.ambitoInyect.incrementar());
            System.out.println(this.ambitoInyect.incrementar());
            
            this.claseInter.metodoA_Inyect();

            System.out.println("---Ambito Singleton---");
            System.out.println(this.ambitoSingleton);
            System.out.println(this.ambitoSingleton.incrementar());
            System.out.println(this.ambitoSingleton.incrementar());
            System.out.println(this.ambitoSingleton.incrementar());
            
            this.claseInter.metodoA_Singleton();

            return 0;
        }
    }
}
