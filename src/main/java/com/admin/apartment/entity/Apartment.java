package com.admin.apartment.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
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
    private long userid;

    /**
     * 户型
     */
    @TableField(el = "house_type, jdbcType=VARCHAR")
    private String houseType;

    /**
     * 房间面积
     */
    @TableField(el = "room_area, jdbcType=VARCHAR")
    private String roomArea;

    /**
     * 房间面积 查询条件 最小值
     */
    @TableField(exist = false)
    private String roomAreaMin;

    /**
     * 房间面积 查询条件 最大值
     */
    @TableField(exist = false)
    private String roomAreaMax;

    /**
     * 朝向
     */
    private String face;

    /**
     * 对外标价
     */
    private String price;

    /**
     * 对外标价 查询条件 最小值
     */
    @TableField(exist = false)
    private String priceMin;

    /**
     * 对外标价 查询条件 最大值
     */
    @TableField(exist = false)
    private String priceMax;

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
