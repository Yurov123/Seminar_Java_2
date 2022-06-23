//Вывести МАССИВ всех чисел в заданном интервале, которые делятся на сумму цифр этого числа

package Seminar_2;

import java.util.Arrays;

public class Task_03 {
    public static void main(String[] args) {
        System.out.println("\nВ диапазоне от 10 до 100 данные числа без остатка делятся на сумму цифр числа: ");
        int[] array = new int[0];
        for (int i = 10; i < 101; i++) { // пробегаемся по числам заданного диапазона и проверяем их на соответствие
                                         // условию задачи
            if (i % sum_numbers(i) == 0) {
                array = addMassive(array, i); // если соответствует- добавляем в массив
            }
        }
        System.out.print(Arrays.toString(array)); // печатаем результат
        System.out.println("\n\n");
    }

    public static int sum_numbers(int n) { // считаем сумму цифр числа
        int sum = 0;
        while (0 != n) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int[] addMassive(int[] array, int newElement) {
        int[] newArray = new int[array.length + 1]; // объявляем массив размерностью на единицу больше предыдущего
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = newElement; // добавляем в новый массив новый элемент и возвращаем его
        return newArray;
    }
}
