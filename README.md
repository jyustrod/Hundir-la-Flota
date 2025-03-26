https://github.com/jyustrod/Hundir-la-Flota.git

# Juego Hundir la Flota - Versión Extendida

## Descripción
Este es un juego de "Hundir la Flota" desarrollado en Java, con una versión extendida que incluye diferentes tipos de barcos y mecánicas mejoradas. El proyecto utiliza **Maven** para la gestión de dependencias y organización del código.

## Características Principales
- **Diferentes tipos de barcos**:
  - **Battleship**: barco grande de 5 posiciones con contenedores aislados.
  - **Frigate**: barco mediano de 3 posiciones.
  - **Canoe**: barco pequeño de 1 posición.
- **Modo de juego**:
  - Cada jugador configura su flota antes de empezar.
  - Turnos alternos donde los jugadores atacan posiciones del oponente.
  - El juego finaliza cuando todos los barcos de un jugador están hundidos.
- **Estructuras de datos avanzadas**:
  - Uso de **tablas hash** para organizar los barcos según tipo, número y nombre.
  - **Grafo** para modelar conexiones entre puertos y calcular rutas óptimas.

## Requisitos del Sistema
- **Java 11 o superior**
- **Maven**

## Instalación y Ejecución
1. Clonar el repositorio o descargar los archivos.
2. Asegurar que Java y Maven estén instalados.
3. En la raíz del proyecto, ejecutar:
   ```sh
   mvn clean install
   mvn exec:java -Dexec.mainClass="juego.Main"

## Autores

Desarrollado para la asignatura de Técnicas de Programación en la Universidad Alfonso X El Sabio.

## Licencia

Este proyecto es de uso académico y no tiene licencia para distribución comercial.

