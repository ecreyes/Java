package com.gm.javadoc;

/**
 * Esta clase permite realizar operaciones de aritmetica como sumar
 * y restar.
 * @author: Eduardo Reyes
 * @version: 1.0
 */
public class Aritmetica {
    /**
     * Primer operando
     */
    private int operandoA;
    /**
     * Segundo operando
     */
    private int operandoB;
    
    /**
     * Constructor vacio de la clase.
     */
    public Aritmetica(){
        
    }
    
    
    /**
     * Este método realiza la suma de los dos operandos.
     * @param operandoA primer operando
     * @param operandoB segundo operando
     * @return int resultado de la suma
     */
    public int sumar(int operandoA,int operandoB){
        return operandoA + operandoB;
    }
    
    /**
     * Este método realiza la resta de los dos operandos
     * @param operandoA primer operando
     * @param operandoB segundo operando
     * @return int resultado de la resta
     */
    public int restar(int operandoA,int operandoB){
        return operandoA - operandoB;
    }
}
