package tad.arvore.modelos;

import tad.arvore.excecoes.EPosicaoInvalida;
import java.util.Iterator;

/**
 *
 * @author jonatas-ms
 */
public class ArvoreSimples implements InterfaceArvoreGenerica {

    //atributos da arvore
    private No raiz;
    private int size;

    //contrutor
    public ArvoreSimples(Object o) {
        this.raiz = new No(null, o);
        this.size = 1;
    }

    @Override
    /**
     * adiciona um filho a um no
     */
    public void addChild(No v, Object o) {
        No no = (No) v;
        No novo = new No(no, o);
        no.addChild(novo);
        size++;
    }

    @Override
    public Object remove(No v) throws EPosicaoInvalida {
        No no = (No) v;
        No pai = no.parent();

        if (pai != null || isExternal(no)) {
            pai.removeChild(no);
        } else {
            throw new EPosicaoInvalida("Não é posivel remover o no!");
        }

        Object o = no.element();
        size--;
        return o;
    }

    @Override
    /**
     * retorna o numero de nos da arvore
     */
    public int size() {
        return size;
    }

    @Override
    /**
     * Sempre vai ser falso, pois não e permitido remover a raiz
     */
    public boolean isEmpty() {
        return false;
    }

    @Override
    /**
     * retorna a altura de um dado no
     */
    public int height(No no) {
        if (isExternal(no)) {
            return 0;
        }

        int altura = 0;

        for (Iterator<No> listafilhos = no.children(); listafilhos.hasNext();) {
            No next = listafilhos.next();
            altura = Math.max(altura, height(next));
        }
        return 1 + altura;
    }

    @Override
    public Iterator elements() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator Nos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public No root() {
        return raiz;
    }

    @Override
    /**
     * retorna o no pai de um dado no
     */
    public No parent(No v) {
        No no = (No) v;
        return (no.parent());
    }

    @Override
    /**
     * retorna os filhos de um no
     */
    public Iterator children(No v) {
        No no = (No) v;
        return no.children();
    }

    @Override
    /**
     * testa se o no e interno, 
     * se tem um ou mais filhos.
     */
    public boolean isInternal(No v) {
        No no = (No) v;
        return (no.childrenNumber() > 0);
    }

    @Override
    /**
     * testa se o no é externo, 
     * se é um no folha, não tem filhos.
     */
    public boolean isExternal(No v) {
        No no = (No) v;
        return (no.childrenNumber() == 0);
    }

    @Override
    /**
     * testa se o no é o raiz.
     */
    public boolean isRoot(No v) {
        No no = (No) v;
        return (no == raiz);
    }

    @Override
    /**
     * retorna a profundidade de um No
     */
    public int depth(No v) {
        No no = (No) v;
        int profundidade = profundidade(no);
        return profundidade;
    }

    private int profundidade(No no) {
        if (no == raiz) {
            return 0;
        } else {
            return 1 + profundidade(no.parent());
        }
    }

    @Override
    /**
     * Retorna o elemento armazenado em v é substitui por o
     */
    public Object replace(No v, Object o) {
        No no = v;
        Object elemento = no.element();
        no.setElement(o);
        return elemento;
    }

}
