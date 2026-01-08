# Adivina el Número

Primer ejercicio de lógica de programación en Java. El objetivo es crear una aplicación de consola que genere un número aleatorio y guíe al usuario para adivinarlo mediante pistas.

## Enunciado
Crea una aplicación que permita adivinar un número. La aplicación debe:
1. Generar un número aleatorio del 1 al 100.
2. Pedir números al usuario repetidamente.
3. Indicar si el número buscado es mayor o menor que el introducido.
4. Controlar un límite de 10 intentos.
5. Al finalizar, mostrar el resultado (acierto con nº de intentos o game over revelando el número).

## Tecnologías y Conceptos
* **Java** (JDK 8+)
* Generación de aleatorios con `Math.random()`
* Control de flujo (`if/else`)
* Bucles (`while`)
* Entrada de datos por consola (`Scanner`)

## Cómo ejecutar
1. Compilar el archivo:
   ```bash
   javac AdivinaNumero.java