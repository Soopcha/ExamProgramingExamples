package First;
/*
реализовать функцию которая из эл переданного списка создаст новый список List<Integer>
состоящий из всех локальных минимумов списка переданного.
окальные минимумы – элементы массива,
соседи которых по значению больше данного элемента. Под соседями элемента будем понимать элементы непосредственно справа или
слева от данного (у первого и последнего элемента массива – по одному соседу, у остальных – по два).   9.2
 */

import java.util.ArrayList;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(56);
        list.add(234);
        list.add(4);
        list.add(3);
        list.add(3);
        list.add(1);
        list.add(3);
        list.add(1);
        System.out.println(list);
        System.out.println(list.get(0));

        System.out.println(fanctionOfFindingLocalMinimums(list));

    }

    public static List<Integer> fanctionOfFindingLocalMinimums(List<Integer> list) {
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
            if (count == length){
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
