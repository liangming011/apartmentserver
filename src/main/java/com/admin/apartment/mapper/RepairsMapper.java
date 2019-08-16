package com.admin.apartment.mapper;

import com.admin.apartment.entity.Repairs;
import com.admin.apartment.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 报修表 Mapper 接口
 * </p>
 *
 * @author liangming
 * @since 2019-08-15
 */
public interface RepairsMapper extends BaseMapper<Repairs> {

    /**
     * 查询报修表信息
     * */
    Page<Repairs> selectRepairsByInfo(IPage<Repairs> repairsIPage);
}
