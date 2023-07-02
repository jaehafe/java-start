package ch05.section05;

public class AdvancedFor {
    public static void main(String[] args) {
        int[] scores = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int score : scores) { // scores 각 원소가 score 변수에 저장
            sum += score;
        }
        System.out.println("점수 총합 = " + sum);
        double avg = (double) sum / scores.length;
        System.out.println("평균 점수 = " + avg);
    }
}
