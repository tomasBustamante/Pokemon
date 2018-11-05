## Pokemon

[![Build Status](https://travis-ci.org/tomasBustamante/Pokemon.svg?branch=master)](https://travis-ci.org/tomasBustamante/Pokemon)

Ejemplo de código de modelado entre ataques de Pokemones con integración contínua.

### Instalación previa
Las únicas herramientas necesarias para trabajar en el proyecto son el entorno de desarrollo de Java ([JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)), [Apache Ant](https://ant.apache.org/) para la construcción automatizada y Git para el control de versiones.
```
$ sudo apt update
$ sudo apt install default-jdk ant git
```
Verificamos que se hayan instalado correctamente:

```
$ javac -version
javac 1.8.0_181
$ ant -version
Apache Ant(TM) version 1.10.1 compiled on February 2 2017
$ git --version
git version 2.17.1
```
### Procedimiento
La primera vez se clona el repositorio creando un repositorio local para trabajar:
```
$ git clone https://github.com/tomasBustamante/Pokemon.git
$ cd Pokemon
```
Una vez agregados y/o modificados los archivos necesarios se procede a subirlos al repositorio remoto:
```
$ git add .
$ git commit -m "Comentario del commit"
$ git push origin master
```
Una vez hecho el push, Travis se encarga de ejecutar el script de Ant en el repositorio de integración contínua y se notificará a todos los colaboradores en caso de error.
