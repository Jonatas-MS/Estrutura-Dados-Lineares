package tad.vetor.excecao;

/**
 *
 * @author jonatas-ms
 */
public class EIndiceForaDosLimites extends RuntimeException{
    
    //Uma exceção é disparada se uma colocação incorreta é especificada
    public EIndiceForaDosLimites(String err){
        super(err);
    }
}
