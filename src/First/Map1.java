package First;

import java.util.HashMap;
import java.util.Map;

/*
Написать функцию, которая для переданного одномерного массива целых чисел находит общее кол-во эл
(но не значений, а именно кол-во) которые встречаются в массиве более одного раза
пример:
5 2 2 7 8 4 6 8 5 1 8   ответ:7     - 2-2 раза, 5-2раза, 8-3 раза (2+2+3 = 7).
 */
public class Map1 {
    public static void main(String[] args) {
        int[] arr= {5, 2, 2, 7, 8, 4, 6, 8, 5, 1, 8};
        System.out.println(numberOfDuplicateElements(arr));
    }
    public static int numberOfDuplicateElements (int[] arr){
        int kol = 0;

        Map<Integer,Integer> map = new HashMap<>();
        // сокращение iter
        for (int i : arr) {
            map.put(i, 0);
        }
        for (int i : arr) {
            map.put(i, map.get(i) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >=2 ){
                kol += entry.getValue();
            }
        }

        return kol;
    }
}
