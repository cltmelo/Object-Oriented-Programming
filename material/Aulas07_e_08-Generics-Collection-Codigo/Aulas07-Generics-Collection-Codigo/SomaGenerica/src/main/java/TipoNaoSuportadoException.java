/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jose F Rodrigues-Jr
 */
public class TipoNaoSuportadoException extends Exception{
    public TipoNaoSuportadoException(){
        super("ERRO: o tipo usado para parametrizar a classe nao eh suportado");
    }
}
