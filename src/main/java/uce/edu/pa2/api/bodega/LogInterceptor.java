package uce.edu.pa2.api.bodega;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Log
@Interceptor
@Priority(1)
public class LogInterceptor {
    @AroundInvoke
    public Object tiempo(InvocationContext context) throws Exception {
        System.out.println("(Interceptor Log) Ejecucion LOG antes del metodo de negocio");
        System.out.println("Interceptado metodo: " + context.getMethod().getName());
        Object[] argumentos = context.getParameters();
        
        for (Object argumento : argumentos) {
            Venta venta = (Venta) argumento;
            System.out.println("Argumento: " + venta.getCliente() + " - " + venta.getTotal());
        }

        Object resultado = context.proceed();
      
        return resultado;
    }
}
