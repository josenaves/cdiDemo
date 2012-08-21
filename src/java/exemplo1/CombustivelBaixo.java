/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo1;

import java.io.Serializable;
import javax.inject.Named;

/**
 *
 * @author jnaves
 */
@Named
public class CombustivelBaixo implements Serializable {
    private String mensagem;
    
    public CombustivelBaixo() {
        this.mensagem = "Nível de combustível baixo! Abastecer imediatamente!";
    }
    
    public String getMensage() {
        return this.mensagem;
    }
}
