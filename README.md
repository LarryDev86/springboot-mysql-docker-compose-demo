# Spring Boot + MySQL con Docker Compose

Repositorio de **demo técnica** para practicar la dockerización de una aplicación **Java + Spring Boot** conectada a **MySQL**, utilizando **Docker** y **Docker Compose**.

El foco del proyecto está en la **configuración, orquestación y buenas prácticas**, no en la complejidad funcional de la aplicación.

---

## **Tecnologías**

* Java 17
* Spring Boot
* MySQL
* Docker
* Docker Compose

---

## **Arquitectura**

El entorno está compuesto por dos servicios:

* **app**: Aplicación Spring Boot construida mediante un `Dockerfile`
* **mysql**: Base de datos MySQL ejecutándose en un contenedor

La orquestación se realiza con **Docker Compose**, incluyendo:

* Variables de entorno para configuración
* `healthcheck` en MySQL
* Arranque controlado de la aplicación (`depends_on`)

---

## **Ejecución**

> ⚠️ El archivo `docker-compose.yml` real no se incluye por contener credenciales.
> Se proporciona `docker-compose.example.yml` como referencia de la configuración.

```bash
docker compose up --build
```

La aplicación quedará disponible en:

```
http://localhost:8080
```

---

## **Funcionalidad**

La aplicación expone un endpoint principal (`/`) que devuelve una vista HTML mostrando los registros almacenados en una tabla de MySQL.

---

## **Objetivo**

Este proyecto sirve como práctica de:

* Dockerización de aplicaciones Java
* Uso de Docker Compose en entornos multi-contenedor
* Separación de configuración sensible
* Despliegue local reproducible

---

## **Autor**

Proyecto desarrollado con fines formativos.
