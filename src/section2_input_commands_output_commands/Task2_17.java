package section2_input_commands_output_commands;

import java.util.Scanner;

/*
    Задание: Напишите класс, который принимает с клавиатуры целое число и затем
    выводит на экран его квадрат.
 */
public class Task2_17 {

    public void example2_17() {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        System.out.println(number * number);
    }
}
