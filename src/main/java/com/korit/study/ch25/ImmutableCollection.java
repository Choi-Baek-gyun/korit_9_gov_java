package com.korit.study.ch25;

import com.korit.study.ch24.Board1;
import com.korit.study.ch24.Comment1;
import com.korit.study.ch24.Writer1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// 불변 컬렉션
public class ImmutableCollection {
    public static void main(String[] args) {
        List<String> ilist = List.of("김준일", "김준이");
        ilist.add("김준삼");
        System.out.println(ilist);
        Map<String, List<String>> iMap = Map.of(
                "k1", List.of("김준일", "김준이"),
                "k2", List.of("김준삼", "김준사"),
                "k3", List.of("김준오", "김준육"),
                "k4", List.of("김준칠", "김준팔", "김준구")
        );

        List<Board1> boards = new ArrayList<>();
        boards.add(new Board1("제목1", new Writer1("김준일", 32), "내용1",
                List.of(
                        new Comment1(new Writer1("김준이",32), "댓글1"),
                        new Comment1(new Writer1("김준이",32), "댓글1")
                )
        ));
    }
}
