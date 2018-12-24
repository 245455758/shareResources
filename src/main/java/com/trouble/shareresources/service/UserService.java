package com.trouble.shareresources.service;

import com.trouble.shareresources.pojo.User;

public interface UserService {
    /**
     * 注册用户
     *
     * @param user
     * @return 注册成功将用户信息返回，否则返回null
     */
    int saveUser(User user);

    /**
     * 检查用户名密码是否正确
     *
     * @param username     用户名
     * @param password 密码
     * @return 验证通过则将用户信息返回，否则返回null
     */
    User checkLogin(String username, String password);

    /**
     * 根据用户手机号和密码查找用户
     * @param phobeNumber
     * @param password
     * @return
     */
    public User checkLoginByTelephone(String phobeNumber,String password);

    User findUserByUserName(String username);

    User findUserByTelephone(String telephone);
}
