package cn.bdqn.pojo;

import cn.bdqn.service.user.UserService;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;


import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by dll on 2017/8/18.
 */
public class Easybuy_userTest {
    private Logger logger=Logger.getLogger(Easybuy_userTest.class);
    private UserService userService;

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    @Before
    public void test01(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:application-mybatis.xml");
         userService = (UserService) ac.getBean("userService");
    }
    @Test
    public void loginTest(){

        try {
            Easybuy_user admin = userService.login("admin", "123456");
            if (admin!=null){
                logger.debug("登录成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void registTest(){
        Easybuy_user user=new Easybuy_user();
        user.setEmail("123@qq.com");
        user.setIdentityCode("412828198802063039");
        user.setLoginName("admin1");
        user.setMobile("13552883711");
        user.setPassword("1234567");
        user.setUserName("张三");
        user.setSex(1);
        try {
            userService.regist(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}