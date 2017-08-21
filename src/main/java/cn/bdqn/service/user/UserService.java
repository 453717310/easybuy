package cn.bdqn.service.user;

import cn.bdqn.pojo.Easybuy_user;
import cn.bdqn.service.BaseService;
import org.springframework.stereotype.Service;

/**
 * Created by dll on 2017/8/17.
 */

public interface UserService extends BaseService<Easybuy_user> {
    /**
     * 用户登录
     * @param loginName 用户名
     * @param password 密码
     * @return 用户
     */
    public Easybuy_user login(String loginName,String password) throws Exception;
    /**
     * 用户注册
     * @param user 用户对象
     * @throws Exception
     */
    public void regist(Easybuy_user user) throws Exception;
}
