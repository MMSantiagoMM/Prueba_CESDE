📌 Aplicación de Gestión de Docentes y Cursos

📖 Descripción

Esta aplicación permite la gestión de docentes y cursos, proporcionando las siguientes funcionalidades:

✅ Funcionalidades de Docentes

Crear un docente

Actualizar un docente

Buscar un docente por su documento

Listar todos los docentes

Eliminar un docente

✅ Funcionalidades de Cursos

Crear un curso

Actualizar un curso

Buscar un curso por su nombre

Listar todos los cursos

Eliminar un curso

🚀 Endpoints de la API

Entidad

Endpoint Base

Métodos Soportados

📌 Docente

api/v1/docente

POST, GET, PUT, DELETE

📌 Curso

api/v1/curso

POST, GET, PUT, DELETE

🛠 Tecnologías Utilizadas

Spring Boot (Framework principal)

Spring Data JPA (Gestor de base de datos)

MongoDB / MySQL (Base de datos, según configuración)

Swagger (Documentación interactiva de la API)

📜 Documentación con Swagger

La aplicación está bien documentada y se puede visualizar su funcionalidad utilizando Swagger.
Para acceder a la documentación, inicia la aplicación y dirígete a:

🔗 Swagger UI

O accede directamente desde el navegador:

http://localhost:8080/swagger-ui.html

https://prueba-cesde.onrender.com/swagger-ui/index.html#/ (actualización hecha después de la prueba. La app fue desplegada en un servidor remote gratuito; por lo tanto, el usuario puede acceder a la documentación sin necesidad de descargar el repositorio y correrlo en local)

📌 Instalación y Ejecución

🔹 Clonar el repositorio

git clone <URL_DEL_REPOSITORIO>
cd <NOMBRE_DEL_PROYECTO>

🔹 Configurar el archivo application.properties

Modificar los detalles de la base de datos si es necesario:

spring.data.mongodb.uri=mongodb://localhost:27017/nombreDB

🔹 Compilar y ejecutar la aplicación

mvn spring-boot:run

📌 Contacto

Si tienes alguna duda o sugerencia, no dudes en contactarnos.

💡 ¡Esperamos que disfrutes de esta API! 🚀
