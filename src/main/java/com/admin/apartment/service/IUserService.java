package com.admin.apartment.service;

import com.admin.apartment.entity.User;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 租户信息 服务类
 * </p>
 *
 * @author liangming
 * @since 2019-08-15
 */
public interface IUserService extends IService<User> {

    /**
     * 查询用户信息
     * */
    Page<User> selectUserByInfo(IPage<User> page);

    /**
     * 模糊查询用户信息
     * */
    Page<User> selectUserByLike(IPage<User> page);

    /**
     * 新增用户信息
     * */
    boolean insertUser(User user);

    /**
     * 更新用户信息
     * */
    boolean updateUserById(User user);

    /**
     * 删除用户信息
     * */
    boolean deleteUserByInfo(List<String> ids);

}
