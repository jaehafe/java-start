package ch05.section05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitExample {
    public static void main(String[] args) {
        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";

        String[] tokens = board.split(",");
        List<String> tokenList = new ArrayList<>(Arrays.asList(tokens));
        System.out.println("tokenList: " + tokenList);

        for (int i = 0; i < tokens.length; i++) {
//            System.out.println("tokens[i]" + tokens[i]);
            System.out.println("tokens[" + i + "]: " + tokens[i]);

        }
    }
}
