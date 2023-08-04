package ch15.section03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        //HashSet 생성
        Set<String> set = new HashSet<String>();

        // 객체 저장
        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("JAVA"); // 중복
        set.add("Spring");

        // 저장된 객체 수
        System.out.println("총 객체 수: " + set.size());

    }
}
