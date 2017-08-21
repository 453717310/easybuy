package cn.bdqn.controller;

import cn.bdqn.pojo.Easybuy_user;
import cn.bdqn.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by dll on 2017/8/17.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource(name = "userService")
    private UserService userService;

    /**
     * 注册
     * @param user 前台传过user数据
     * @return 重定向到登录界面
     */
    @RequestMapping(value = "/regist",method = RequestMethod.GET)
    public String regist(){

        return "user/regist";
    }
    @RequestMapping(value = "/regist",method = RequestMethod.POST)
    public String regist(Easybuy_user user){
        try {
            userService.regist(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/user/login";
    }

    /**
     *
     * @return 返回到登录界面
     */
    @RequestMapping(value = "/login.html" ,method = RequestMethod.GET)
    public String login(){
        return "user/login";
    }

    /**
     *获得登录用户
     * @param loginName 登录名
     * @param password  密码
     * @return
     */
    @RequestMapping(value = "/login.html",method = RequestMethod.POST)
    public String login(String loginName, String password, HttpSession session){
        try {
            Easybuy_user user = userService.login(loginName, password);
            if (user!=null){
                session.setAttribute("user",user);
                return "redirect:/user/list.html";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "user/login";
    }
    @RequestMapping("/list.html")
    public String indexList(){

        return null;
    }
}
