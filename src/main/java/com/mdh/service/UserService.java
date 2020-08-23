package com.mdh.service;

import com.mdh.po.User;

/**
 * Created by mdh on 2019/10/15.
 */
public interface UserService {

    User checkUser(String username, String password);
}
