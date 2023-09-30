package java01.ch05.section05;

import java.util.Arrays;

public class ArrayTypeExample {
    public static void main(String[] args) {
        //        String[] strArray = {"1", "2", "3"};
        //        System.out.println(Arrays.toString(strArray));

        //        String[] names = null;
        //        names = new String[] {"12", "2", "3"};
        //        System.out.println(Arrays.toString(names));

        int[] scores;

        scores = new int[]{1, 2, 3};
        int sum1 = 0;
        for (int i = 0; i < scores.length; i++) {
            sum1 += scores[i];
        }
        System.out.println("총합: " + sum1);

        printItem(new int[]{2, 3, 4,});
    }

    public static void printItem(int[] scores) {
        System.out.println(Arrays.toString(scores));
        for (int i = 0; i < 3; i++) {
            System.out.println("scores[" + i + "]: " + scores[i]);
        }
    }
}


