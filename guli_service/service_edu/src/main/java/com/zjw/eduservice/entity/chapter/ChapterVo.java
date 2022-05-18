package com.zjw.eduservice.entity.chapter;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjw
 * @date 2022-05-15 14:33
 */
@Data
public class ChapterVo {
    private String id;

    private String title;

    private List<VideoVo> children=new ArrayList<>();
}
