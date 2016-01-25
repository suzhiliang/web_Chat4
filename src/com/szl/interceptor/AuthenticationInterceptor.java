//用户拦截器
package com.szl.interceptor;
import java.util.Map;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.szl.model.User;
import com.szl.util.Constants;
public class AuthenticationInterceptor implements Interceptor  {

	 private static final long serialVersionUID = 1L;
	 
	 private String message;
	
    public static final String USER_SESSION_KEY = "UserSessionKey";
	 
	 public void destroy() {}

	 public void init() {}

     public String intercept(ActionInvocation actionInvocation) throws Exception {
		
         Map session = actionInvocation.getInvocationContext().getSession();
		
         User user = (User) session.get(USER_SESSION_KEY);
         
         if (user==null||user.getGrade().equals(Constants.BLACK_LEVEL)) {
        	 this.setMessage("该用户不存在或已被拉入黑名单");
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