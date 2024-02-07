package com.myblog.Myblog11.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PostDto {
    private long id;
    private String title;
    private String description ;
    private String content;

}
