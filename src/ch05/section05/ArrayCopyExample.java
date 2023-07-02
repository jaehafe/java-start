package ch05.section05;

import java.util.Arrays;

public class ArrayCopyExample {
    public static void main(String[] args) {
//        int[] oldIntArray = {1, 2, 3};
//        int[] newIntArray = new int[5];
//
//        for (int i = 0; i < oldIntArray.length; i++) {
//            newIntArray[i] = oldIntArray[i];
//        }
//
//        System.out.println(Arrays.toString(newIntArray));
//        for (int i = 0; i < newIntArray.length; i++) {
//            System.out.print(newIntArray[i] + ", ");
//        }

        String[] oldStrArray = {"java", "array", "copy"};
        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        System.out.println(Arrays.toString(oldStrArray));
        System.out.println(Arrays.toString(newStrArray));

    }
}
