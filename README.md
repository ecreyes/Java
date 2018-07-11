# Instalación de JDK y JRE

JDK: Java Development Kit
JRE: Java Runtime Environment

JDK es el Java Development Kit o, en español, Herramientas de Desarrollo de Java. Sirve para construir programas usando el lenguaje de programación Java. 

JRE es el Java Runtime Environment o, en español, el Entorno de Ejecución de Java. Contiene a la JVM y otras herramientas que permiten la ejecución de las aplicaciones Java. JRE no posee compiladores ni herramientas para desarrollar las aplicaciones Java, solo posee las herramientas para ejecutarlas.

[Descargar JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

# Instalacion Netbeans
Se va a instalar Netbeans en español y la versión completa para windows, se puede encontrar en el siguiente enlace:

[Descargar Netbeans](https://netbeans.org/downloads/)

# Sintaxis del lenguaje

## Operadores logicos y relacionales
```java=
&& //AND
|| //OR
> //mayor
>= //mayor o igual
< //menor
<= //menor o igual
== //igual
!= //distinto
```

## If
```java=
if(condition){

}else{

}

if(condition){

}else if(condition){

}else{

}
```

## Switch
```java=
switch (expresion){
	case valor1:
		//sentencias
		break;
	case valor2:
		//sentencias
		break;
	case valorN:
		//sentencias
		break;
	default:
		//sentencias
}
```

## While
```java=
while(condition){
	//código a repetir
}
```
## For
```java=
for(int i = 0; i < 10; i++){
	System.out.println("i: "+i);
}
```

## Clases,métodos y constructor.
* modificadorDeAcceso: puede ser public,protected,private
* tipo: tipo de dato, ej: int,String,char, etc..

Puede haber más de un Constructor en la Clase ya que se permite la sobre carga de métodos.

```java=
//Clase
modificadorDeAcceso class NombreClase{
	//atributos
	modificadorDeAcceso tipo nombreAtributo1;
	modificadorDeAcceso tipo nombreAtributo2;

	//Constructor
	NombreClase(tipo arg1,tipo arg2,etc..){
		//cuerpo del constructor
	}

	//Métodos
	modificadorDeAcceso tipo nombreMétodo(tipo arg1,tipo arg2,etc...){
		return dato; //si el tipo es void no lleva return.
	}

}
```