package it.unicam.cs.lc2122.gedcom.ancdesc;

/**
 * Rappresenta un eccezione di un tag che non pu&ograve; essere ripetuto pi&ugrave; volte.
 */
public class RepeatedTagException extends RuntimeException {

    public RepeatedTagException(String message){
        super(message);
    }
}
