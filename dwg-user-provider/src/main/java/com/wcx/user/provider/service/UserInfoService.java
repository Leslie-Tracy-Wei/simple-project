package com.wcx.user.provider.service;

import com.wcx.user.api.model.UserInfo;
import com.wcx.user.provider.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public UserInfo selectInfo() {
       return userInfoMapper.selectInfo();
    }
}
