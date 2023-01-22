package First;
/*
функция которая заполнит переданный двумерный  массив по шаблону:

   [0][1][2][3][4][5][6] -- столбцы(2-ая [])
[0] 3  2  1  0  1  2  3
[1] 4  3  2  1  0  1  2
[2] 5  4  3  2  1  0  1
[3] 6  5  4  3  2  1  0 <-   (мб имеется ввиду, что правый нижний угол всегда 0)
|
строки(1-ая [])
 */

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[][] arr = new int[4][7];
        arr = fillingTheArray(arr);

        for (int i = 0 ; i <= arr.length-1; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static int[][] fillingTheArray (int[][] arr){
        // первое строки второе столбцы

        int count = -1;
        for (int i = arr.length-1; i >= 0; i--){
            count++;
            for (int j = arr[i].length-1; j >= 0; j--){
                arr[i][j]=Math.abs(count + (j - (arr[i].length-1)));  // == - сравниваем = - присваиваем

            }
        }
        return arr;
    }
}
