package com.lznhub.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

/**
 * @Description TODO
 * @Author LZN
 * @Date 2021/4/26 16:17
 **/
@Data
@TableName("m_blog")
public class Blog {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private Long userId;

    @NotBlank(message = "标题不能为空")
    private String title;

    @NotBlank(message = "摘要不能为空")
    private String description;

    @NotBlank(message = "内容不能为空")
    private String content;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDateTime created;

    private Integer status;
}
