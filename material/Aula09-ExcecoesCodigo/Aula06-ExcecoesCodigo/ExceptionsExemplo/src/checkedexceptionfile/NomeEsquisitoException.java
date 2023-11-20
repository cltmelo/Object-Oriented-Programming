/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package checkedexceptionfile;

/**
 *
 * @author Junio
 */
public class NomeEsquisitoException extends RuntimeException{
    NomeEsquisitoException(){
        super("Nao se deve usar nomes esquisitos.");
    }
}
