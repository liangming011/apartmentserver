package com.admin.apartment.entity;

import java.time.LocalDate;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
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

    @TableId(value = "id", type = IdType.UUID)
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
     * 处理时间
     */
    private LocalDate conductTime;

    /**
     * 是否有文件
     */
    private Integer hasFile;


}
