package java02.ch05.sec03;

public class ReferenceVariableCompare {
    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{1, 2, 3};
        int[] arr3 = arr2;

        System.out.println(arr1 == arr2);
        System.out.println(arr2 == arr3);

    }
}
