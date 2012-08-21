/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo1;

import java.io.Serializable;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 *
 * @author jnaves
 */
@Interceptor
@Log
public class LogInterceptor implements Serializable {
    @AroundInvoke
    public Object logMethod(InvocationContext ctx) throws Exception {
        System.out.println(">>> Entrando no método :" + ctx.getMethod().getName());
        return ctx.proceed();
    }
}
