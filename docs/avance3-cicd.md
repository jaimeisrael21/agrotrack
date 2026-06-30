# Avance 3: evidencias CI/CD

Este documento resume las evidencias que se deben capturar para el informe del tercer avance.

## Evidencias

1. Estructura del repositorio con `.github/workflows/ci.yml`, `qa.yml` y `cd.yml`.
2. Historial de commits con las tres versiones del programa `ControlCalidad.java`.
3. Ejecucion exitosa del workflow de Integracion Continua sobre `develop`.
4. Pull Request desde `develop` hacia `main` con el check de Control de Calidad en verde.
5. Ejecucion exitosa del workflow de Despliegue Continuo sobre `main`.

## Versiones del programa

- Version 1: calcula el promedio con `int` y no valida los calibres ingresados.
- Version 2: valida que cada muestra de calibre este entre 1 y 100.
- Version 3: calcula el promedio como `double` para conservar decimales.
