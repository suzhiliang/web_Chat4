//管理员拦截器拦截器
package com.szl.interceptor;
import java.util.Map;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.szl.model.Manager;

public class ManagerAuthenticationInterceptor implements Interceptor  {

	 private static final long serialVersionUID = 1L;
	 
     private String message;
	
     public static final String MANAGER_SESSION_KEY = "ManagerSessionKey";
	 
	 public void destroy() {}

	 public void init() {}

     public String intercept(ActionInvocation actionInvocation) throws Exception {
		
         Map session = actionInvocation.getInvocationContext().getSession();
		
         Manager manager = (Manager) session.get(MANAGER_SESSION_KEY);
         
         if (manager==null) {
        	 this.setMessage("该管理员不存在");
            return Action.INPUT;           
         }        
         return actionInvocation.invoke();//     
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}