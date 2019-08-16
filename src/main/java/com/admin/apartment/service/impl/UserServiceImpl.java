package com.admin.apartment.service.impl;

import com.admin.apartment.entity.User;
import com.admin.apartment.mapper.UserMapper;
import com.admin.apartment.service.IUserService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.List;

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

    @Autowired
    UserMapper userMapper;



    @Override
    public Page<User> selectUserByInfo(IPage<User> userIPage) {
        return userMapper.selectUserByInfo(userIPage);
    }

    @Override
    public Page<User> selectUserByLike(IPage<User> userIPage) {
        return userMapper.selectUserByLike(userIPage);
    }

    @Override
    public boolean insertUser(User user) {
        return userMapper.insert(user)>0;
    }

    @Override
    public boolean updateUserById(User user) {
        return userMapper.updateById(user)>0;
    }

    @Override
    public boolean deleteUserByInfo(List<String> ids) {
        return userMapper.deleteBatchIds(ids)>0;
    }
}
