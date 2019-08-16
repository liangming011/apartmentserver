package com.admin.apartment.mapper;

import com.admin.apartment.entity.Apartment;
import com.admin.apartment.entity.File;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 公寓信息 Mapper 接口
 * </p>
 *
 * @author liangming
 * @since 2019-08-15
 */
public interface ApartmentMapper extends BaseMapper<Apartment> {

    /**
     * 查询文件信息
     * */
    Page<Apartment> selectApartmentByInfo(IPage<Apartment> apartmentIPage);

    /**
     * 模糊查询文件信息
     * */
    Page<Apartment> selectApartmentByLike(IPage<Apartment> apartmentIPage);

}
