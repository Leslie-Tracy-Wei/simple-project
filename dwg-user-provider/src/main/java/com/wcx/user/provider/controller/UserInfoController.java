package com.wcx.user.provider.controller;

import com.wcx.user.api.model.UserInfo;
import com.wcx.user.provider.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;
    @RequestMapping(value = "/user/info",method = RequestMethod.POST)
    String info(){
       UserInfo userInfo = userInfoService.selectInfo();
        Long id = userInfo.getId();
        return id + "";
    }
}
