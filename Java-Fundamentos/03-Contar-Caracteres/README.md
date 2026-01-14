# 🔡 Ejercicio: Contador de Caracteres

Tercer ejercicio de la colección. Nos introducimos en el manejo de Cadenas de Texto (`String`) y su tratamiento como arrays de caracteres.

## 📋 Enunciado
Realiza un programa que:
1. Pida una cadena de texto (frase o palabra) por teclado.
2. Pida un carácter específico.
3. Recorra la cadena y cuente cuántas veces aparece dicho carácter.
4. Muestre el resultado final.

## 💡 Conceptos Clave
* **String como Array:** En Java, los Strings no son primitivos, son objetos, pero podemos acceder a sus letras individuales mediante el índice con el método `.charAt(index)`.
* **Entrada de caracteres:** La clase `Scanner` no posee un método `nextChar()`, por lo que se utiliza la técnica `next().charAt(0)`.
* **Bucles:** Uso del bucle `for` para iterar `n` veces, donde `n` es la longitud de la cadena (`.length()`).
