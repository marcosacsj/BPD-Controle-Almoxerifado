/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bpd.ultilitarios;

/**
 *
 * @author marcos.junior
 */
public class FormataData {
    public static String Banco(String dados){
        String resultado = new String();
        String[] partes = dados.split("/");
        resultado=partes[2]+"-"+partes[1]+"-"+partes[0];
        return resultado;
    }
    
}
