package uce.edu.pa2.api.bodega;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MedirTiempo
@Interceptor
public class MedirTiempoInterceptor {
    @AroundInvoke
    public Object tiempo(InvocationContext context) throws Exception {
        System.out.println("(Interceptor) Ejecucion antes del metodo de negocio");
        long inicio = System.currentTimeMillis();

        //Inicia la ejecucion del metodo
        //Si no se llama al metodo proceed, no se ejecuta
        Object resultado = context.proceed();
        //Pasa a la linea 17 una vez termina de ejecutar metodo de negocio
        long fin = System.currentTimeMillis();
        long duracion = fin - inicio;
        System.out.println("(Interceptor) Tiempo transcurrido: " + duracion + "ms" + "\n");
        return resultado;
    }
}
