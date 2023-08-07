package ch17.section02.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add("John" + i);
        }
        list.add("John");
        list.add("Adam");
        list.add("Andy");
        list.add("Cole");
        list.add("Joe");

        //Stream<String> stream = list.stream(); //단일 스트림
        Stream<String> stream = list.parallelStream();
        stream.forEach((item) -> {
            Thread thread = Thread.currentThread();
            System.out.println(item + ": " + thread.getName());
        });
    }
}
