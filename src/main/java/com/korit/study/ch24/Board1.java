package com.korit.study.ch24;

import java.util.List;
import java.util.Objects;

public class Board1 {
    private String title;
    private Writer1 writer;
    private String content;
    private List<Comment1> comments;

    public Board1() {
    }

    public Board1(String title, Writer1 writer, String content, List<Comment1> comments) {
        this.title = title;
        this.writer = writer;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public List<Comment1> getComments() {
        return comments;
    }

    public void setComments(List<Comment1> comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Board1 board)) return false;
        return Objects.equals(title, board.title) && Objects.equals(writer, board.writer) && Objects.equals(content, board.content) && Objects.equals(comments, board.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, writer, content, comments);
    }

    @Override
    public String toString() {
        return "Board{" +
                "title='" + title + '\'' +
                ", writer=" + writer +
                ", content='" + content + '\'' +
                ", comments=" + comments +
                '}';
    }
}
