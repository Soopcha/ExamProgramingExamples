package course1;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс для реализации задач
 */
public class Exam {

    public static void task1(int n) {
        return;
    }

    public static void task2(int n) {
        return;
    }

    public static void task3(int h) {
        return;
    }

    public static void task4(int h, int w) {
        return;
    }

    public static int task5(int[] arr) {
        return -1;
    }

    public static int task6(int[][] arr) {
        return -1;
    }

    public static void task7(int[][] arr) {
        return;
    }

    public static void task8(int[][] arr) {
        return;
    }

    public static List<Integer> task9(List<Integer> list) {

        List<Integer> listFinish = new ArrayList<>();

        int nomber = 0;// число которое мы будем проверять на локальный минимум
        int nomber2 = 0; // по суте nomber, но в конце нам нужно два числа сохранить
        int left = 0;  // число слева от него
        int right = 0; // число справа от него

        int length = list.size();
        int count = 0; // эл списка на котором мы находимся в данный момент пока перебираем эти эл

        for (int value : list) {
            count++;
            if (count == 1) {
                right = value;
            } else if (count == 2) {
                nomber = right;
                right = value;
            } else {
                left = nomber;
                nomber = right;
                right = value;
            }


            if (((count >= 3) && right > nomber && left > nomber) || (count == 2 && right > nomber)) {
                listFinish.add(nomber);
            }
            if (count == length) {
                left = nomber;
                nomber = right;
                if (left > nomber) {
                    listFinish.add(nomber);
                }
            }
        }
        return listFinish;
    }

}
