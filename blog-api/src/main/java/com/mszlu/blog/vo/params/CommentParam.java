package com.mszlu.blog.vo.params;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class CommentParam {


    private Long articleId;

    private String content;

    private Long parent;

    private Long toUserId;
}
