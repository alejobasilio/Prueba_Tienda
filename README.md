# Prueba Tienda

Prueba Tienda es un proyecto de comercio que permite a los usuarios crear y gestionar pedidos de productos.

> [!IMPORTANT]
> ## Instalación
> 1. **Crear la base de datos**:
> * Abre MySQL Workbench y crea una nueva base de datos con el nombre que desees (por ejemplo, `pruba_tienda`).
> * Ejecuta el script de creación de la base de datos que se encuentra en el archivo `schema.sql` en la raíz del proyecto.
> 2. **Configurar la conexión a la base de datos**:
> * Abre el archivo `application.properties` en la carpeta `src/main/resources` y actualiza las propiedades de conexión a la base de datos con tus credenciales de MySQL:
> + `spring.datasource.url=jdbc:mysql://localhost:3306/pruba_tienda`
> + `spring.datasource.username=tu_usuario`
> + `spring.datasource.password=tu_contraseña`
> 3. **Instalar las dependencias**:
> * Ejecuta el comando `mvn clean install` en la terminal para instalar las dependencias del proyecto.
>
>   ## Requisitos
> El proyecto requiere los siguientes requisitos técnicos:
> * Java 11 o superior
> * Maven 3.6 o superior
> * Spring Boot 2.3 o superior

## Funcionalidades

El proyecto incluye las siguientes funcionalidades:

* Crear y borrar pedidos de productos
