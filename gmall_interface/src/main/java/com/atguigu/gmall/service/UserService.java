package com.atguigu.gmall.service;

/*
@author YG
@create 2022/9/23   13:54
*/

import com.atguigu.gmall.bean.UserAddress;

import java.util.List;

public interface UserService {
    public List<UserAddress> getUserAddressList(String userId);
}
