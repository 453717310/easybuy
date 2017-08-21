package cn.bdqn.dao.user;

import cn.bdqn.dao.BaseMapper;
import cn.bdqn.pojo.Easybuy_user;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by dll on 2017/8/17.
 */
public interface UserMapper extends BaseMapper<Easybuy_user> {
    /**
     * 用户登录
     * @param loginName 用户名
     * @param password 密码
     * @return 用户
     */
    public Easybuy_user login(@Param("loginName") String loginName, @Param("password") String password) throws Exception;

    /**
     * 用户注册
     * @param user 用户对象
     * @throws Exception
     */
    public void regist(Easybuy_user user) throws Exception;
}
