# Media de Números Pares en Array

Ejercicio introductorio al uso de **Arrays unidimensionales** y algoritmos de recorrido. El objetivo es filtrar datos específicos (números pares) dentro de un conjunto y realizar cálculos estadísticos básicos.

## Enunciado
Realiza un programa en Java que:
1. Lea 10 números enteros por teclado.
2. Los almacene en un Array.
3. Recorra el array para identificar los números pares.
4. Calcule y muestre la media (promedio) de esos números pares.

## Conceptos Clave
* **Arrays:** Estructura de datos estática para almacenar los 10 enteros.
* **Operador Módulo (`%`):** Esencial para determinar la paridad (`num % 2 == 0`).
* **Acumulador vs Contador:**
    * *Acumulador:* Suma los valores (`suma += num`).
    * *Contador:* Cuenta las ocurrencias (`total++`).
* **Manejo de Tipos:** Conversión explícita (*casting*) a `double` para obtener una media con decimales precisos.
* **Control de errores:** Evitar la división por cero si el usuario no introduce ningún número par.