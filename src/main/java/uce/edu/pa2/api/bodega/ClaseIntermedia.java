package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ClaseIntermedia {

    @Inject
    private AmbitoAplicacion ambitoApp;

    @Inject
    private AmbitoInyect ambitoInyect;

    @Inject
    private AmbitoSingleton ambitoSingleton;
    
    public void metodoA() {
        System.out.println(this.ambitoApp);
        System.out.println(this.ambitoApp.incrementar());
    }

    public void metodoA_Inyect() {
        System.out.println(this.ambitoInyect);
        System.out.println(this.ambitoInyect.incrementar());
    }

    public void metodoA_Singleton() {
        System.out.println(this.ambitoSingleton);
        System.out.println(this.ambitoSingleton.incrementar());
    }
    
}
