# Parcial Práctico – Programación I
## Lenguaje: Java

**Asignatura:** Programación I  
**Tema a evaluar:** Condicionales, ciclos y arreglos lineales  
**Modalidad:** Práctica individual  
**Tipo de entrega:** Proyecto en Java con código funcional  
**Entorno sugerido:** VS Code

---

## Indicaciones generales

Lea cuidadosamente cada punto antes de comenzar.

Este parcial evalúa su capacidad para **analizar un problema**, **plantear una solución lógica** y **traducirla correctamente a código Java**.  
No se entregan pasos detallados ni algoritmos previos: usted debe interpretar el problema y resolverlo con sus habilidades de programación.

### Requisitos generales
- El desarrollo debe hacerse en **Java**.
- Todos los ejercicios deben funcionar desde consola.
- Debe solicitar los datos necesarios al usuario.
- Debe mostrar resultados claros y bien presentados.
- Debe usar nombres de variables comprensibles.
- Debe aplicar correctamente estructuras condicionales, ciclos y arreglos.
- Evite valores mágicos en el código.
- Valide entradas cuando sea necesario.
- El programa debe compilar y ejecutarse sin errores.

---

# Punto 1 – Condicionales
## Sistema de clasificación de estudiantes

En un curso universitario se desea construir un programa que permita registrar la nota definitiva de un estudiante y mostrar su situación académica.

El programa debe solicitar:
- Nombre del estudiante
- Código
- Nota definitiva (valor entre 0.0 y 5.0)

Con base en la nota, el sistema debe determinar la situación del estudiante de acuerdo con las siguientes reglas:

- Si la nota está entre **0.0 y 2.9**, el estudiante **reprueba**.
- Si la nota está entre **3.0 y 3.9**, el estudiante **aprueba en nivel básico**.
- Si la nota está entre **4.0 y 4.5**, el estudiante **aprueba con buen desempeño**.
- Si la nota está entre **4.6 y 5.0**, el estudiante **aprueba con desempeño excelente**.

### Condiciones adicionales
- Si el usuario ingresa una nota fuera del rango permitido, el programa debe informar que la nota es inválida.
- El resultado final debe mostrarse con un mensaje claro que incluya el nombre del estudiante, el código, la nota y su clasificación.

### Lo que se espera evaluar en este punto
- Uso correcto de `if`, `else if` y `else`
- Validación de datos
- Salida clara por consola
- Lógica correcta en la toma de decisiones

---

# Punto 2 – Ciclos con arreglos lineales
## Análisis de temperaturas semanales

Una estación de monitoreo ambiental necesita registrar las temperaturas de una semana completa para luego analizarlas.

Construya un programa que permita:

1. Crear un arreglo lineal para almacenar **7 temperaturas**.
2. Solicitar al usuario el ingreso de cada temperatura.
3. Recorrer el arreglo y calcular:
   - La temperatura mayor
   - La temperatura menor
   - El promedio general
   - Cuántas temperaturas fueron mayores o iguales a 30 grados
   - Cuántas temperaturas fueron menores a 20 grados

4. Mostrar todas las temperaturas ingresadas.
5. Mostrar un resumen final del análisis.

### Condiciones del problema
- El ingreso de datos debe realizarse usando ciclos.
- El procesamiento del arreglo también debe hacerse usando ciclos.
- No se permite resolver el problema “a mano” con variables separadas como `t1`, `t2`, `t3`...
- Toda la lógica debe trabajar realmente sobre el arreglo.

### Lo que se espera evaluar en este punto
- Uso correcto de arreglos unidimensionales
- Captura de datos con ciclos
- Recorrido y procesamiento del arreglo
- Uso de acumuladores, contadores y comparaciones
- Organización lógica del programa

---

# Recomendaciones

- Analice primero cada problema antes de escribir código.
- Identifique claramente:
  - Entradas
  - Proceso
  - Salidas
- Piense antes de programar: Java no adivina, apenas obedece.
- Pruebe su solución con diferentes casos.

---

# Criterios generales de evaluación

Se tendrá en cuenta:

- Comprensión del problema
- Lógica de programación
- Uso correcto de estructuras condicionales
- Uso correcto de ciclos
- Uso correcto de arreglos lineales
- Claridad en la salida de datos
- Orden y legibilidad del código
- Funcionamiento correcto del programa

---
**Éxitos.**  
La idea no es adivinar el código, sino demostrar que sabe pensar como programador.
Happy Coding!!
