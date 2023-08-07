package ch17.section01.exam01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        //Set 컬렉션 생성
        Set<String> set = new HashSet<>();
        set.add("Jack");
        set.add("Adam");
        set.add("John");

        //외부 반복자 이용
        for (String item : set) {
            System.out.println(item);
        }

        System.out.println("------------");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }

        System.out.println("-----내부 반복자1-------");

        //내부 반복자 이용
        Stream<String> stream = set.stream();
        stream.forEach((item) -> {
            System.out.println(item);
        });

        System.out.println("-----내부 반복자2-------");

        //Stream 은 재사용하지 못한다
        stream = set.stream();
        stream.forEach((item) -> System.out.println(item));
    }
    //Stream, Iterator 비교
    //1. 내부 반복자이므로 처리 속도가 빠르고 병렬 처리에 효율적이다.
    //2. 람다식으로 다양한 요소 처리를 정의할 수 있다.
    //3. 중간 처리와 최종 처리를 수행하도록 Pipeline 을 형성할 수 있다.
}
