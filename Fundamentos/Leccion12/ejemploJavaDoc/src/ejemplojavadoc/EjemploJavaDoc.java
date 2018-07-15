/**
 * Derechos reservados
 */
package ejemplojavadoc;

import com.gm.javadoc.Aritmetica;
/**
 * Ejemplo de JavaDoc
 * @author Eduardo Reyes
 * @version 1.0
 */

public class EjemploJavaDoc {
    /**
     * Método que ejecuta la clase de prueba Aritmetica.
     * @param args argumentos linea de comandos
     */
    public static void main(String[] args) {
        Aritmetica a1 = new Aritmetica();
        System.out.println("resultado suma: "+a1.sumar(2,3));
        System.out.println("resultado resta: "+a1.restar(2,3));
    }    
}
