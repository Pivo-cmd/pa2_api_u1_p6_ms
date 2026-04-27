# pa2_api_u1_p6_ms

⚙️ Contextos en Quarkus

A continuación se presentan ejemplos prácticos de los contextos:

@ApplicationScoped
@Dependent
@Singleton

---

## 🔵 ApplicationScoped

Se utiliza cuando se necesita **una sola instancia compartida en toda la aplicación**.

### Ejemplos:

1. Configuración global de la tienda (Como nombre, moneda o reglas generales)

```java
@ApplicationScoped
public class ConfiguracionTienda {}
```

2. Catálogo general de productos disponibles

```java
@ApplicationScoped
public class CatalogoProductos {}
```

3. Gestor de impuestos aplicables

```java
@ApplicationScoped
public class Impuestos {}
```

4. Administrador de promociones

```java
@ApplicationScoped
public class Promociones {}
```

5. Gestor de políticas de devolución

```java
@ApplicationScoped
public class PoliticaDevoluciones {}
```

6. Gestor de reglas de descuentos

```java
@ApplicationScoped
public class PoliticaDescuentos {}
```

7. Configuración global de envíos

```java
@ApplicationScoped
public class ParametrosEnvio {}
```

---

## 🟡 Dependent

Se usa cuando se requiere **una nueva instancia cada vez**, normalmente para objetos pequeños o específicos de una operación

### Ejemplos:

1. Representación de una orden de compra

```java
@Dependent
public class OrdenCompra {}
```

2. Representación de un ítem dentro de una factura

```java
@Dependent
public class ItemFactura {}
```

3. Representación de una dirección de entrega

```java
@Dependent
public class DireccionEntrega {}
```

4. Representación de un carrito de compra

```java
@Dependent
public class CarritoCompra {}
```

5. Representación de los datos de un cliente en una transacción

```java
@Dependent
public class DatosCliente {}
```

6. Representación de un resumen de compra

```java
@Dependent
public class ResumenCompra {}
```

7. Representación de los datos necesarios para facturación

```java
@Dependent
public class DatosFacturacion {}
```

---

## 🔴 Singleton

Este contexto garantiza que **exista una única instancia en toda la aplicación**, incluso más controlada que ApplicationScoped en algunos escenarios.

### Ejemplos:

1. Configuración general del sistema

```java
@Singleton
public class ConfiguracionSistema {}
```

2. Controlador de accesos y validaciones generales

```java
@Singleton
public class ControlAccesoSistema {}
```

3. Controlador para registro de errores del sistema

```java
@Singleton
public class RegistroErrores {}
```

4. Registro único de auditoría

```java
@Singleton
public class AuditoriaSistema {}
```

5. Controlador de sesiones activas

```java
@Singleton
public class Sesiones {}
```

6. Generador global de identificadores

```java
@Singleton
public class GeneradorIds {}
```

7. Monitor del sistema

```java
@Singleton
public class EstadoSistema {}
```

---

