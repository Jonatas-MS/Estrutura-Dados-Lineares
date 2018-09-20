package listaligada.duplamente.excecoes;

/**
 *
 * @author jonatas-ms
 */

/** exceção de um parametro ilegal de uma lista duplamente ligada*/
public class EParametroIlegal extends RuntimeException{
    
    public EParametroIlegal(String err){
        super(err);
    }
}
