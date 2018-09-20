package listaligada.duplamente.excecoes;

/**
 *
 * @author jonatas-ms
 */

/** exceção de uma lista duplamente ligada vazia*/
public class EPosicaoIlegal extends RuntimeException{
    
    public EPosicaoIlegal(String err){
        super(err);
    }
}
