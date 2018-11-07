## Pokemon

[![Build Status](https://travis-ci.org/tomasBustamante/Pokemon.svg?branch=master)](https://travis-ci.org/tomasBustamante/Pokemon) [![codecov](https://img.shields.io/codecov/c/github/dwyl/hapi-auth-jwt2.svg?maxAge=2592000)](https://codecov.io/gh/tomasBustamante/Pokemon)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/2bc54b6684cc40eb8248b9dbba11d462)](https://app.codacy.com/app/tomasBustamante/Pokemon?utm_source=github.com&utm_medium=referral&utm_content=tomasBustamante/Pokemon&utm_campaign=Badge_Grade_Dashboard)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

Ejemplo de código de modelado entre ataques de Pokemones con integración contínua.

### Instalación previa
Las únicas herramientas necesarias para trabajar en el proyecto son el entorno de desarrollo de Java ([JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)), [Apache Ant](https://ant.apache.org/) para la construcción automatizada y Git para el control de versiones.
```console
$ sudo apt update
$ sudo apt install default-jdk ant git
```
Verificamos que se hayan instalado correctamente:

```console
$ javac -version
javac 1.8.0_181
$ ant -version
Apache Ant(TM) version 1.10.1 compiled on February 2 2017
$ git --version
git version 2.17.1
```
### Procedimiento
La primera vez se inicia el repositorio local para trabajar:
```console
$ mkdir Pokemon
$ cd Pokemon
$ git init
$ git remote add origin https://github.com/tomasBustamante/Pokemon.git
```
Luego se realiza un *pull* del repositorio remoto para obtener la última versión del código:
```console
$ git pull origin master
```
Una vez agregados y/o modificados los archivos necesarios se ejecuta Ant sobre el repositorio local para verificar que el *build* sea exitoso.

Antes de integrar se debe asegurar de que el proceso de construcción resulte satisfactorio de manera local (incluyendo la ejecución de las pruebas):

```console
$ ant test
...
BUILD SUCCESSFUL
Total time: 5 seconds
```

Finalmente se procede a subirlos al repositorio remoto:
```console
$ git add .
$ git commit -m "Comentario del commit"
$ git push origin master
```
Una vez hecho el push, Travis se encarga de ejecutar el script de Ant en el repositorio de integración contínua y se notificará a todos los colaboradores en caso de error.

El historial de construcciones en Travis puede verse [aquí](https://travis-ci.org/tomasBustamante/Pokemon/builds) y la medición de cobertura con CodeCov [aquí](https://codecov.io/gh/tomasBustamante/Pokemon).
