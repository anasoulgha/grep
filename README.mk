# Proyecto Java: Ejecución de un Proceso Externo (`grep`)

Este proyecto demuestra cómo ejecutar un **proceso externo** (`grep`) desde Java, enviarle texto por su entrada estándar y capturar su salida en la consola.  
Incluye un test con **JUnit 5** para verificar el comportamiento del programa.

---

## Contenido del proyecto

- Clase principal: `PadreGrep`
- Test con JUnit 5 para validar la salida del programa

---

## Descripción del programa

La clase `PadreGrep` realiza los siguientes pasos:

1. Ejecuta el comando `grep psp` como proceso hijo.
2. Envía varias líneas de texto a la entrada del proceso.
3. Captura la salida del proceso y la imprime por consola.
4. Solo se muestran las líneas que contienen la palabra exacta `psp`.

---

### Ejemplo de salida esperada

Me gusta psp y java
psp se programa en java
y se programa de forma concurrente en psp
psp es programación