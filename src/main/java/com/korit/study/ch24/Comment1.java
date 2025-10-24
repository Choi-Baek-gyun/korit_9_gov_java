package com.korit.study.ch24;

import java.util.Objects;

public class Comment1 {
    private Writer1 writer;
    private String content;

    public Comment1(Writer1 writer, String content) {
        this.writer = writer;
        this.content = content;
    }

    public Writer1 getWriter() {
        return writer;
    }

    public void setWriter(Writer1 writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Comment1 comment)) return false;
        return Objects.equals(writer, comment.writer) && Objects.equals(content, comment.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(writer, content);
    }

    @Override
    public String toString() {
        return "Comment{" +
                "writer=" + writer +
                ", content='" + content + '\'' +
                '}';
    }
}
