package ch14.section09.exam01;

import java.util.concurrent.*;

public class ExecutorExample {
    public static void main(String[] args) {
        // 스레드 풀 생성
//        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        // 작업 생성과 처리 요청
//        // 스레드풀 종료
//        executorService.shutdownNow();

        ExecutorService threadPool = new ThreadPoolExecutor(
                3, //코어 스레드 개수
                100, //최대 스레드 개수
                120L, //놀고 있는 시간
                TimeUnit.SECONDS, //놀고 있는 시간 단위
                new SynchronousQueue<Runnable>()
        );

    }
}
