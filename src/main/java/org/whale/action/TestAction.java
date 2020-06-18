package org.whale.action;

/**
 * @Author: gzip
 * @Date: 2020/6/16  22:55
 * @Description:
 **/
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.whale.entity.User;
import org.whale.service.UserService;
import org.whale.utils.MD5Utils;

import java.util.List;

public class TestAction extends ActionSupport {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    /**
     * 查
     * @return
     */
    public String test(){
        User user = userService.getUser(1);
        System.out.println(user);
        return "test";
    }

    /**
     * 增
     * @return
     */
    public void testAdd(){
        User user = new User();
        user.setUserName("张三");
        user.setPassword(MD5Utils.md5("111111"));
        user.setRemark("第一个用户");

        this.userService.doSave(user);
    }

    public void queryAll(){

        List<User> users = this.userService.queryAll();
        ActionContext.getContext().getValueStack().set("users",users);
        //登陆成功就将用户信息存入session对象
//        ActionContext.getContext().getSession().put("existEmployee", existEmployee);
        //将pageBean存入值栈中   对象用push
//        ActionContext.getContext().getValueStack().push(pageBean);
        System.out.println(users);
    }
}
