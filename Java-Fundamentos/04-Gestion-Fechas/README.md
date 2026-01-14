# Gestión de Fechas (POO Avanzada)

Ejercicio completo de implementación de una clase `Fecha` basada en un diagrama de clases UML estricto. Se pone a prueba el encapsulamiento y la lógica de validación de fechas reales.

## Requisitos del Ejercicio
Se debe implementar la clase siguiendo estas reglas de negocio:
1. **Encapsulamiento:** Atributos privados (`dia`, `mes`, `ano`) accesibles solo mediante getters/setters.
2. **Validación Cruzada:** - Un cambio de mes debe validar si el día actual es compatible.
   - Un cambio de año debe verificar si afecta a un 29 de febrero (bisiestos).
3. **Persistencia del valor:** Si se intenta asignar un valor inválido a través de un *setter*, **se debe mantener el valor anterior**, no modificarlo.
4. **Bisiestos:** Implementación manual de la lógica de años bisiestos (`% 400` o `% 4 && !% 100`).
5. **Formato:** Salida formateada obligatoria `DD/MM/AAAA` (con ceros a la izquierda).

## Lógica Implementada
* **Constructor Seguro:** Si la fecha pasada al constructor no es válida, se inicializa a la fecha *Epoch* por defecto (`01/01/1970`).
* **Método `diaMaximoMes`:** Switch case optimizado para devolver los días según el mes y si el año es bisiesto.
* **String Format:** Uso de `String.format("%02d", ...)` para cumplir con el requisito visual.

