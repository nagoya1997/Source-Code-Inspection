package br.calebe.ticketmachine.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class SaldoInsuficienteException extends Exception {
  private String msg;
  public SaldoInsuficienteException(String msg){
      super(msg);
      this.msg = msg;
    } 
  }
  

