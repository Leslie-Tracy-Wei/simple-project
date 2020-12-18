package com.wcx.user.provider.mapper;

import com.wcx.user.api.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserInfoMapper {

    UserInfo selectInfo();
}
