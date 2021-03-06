# Intoducción a Maven y Git-LinkedList

Programa que calcula la media y la desviación estandar de un conjunto de N numeros reales

## Inicialización

Herramientas requeridas para ejecutar el programa

### prerrequisitos

#### Java

Es una plataforma necesaria para que Maven ejecute, desde la linea de comandos comprobamos que se encuentre instalado por medio del comando:
```
> java -version

java version "1.8.0_101"
Java(TM) SE Runtime Environment (build 1.8.0_101-b13)
Java HotSpot(TM) Client VM (build 25.101-b13, mixed mode)
```

#### Maven

La estructura está estandalizada con Maven, desde la linea de comandos comprobamos que se encuentre instalado por medio del comando:
```
> mvn -v

Apache Maven 3.6.0 (97c98ec64a1fdfee7767ce5ffb20918da4f719f3; 2018-10-24T13:41:47-05:00)
Maven home: C:\apache-maven-3.6.0\bin\..
Java version: 1.8.0_201, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk1.8.0_201\jre
Default locale: es_CO, platform encoding: Cp1252
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
```

#### Git

Se usará el sistema de control de versiones Git, desde la linea de comandos comprobamos que se encuentre instalado por medio del comando:
```
> git --version

git version 2.21.0.windows.1
```

## Instalación

Para descargar localmente el repositorio se utiliza el comando como sigue:
```
> git clone https://github.com/Diego23p/AREP_1.git
```

Para compilar el proyecto usando Maven:
```
> mvn package
```

# Ejecutando el programa

Para esto es necesario que existan archivos txt los cuales contengan un conjunto de n números a los cuales se les calculará la media y la desviación estandar. El proyecto contiene algunos archivos txt de ejemplo, para ejecutarlos (tomando como ejemplo tabla1.txt) se ejecuta el siguiente comando desde la linea de comandos: 
```
> mvn exec:java -Dexec.args="tabla1.txt"
```

## Ejecutando los Test

Para ejecutar únicamente los test, se tiene el siguiente comando desde CMD:
```
> mvn test

[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running edu.escuelaing.arep.CalculatorTest
[INFO] Tests run: 10, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.271 s - in edu.escuelaing.arep.CalculatorTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 10, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  11.428 s
[INFO] Finished at: 2020-08-10T11:17:13-05:00
[INFO] ------------------------------------------------------------------------
```

Los seis primeros test evalúan el funcionamiento de la linkedList como tal y los siguientes cuatro test, prueban casos en donde debería y no debería coincidir los números esperados de media y desviación estandar.

# Descripción del Diseño

[disenoLab1.pdf](disenoLab1.pdf)

# Autores

- [Diego Alejandro Puerto Gómez](https://github.com/Diego23p)

# Licencia

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details
