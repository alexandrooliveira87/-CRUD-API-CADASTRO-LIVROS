package tech.devinhouse.livraria.exception;

public class RegistroNaoEncontradoException extends RuntimeException{

    public RegistroNaoEncontradoException(String nomeRecurso, String id){
        super(nomeRecurso + " com identificador " + id + "não encontrato!");
    }
    public RegistroNaoEncontradoException(String nomeRecurso, Integer id) {
        this(nomeRecurso, String.valueOf(id));
    }
}
