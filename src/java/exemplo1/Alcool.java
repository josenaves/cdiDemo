/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo1;

import java.io.Serializable;
import javax.enterprise.inject.Alternative;

/**
 *
 * @author jnaves
 */
@Alternative
public class Alcool implements Combustivel, Serializable {
    @Override
    public String toString() {
        return "álcool";
    }
}
