package com.juansenen.emilibase.exception;

public class LorryNoFoundException extends Exception{

    public LorryNoFoundException(){
        super("Lorry no found");
    }

    public LorryNoFoundException (String message){
        super(message);
    }
}
