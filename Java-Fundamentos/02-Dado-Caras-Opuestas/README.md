# Ejercicio: Caras Opuestas del Dado

Segundo ejercicio de la colección. El objetivo es trabajar con validación de entradas, lógica aritmética simple y estructuras de selección múltiple (`switch`).

## Enunciado
Realiza un programa que:
1. Pida por teclado el resultado obtenido al lanzar un dado de seis caras (entero).
2. Valide si el número es correcto (1-6). Si no, muestra error.
3. Calcule la cara opuesta (1-6, 2-5, 3-4).
4. Muestre por pantalla el número de la cara opuesta **en letras**.

## Lógica Aplicada
Para evitar múltiples condicionales anidados (`if-else`), se ha aplicado la propiedad matemática de los dados estándar:
> **La suma de caras opuestas es siempre 7.**

Por tanto, la fórmula `opuesto = 7 - input` simplifica el cálculo. Posteriormente se utiliza un `switch` para el mapeo a String.
