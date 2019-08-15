package com.admin.apartment.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 公寓信息
 * </p>
 *
 * @author liangming
 * @since 2019-08-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Apartment implements Serializable {

    private static final long serialVersionUID = 109079587233L;

    @TableId(value = "id", type = IdType.UUID)
    private long id;

    /**
     * 租户id
     */
    private String userid;

    /**
     * 户型
     */
    private String houseType;

    /**
     * 房间面积
     */
    private String roomArea;

    /**
     * 朝向
     */
    private String face;

    /**
     * 对外标价
     */
    private String price;

    /**
     * 支付模式（如押一付一）
     */
    private String pattern;

    /**
     * 公寓地址
     */
    private String address;

    /**
     * 状态
     */
    private String status;


}
