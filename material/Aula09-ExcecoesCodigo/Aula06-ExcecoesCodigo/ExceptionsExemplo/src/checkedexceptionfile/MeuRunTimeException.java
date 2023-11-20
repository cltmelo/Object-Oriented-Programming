/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package checkedexceptionfile;

/**
 *
 * @author Junio
 */
public class MeuRunTimeException extends Error{
    MeuRunTimeException(){
        super("O disco pifou.");
    }
}
