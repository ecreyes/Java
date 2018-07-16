# Instalación de JDK y JRE

JDK: Java Development Kit
JRE: Java Runtime Environment

JDK es el Java Development Kit o, en español, Herramientas de Desarrollo de Java. Sirve para construir programas usando el lenguaje de programación Java. 

JRE es el Java Runtime Environment o, en español, el Entorno de Ejecución de Java. Contiene a la JVM y otras herramientas que permiten la ejecución de las aplicaciones Java. JRE no posee compiladores ni herramientas para desarrollar las aplicaciones Java, solo posee las herramientas para ejecutarlas.

[Descargar JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

# Instalacion Netbeans
Se va a instalar Netbeans en español y la versión completa para windows, se puede encontrar en el siguiente enlace:

[Descargar Netbeans](https://netbeans.org/downloads/)

# JavaDoc
Para utilizar JavaDoc se deben hacer comentarios que inician con `doble *` y terminan con `*`
por ejemplo:
```=java
/**
*Formato de documentación
*de javaDoc.
*/
```
En JavaDoc se utilizan etiquetas dentro de los comentarios para referirse a algo

* @author : Nombre del autor del programa.
* @deprecated: Elemento obsoleto,es de versiones anteriores y no se recomienda el uso.
* @param: definición de un parámetro del método.
* @return: descripción de lo que devuelve el método.
* @see: indica que se asocia con otro método o clase.
* @version: versión del método o clase.

En el IDE se debe hacer click derecho en el proyecto y seleccionar Generar Javadoc para crear el Javadoc.

# Conceptos.
## Orientacion a objetos
Puede haber más de un Constructor en la Clase ya que se permite la sobre carga de métodos.
El operador `this` sirve para acceder a los atributos de la clase.

### Encapsulamiento
El encapsulamiento se encarga de aislar los datos del objeto a otros objetos y de esta forma restring al acceso directo de atributos o métodos.Para hacer esto se utilizan los modificadores de acceso y los métodos get y set.

```=java
public class Persona{
	private String nombre;

	public String getNombre(){
		return this.nombre;
	}

	public void setString(String nombre){
		this.nombre = nombre;
	}
}
```

### Static
La palabra `static` permite generar un atributo o método que es compartido por todos los objetos que son creados,por ejemplo si un objeto modifica un atributo static se modificará el valor del atributo de todos los demas objetos.

El acceso de atributos o métodos estaticos se hace mendiante la Clase, no por el objeto creado.
```=java
public class UsoDeStatic {

    public static void main(String[] args) {
        Persona p1 = new Persona("Eduardo");
        System.out.println("número de personas: "+Persona.getContadorPersona());
        System.out.println("nombre: "+p1.getNombre()+" id: "+p1.getIdPersona());
    }
    
}

class Persona{
    private String nombre;
    private int idPersona;
    private static int contadorPersona=0;
    
    Persona(String nombre){
        contadorPersona++;
        idPersona = contadorPersona;
        this.nombre = nombre;
    }
    
    public static int getContadorPersona(){
        return contadorPersona;
    }
    
    public int getIdPersona(){
        return idPersona;
    }
    
    public String getNombre(){
        return nombre;
    }
}
```

### Herencia
La herencia, como el nombre lo dice, permite crear clases que heredan atributos o métodos de la clase padre.

Sintaxis para hacer una herencia:
```=java
Class Persona{
	.....
}

Class Empleado extends Persona{
	....
}
```

Para llamar atributos,métodos o constructores de la clase padre se utiliza la palabra reservada `super`,
si en el constructor de la clase hija se desea utilizar el constructor de la clase padre más alguna inicialización de valores, se debe ingresar como primera linea dentro del contructor de la clase hija
`super(arg1,arg2,arg..)` donde los arg son los argumentos del constructor de la clase padre.

```=java
class Persona{
	private String nombre;

	Persona(String nombre){
		this.nombre = nombre;
	}

	@Override
	public String toString(){
		return "Nombre: "+nombre;
	}
}

class Empleado extends Persona{
	private int sueldo;

	Empleado(String nombre,int sueldo){
		super(nombre);
		this.sueldo = sueldo;
	}

	@Override
	public String toString(){
		return super.toString()+" sueldo: "+sueldo;
	}

}
```
También se pueden sobreescribir métodos de la clase padre utilizando `@Override`

### Sobre carga de constructores.
Significa que la clase puede tener más de un constructor, hasta un constructor puede llamar a otro utilizando `this()` pero esta debe estar en primera linea del contructor, por ejemplo:

```=java
public class Persona{
	private int edad;
	private String nombre;
	private int idPersona;
	private static int contadorPersonas=0;
	//un constructor
	private Persona(){
		contadorPersonas++;
		idPersona = contadorPersonas;
	}

	//segundo constructor
	public Persona(String nombre,int edad){
		this(); //llama al constructor Persona(),si se usa se pone primero
		this.nombre = nombre;
		this.edad = edad;
	}
}
```
También se puede llamar al constructor de la clase Padre usando `super(args)` como se vio anteriormente.

## Inicialización variables
Un objeto por default se inicializa con `null`
un int con 0 y un boolean con false.

## Memoria Stack y Heap
Memoria Stack se utiliza para almacenar las variables Locales y llamadas de funciones,tiempo de vida
es corto.
```=java
//p1 y p2 apuntan al mismo objeto en el HEAP
Persona p1 = new Persona();
Persona p2 = p1;
```

Memoria Heap se utiliza para almacenar los objetos,tienen tiempo de duracion prologando.

## Paquetes
Los paquetes en Java son como carpetas, pero estas carpetas solo deben contener Clases.
Todas las clases creadas en Java DEBEN estar dentro de un paquete.
La convención del nombre de los paquetes es la siguiente, si la empresa es google.com el paquete se debe llamar com.google.miproyecto.

```=java
//creación del paquete
package com.gm;
public class NombreClase{
	.....
	public static String imprimir(){
		return "Hola mundo";
	}
}


//uso del paquete en otra clase

//import com.gm.NombreClase.imprimir;
import com.gm.*;
public class Ejemplo{
	System.out.println(NombreClase.imprimir());
}

```

## Final
* En variables: evita cambiar el valor que almacena la variable. (es como crear una constante)
es común  utilizar final con static y más aun utilizar un import static para acceder a la variable 
directamente.

Las constantes se escriben en Mayúscula, por ejemplo `Math.PI`

* En métodos: evita que se modifique la definición de un método desde una subclase
* En clases: evita que se cree una sub clase (no se podrá hacer herencia de la clase.)

si se crea un objeto de una clase Final, no se puede cambiar la instanciacion de la clase
```=java
//se crea el objeto final
public static final Persona persona = new Persona();

//manda error si trato de modificarlo
//persona = new Persona();

//pero si puedo modificar sus atributos.
persona.setNombre("Eduardo");
```

## Argumentos Variables - varargs
Los argumentos variables permiten enviar un número indefinido de parametros a una función o método,para realizar esto se debe seguir la siguiente sintaxis:
```=java
public void nombreMetedo(tipo... args){
	//contenido
}
```
al colocar los tres puntos seguido del tipo empieza a funcionar los argumentos variables.
Los parametros enviados al método son recibidos por el argumento en formato de arreglo.

Ejemplo:
```=java
public class ArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(10,20);
        System.out.println("");
        imprimirNumeros(1,2,3,4,5,6,7,8);
    }

    public static void imprimirNumeros(int... numeros){
        int elemento;
        for (int i = 0; i < numeros.length; i++) {
            elemento = numeros[i];
            System.out.println("numero: "+elemento);
        }
    }
}
```

# Sintaxis del lenguaje

## Main para ejecutar en consola
```=java
public class Main{
	public static void main(String[] args){
		System.out.println("Hola mundo");
	}
}
```

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

## ForEach
datos es el arreglo a recorrer, elemento es la variable que recorrerá el arreglo.
```=java
for(tipo elemento:datos){
	System.out.println(elemento);
}
```

## Clases,métodos y constructor.
* modificadorDeAcceso: puede ser public,protected,private
* tipo: tipo de dato, ej: int,String,char, etc..

```java=
//Clase
modificadorDeAcceso class NombreClase{
	//atributos
	modificadorDeAcceso tipo nombreAtributo1;
	modificadorDeAcceso tipo nombreAtributo2;

	//Constructor
	modificadorDeAcceso NombreClase(tipo arg1,tipo arg2,etc..){
		//cuerpo del constructor
	}

	//Métodos
	modificadorDeAcceso tipo nombreMétodo(tipo arg1,tipo arg2,etc...){
		return dato; //si el tipo es void no lleva return.
	}

}
```

## Arreglos
Los arreglos pueden ser de tipos primitivos o de Objetos.
Empiezan desde el 0.
Los nombres de los arreglos deben ser en plural.

Declaración del arreglo, ambas formas son correctas.
```=java
//Una dimensión
tipo[] nombreArreglo = new tipo[largo];
tipo nombreArreglo[] = new tipo[largo];

//tipos Primitivos
int[] enteros = new int[4];
int enteros[] = new int[4];

boolean[] banderas = new boolean[8];
boolean banderas[] = new boolean[8];

//Tipos Object
Persona[] personas = new Persona[5];
Persona personas[] = new Persona[5];

String[] nombres = new String[6];
String nombres[] = new String[6];
```

Asignación y Obtención de datos mediante indice(lo típico)
```=java
String nombres = new String[3];
nombres[0] = "Eduardo";
nombres[1] = "Pedro";
nombres[2] = "Diego";

String palabra = nombres[1]; // palabra = "Pedro";
```

### Declaración, Instanciación e Inicialización (Forma rápida)
```=java
//sintaxis
tipo[] nombreArreglo = {lista de valores separados por coma};

//ejemplos
int[] edades = {18,19,20,21,22,23};

Persona[] personas = {new Persona(),new Persona("Pedro")};
String[] palabras = {"Hola","Mundo","Etc"};
```

## Matrices
Forma de acceso:
```=java
matriz[fila][columna];
```

Declaración
```=java
tipo[][] nombreMatriz = new tipo[filas][columnas];
tipo nombreMatriz[][] = new tipo[filas][columnas];
```
### Declaración, Instanciación e Inicialización (Forma rápida)
```=java
tipo[][] nombreMatriz = {{listaValores},{listaValores}};

//4 filas, 3 columnas
int[][] valores = {{13,14,15},{20,21,22},{30,40,50},{18,29,45}};
```