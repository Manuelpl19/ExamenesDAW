# Herencia Multinivel: Sistema de Coordenadas

Ejercicio avanzado sobre **Programación Orientada a Objetos (POO)** centrado en la herencia, la reutilización de código y el encadenamiento de constructores.

## Enunciado
Implementar un sistema de clases para representar puntos en el espacio siguiendo un diagrama UML estricto:
1.  **Punto1D:** Base con coordenada `x`.
2.  **Punto2D:** Hereda de 1D y añade `y`.
3.  **Punto3D:** Hereda de 2D y añade `z`.

Requisitos técnicos:
* Uso de visibilidad `protected` (`#`).
* Implementación de 3 tipos de constructores: Defecto, Parametrizado y **Copia**.
* Sobrescritura del método `toString`.

## Conceptos Clave
* **Herencia (`extends`):** `Punto3D` tiene acceso a los atributos de `Punto1D` indirectamente.
* **Palabra clave `super`:**
    * `super(x, y)`: Fundamental para llamar al constructor de la clase superior y evitar duplicar código de inicialización.
    * `super.toString()`: Permite reutilizar la lógica de impresión del padre y añadirle solo lo nuevo.
* **Polimorfismo:** Un objeto `Punto3D` "es también" un `Punto2D` y un `Punto1D`.