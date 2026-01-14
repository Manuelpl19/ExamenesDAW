# Tablas de Multiplicar

Ejercicio clásico para practicar la lógica de **Bucles Anidados**. El objetivo es mostrar todas las tablas de multiplicar del 1 al 10 de forma estructurada.

## 📋 Enunciado
Crea un programa que muestre por consola las tablas de multiplicar del 1 al 10.
Cada tabla debe estar separada visualmente y mostrar las operaciones del 1 al 10.

## 💡 Conceptos Clave
* **Bucles Anidados:** Uso de un bucle `for` dentro de otro.
    * El bucle **externo** (`i`) controla cuál es la tabla actual (Tabla del 1, del 2...).
    * El bucle **interno** (`j`) recorre los multiplicadores (x1, x2... x10).
* **Formato de Salida:** Uso de `System.out.printf` para alinear los números correctamente en columnas, mejorando la legibilidad respecto a una concatenación simple.