/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package checkedexceptionfile;

/**
 *
 * @author Junio
 */
public class NomeFeioException extends Exception{
    NomeFeioException(){
        super("Nao se deve usar nomes feios.");
    }
}
