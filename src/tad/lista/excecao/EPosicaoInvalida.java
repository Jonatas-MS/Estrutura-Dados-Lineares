/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad.lista.excecao;

/**
 *
 * @author jonatas-ms
 */

/**Lançada se a posição fornecida como argumento não e válida.*/
public class EPosicaoInvalida extends RuntimeException{
    
    public EPosicaoInvalida(String err){
        super(err);
    }
}
