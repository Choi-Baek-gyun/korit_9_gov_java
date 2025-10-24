package com.korit.study.ch24;

import java.util.ArrayList;
import java.util.List;

public class BoardMain3 {
    public static void main(String[] args) {
        List<Board1> boards = new ArrayList<>();
        boards.add(new Board1());
        boards.get(0).setTitle("게시판 제목1");
        boards.get(0).setWriter(new Writer1("김준일", 32));
        boards.get(0).setContent("게시판 내용1");
        boards.get(0).setComments(new ArrayList<>());
        boards.get(0).getComments().add(new Comment1(new Writer1("김준이", 31), "댓글 내용1"));
        boards.get(0).getComments().add(new Comment1(new Writer1("김준삼", 31), "댓글 내용2"));

        boards.add(new Board1());

        Board1 board1 = new Board1();
        board1.setTitle("게시판 제목2");
        board1.setWriter(new Writer1("김준사",34));
        board1.setContent("게시판 내용2");
        List<Comment1> comments1 = new ArrayList<>();
        comments1.add(new Comment1(new Writer1("김준오",35), "댓글 내용1"));
        comments1.add(new Comment1(new Writer1("김준육",36), "댓글 내용2"));
        boards.add(board1);
        System.out.println(board1.toString());
    }
}












