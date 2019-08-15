package com.admin.apartment.service.impl;

import com.admin.apartment.entity.User;
import com.admin.apartment.mapper.UserMapper;
import com.admin.apartment.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 租户信息 服务实现类
 * </p>
 *
 * @author liangming
 * @since 2019-08-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
