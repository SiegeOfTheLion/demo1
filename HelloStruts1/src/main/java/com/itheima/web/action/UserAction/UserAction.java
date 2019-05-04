package com.itheima.web.action.UserAction;

import com.opensymphony.xwork2.ActionSupport;

/**  
 * ClassName:UserAction <br/>  
 * Function:  <br/>  
 * Date:     2019年5月4日 下午12:00:21 <br/>       
 */
public class UserAction extends ActionSupport {
    private String id;
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    
    public String getUserId(){
        
        return SUCCESS;
    }
}
  
