package tad.arvore.modelos;

import tad.arvore.excecoes.EPosicaoInvalida;

/**
 *
 * @author jonatas-ms
 */
public interface InterfaceArvoreGenerica extends InterfaceArvore {

    /** Adiciona um filho a um no
     * @param v posicao que vai receber este filho
     * @param o objeto que vai ficar nesta posicao*/
    public void addChild(No v, Object o);

    /** Remove e retorna um no de uma dado posicao
     *  So pode remover nos externos e que tenham um pai(não seja raiz)
     *  Pode lancar uma exeção caso a posição seja invalida
     * @param v posicao que vai remover
     * @return retorna o elemento do no removido
     */
    public Object remove(No v) throws EPosicaoInvalida;
}
