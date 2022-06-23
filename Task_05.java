// У вас есть отсортированный массив, 
// нужно используя минимальное колличество попыток найти загаданное число

package Seminar2;

import java.util.Random;
import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        Random random = new Random();

        int answer = random.nextInt(1, 100); // задаем случайное число в диапазоне от 1 до 100
        int tryCount = 0; // счетчик попыток
        int maxTryCount = 3; // максимально допустимое количестов попыток
        boolean flag = false; // угадано или нет

        System.out.println(
                "Здравствуйте, Вас приветствует игра 'Угадайка'!\nУгадайте число от 1 до 100. У Вас 3 попытки.\n");

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите число: ");
            int userAnswer = in.nextInt();
            tryCount += 1;

            if (userAnswer == answer) { // 1) попытка отгадать удалась
                System.out.println("Поздравляю, Вы угадали! Это действительно число " + answer + "!");
                break;
            } else if (userAnswer < answer) { // 2) попытка отгадать меньше загаданного числа
                System.out.println("Вы ввели слишком МАЛЕНЬКОЕ число.\n");
            } else if (userAnswer > answer) {
                System.out.println("Вы ввели слишком БОЛЬШОЕ число.\n");
            }
            if (tryCount == maxTryCount) {
                System.out.println("\nПопыток больше нет! Было загадано число " + answer + " \n");
                break;
            }
        }
    }
}