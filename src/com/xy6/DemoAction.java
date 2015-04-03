package com.xy6;  
  

  
import com.opensymphony.xwork2.ActionSupport;  
  
public class DemoAction extends ActionSupport {  
  
    public static final long serialVersionUID = 1L;  

    private DemoHelper demoHelper = new DemoHelper();  
  
    public String execute(){  
        System.out.println("---curren year:"+demoHelper.getCurYear());  
        return "success";  
    }  
}  