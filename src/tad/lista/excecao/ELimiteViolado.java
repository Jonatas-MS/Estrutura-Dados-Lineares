package tad.lista.excecao;

/**
 *
 * @author jonatas-ms
 */

/**Lançada se for feita uma tentativa de acessar um elemento cuja
 *posição está fora do intervalo de posições da lista.
 */
public class ELimiteViolado extends RuntimeException{
    
    public ELimiteViolado(String err){
        super(err);
    }
}
