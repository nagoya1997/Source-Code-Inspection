package br.calebe.ticketmachine.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoedaInvalidaException extends Exception {
    private String msg;   
    public PapelMoedaInvalidaException(String msg){   
    super(msg);  
    this.msg = msg;   
    }   
    
}
