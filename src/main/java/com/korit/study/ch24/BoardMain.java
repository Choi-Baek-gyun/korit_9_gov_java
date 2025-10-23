package com.korit.study.ch24;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

class Board {
    private String title;
    private ArrayList<Writer> writer;
    private String content;
    private ArrayList<Comments> comment;

    public Board(String title, ArrayList<Writer> writer, String content, ArrayList<Comments> comment) {
        this.title = title;
        this.writer = writer;
        this.content = content;
        this.comment = comment;
    }



    @Override
    public String toString() {
        return "\n\t{\n" +
                "\t\t\"title\" :'" + title + "\",\n" +
                  writer.toString() +
                "\n\t\t\"content\": " + content + "\"\n" +
                "\t\t\"comment\" :" + comment.toString() + "\n\t}";
    }
}
class Writer{
    private String name;
    private int age;

    public Writer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return  "\t\t\"writer\": {" +
                "\n\t\t\t\"name\":" + name + "\",\n" +
                "\t\t\t\"age\":" + age +
                "\n\t\t}"+ "";
    }
}
class Comments {
    private String name;
    private String content;

    public Comments(String name, String content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public String toString() {
        return  "\n\t\t\t{" + "\n\t\t\t\t\"name\":" + name + "\",\n" +
                "\t\t\t\t\"content\":" + content + "\"\n" +
                "\t\t\t}" ;
    }
}
public class BoardMain {
    public static void main(String[] args) {
        // 게시판
        /**
         * [    -> new ArrayList<>()
         *      {   -> new hashMap<>()
         *          "title": "게시판 제목1",
         *          "writer": { -> new hashMap<>()
         *              "name": "김준일",
         *              "age": 32
         *          },
         *          "content": "게시판 내용1",
         *          "comments": [    -> new ArrayList<>()
         *              {   -> new hashMap<>()
         *                  "writer": "김준이",
         *                  "content": "댓글 내용1"
         *              },
         *              {
         *                  "writer": "김준삼",
         *                  "content": "댓글 내용2"
         *              },
         *          ]
         *      },
         *      {
         *          "title": "게시판 제목2",
         *          "writer": {
         *              "name": "김준사",
         *              "age": 34
         *          },
         *          "content": "게시판 내용2",
         *          "comments": [
         *              {
         *                  "writer": "김준오",
         *                  "content": "댓글 내용11"
         *              },
         *              {
         *                  "writer": "김준육",
         *                  "content": "댓글 내용22"
         *              },
         *          ]
         *      },
         * ]
         */
        Writer writer1 = new Writer("김준일", 32);

        ArrayList<Writer> WriterInfo1 = new ArrayList<>();
        WriterInfo1.add(writer1);

        Writer writer2 = new Writer("김준사", 34);

        ArrayList<Writer> WriterInfo2 = new ArrayList<>();
        WriterInfo2.add(writer2);

        Comments comments1 = new Comments("김준이", "댓글 내용1");
        Comments comments2 = new Comments("김준삼", "댓글 내용2");

        ArrayList<Comments> commentInfo1 = new ArrayList<>();
        commentInfo1.add(comments1);
        commentInfo1.add(comments2);

        Comments comments11 = new Comments("김준오", "댓글 내용12");
        Comments comments22 = new Comments("김준육", "댓글 내용22");

        ArrayList<Comments> commentInfo2 = new ArrayList<>();
        commentInfo2.add(comments11);
        commentInfo2.add(comments22);


        Board board1 = new Board("게시판 제목1", WriterInfo1, "게시판 내용1", commentInfo1);
        Board board2 = new Board("게시판 제목2", WriterInfo2, "게시판 내용2", commentInfo2);
        ArrayList<Board> boardInfo = new ArrayList<>();
        boardInfo.add(board1);
        boardInfo.add(board2);

        System.out.println(boardInfo.toString());


    }
}
