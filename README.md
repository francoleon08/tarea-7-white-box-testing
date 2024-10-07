# Tarea 7 - VyVS

Este proyecto es la resolución de la Tarea 7 de la materia Verificación y Validación de Software (VyVS). El objetivo de esta tarea es realizar **testing de caja blanca** y lograr el **100%** de cobertura con los casos de prueba.

## Estructura del Proyecto

El proyecto está estructurado de la siguiente manera:

- `build.gradle.kts`: Archivo de configuración de Gradle.
- `src/main/java/org/example/NumberClassifier.java`: Clase principal que contiene la lógica para clasificar números.
- `src/test/java/NumberClassifierTest.java`: Clase de pruebas que contiene los casos de prueba para la clase `NumberClassifier`.

## Clases y Métodos

### NumberClassifier

Esta clase contiene los siguientes métodos:

- `getNumberClassification(int number)`: Clasifica un número como positivo par, positivo impar, negativo par, negativo impar o cero.
- `isPrime(int number)`: Verifica si un número es primo.
- `isEven(int number)`: Verifica si un número es par (método privado).

### NumberClassifierTest

Esta clase contiene los casos de prueba para la clase `NumberClassifier`, incluyendo:

- Pruebas para clasificar números positivos y negativos, pares e impares, y cero.
- Pruebas para verificar números primos y no primos.

## Ejecución de Pruebas

Para ejecutar las pruebas y verificar la cobertura, puedes usar el siguiente comando de Gradle:

```sh
./gradlew test
```