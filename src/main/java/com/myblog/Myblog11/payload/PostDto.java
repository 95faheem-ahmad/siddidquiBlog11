package com.myblog.Myblog11.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor

@Data
@AllArgsConstructor
public class PostDto {
    private  String description;
    private String content;
    private  String Title;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
       this.Title=title;
    }
}
