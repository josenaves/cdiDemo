/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo1;

import javax.enterprise.inject.Alternative;

/**
 *
 * @author jnaves
 */
@Alternative
public class Alcool implements Combustivel {
    @Override
    public String toString() {
        return "álcool";
    }
}
