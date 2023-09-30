package java01.ch15.section04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        //Map 생성
        Map<String, Integer> map = new HashMap<>();

        //객체 저장
        map.put("Adam", 85);
        map.put("John", 90);
        map.put("Rae", 80);
        map.put("John", 95); //키가 같기 때문에 마지막에 저장한 값만 저장
        System.out.println("총 Entry 수: " + map.size());

        System.out.println("--------------");

        //키로 값 얻기
        String key = "Adam";
        int value = map.get(key);
        System.out.println("key: " + map.get("Adam"));

        System.out.println("--------------");

        //키 Set을 얻고 반복해서 키와 값을 얻기
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + " : " + v);
        }

        System.out.println("--------------");

        // 엔트리 Set을 얻고 반복해서 키와 값을 얻기
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " + v);
        }

        System.out.println("--------------");

        map.remove("John");
        System.out.println("총 entry 수: " + map.size());

    }
}
