package org.whale.action;

/**
 * @Author: gzip
 * @Date: 2020/6/16  22:55
 * @Description:
 **/
import com.opensymphony.xwork2.ActionSupport;
import org.whale.entity.User;
import org.whale.service.UserService;

public class TestAction extends ActionSupport {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String test(){
        User user = userService.getUser(1);
        System.out.println(user);
        return "test";
    }

    public void testAdd(){

    }
}
