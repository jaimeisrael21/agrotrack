# AgroTrack

AgroTrack es el caso academico de gestion de versiones para el sistema de trazabilidad agroexportadora de AgroXport Peru S.A.C.

## Avance 3: CI/CD

El avance final implementa un modulo Java de control de calidad de lote y automatiza su paso por desarrollo, QA y produccion mediante GitHub Actions.

## Estructura

```text
agrotrack/
├── .github/
│   └── workflows/
│       ├── ci.yml
│       ├── qa.yml
│       └── cd.yml
├── src/
│   └── ControlCalidad.java
├── test/
│   └── ControlCalidadTest.java
├── docs/
│   └── avance3-cicd.md
├── README.md
└── .gitignore
```

## Flujo de trabajo

- `develop`: recibe los commits de desarrollo y ejecuta Integracion Continua.
- Pull Request `develop` -> `main`: ejecuta la compuerta de Control de Calidad.
- `main`: representa la version aprobada y ejecuta el despliegue continuo simulado.

## Prueba local

```bash
mkdir -p out
javac -d out src/ControlCalidad.java test/ControlCalidadTest.java
java -cp out ControlCalidadTest
java -cp out ControlCalidad 24 26 25
```
