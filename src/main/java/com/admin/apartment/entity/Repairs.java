package com.admin.apartment.entity;

import java.time.LocalDate;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 报修表
 * </p>
 *
 * @author liangming
 * @since 2019-08-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Repairs implements Serializable {

    private static final long serialVersionUID = 18562374592L;

    @TableId(value = "id")
    private long id;

    /**
     * 租户id
     */
    private String userid;

    /**
     * 报修状态
     */
    private String status;

    /**
     * 文本描述内容
     */
    private String content;

    /**
     * 创建时间
     */
    private LocalDate createTime;

    /**
     * 创建时间 时间段查询：开始时间
     */
    @TableField(exist = false)
    private LocalDate createTimeBefore;

    /**
     * 创建时间 时间段查询：结束时间
     */
    @TableField(exist = false)
    private LocalDate createTimeAfter;

    /**
     * 处理时间
     */
    private LocalDate conductTime;

    /**
     * 处理时间 时间段查询：开始时间
     */
    @TableField(exist = false)
    private LocalDate conductTimeBefore;

    /**
     * 处理时间 时间段查询：结束时间
     */
    @TableField(exist = false)
    private LocalDate conductTimeAfter;

    /**
     * 是否有文件 0=>没有 1=>有
     */
    private Integer hasFile;


}
