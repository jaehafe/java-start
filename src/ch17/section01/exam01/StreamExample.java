package ch17.section01.exam01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        //Set 컬렉션 생성
        Set<String> set = new HashSet<>();
        set.add("John");
        set.add("Adam");
        set.add("Jack");

        //Stream 을 이용한 요소 반복처리
        Stream<String> stream = set.stream();
        stream.forEach(name -> System.out.println(name));
    }
}
