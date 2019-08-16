package com.admin.apartment.mapper;

import com.admin.apartment.entity.User;
import com.admin.apartment.model.MyPage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 租户信息 Mapper 接口
 * </p>
 *
 * @author liangming
 * @since 2019-08-15
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 查询租户信息
     * */
    Page<User> selectUserByInfo(IPage<User> userIPage);

    /**
     * 模糊查询租户信息
     * */
    Page<User> selectUserByLike(IPage<User> userIPage);

}
