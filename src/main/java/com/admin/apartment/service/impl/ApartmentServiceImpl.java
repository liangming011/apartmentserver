package com.admin.apartment.service.impl;

import com.admin.apartment.entity.Apartment;
import com.admin.apartment.mapper.ApartmentMapper;
import com.admin.apartment.service.IApartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 公寓信息 服务实现类
 * </p>
 *
 * @author liangming
 * @since 2019-08-15
 */
@Service
public class ApartmentServiceImpl extends ServiceImpl<ApartmentMapper, Apartment> implements IApartmentService {

}
