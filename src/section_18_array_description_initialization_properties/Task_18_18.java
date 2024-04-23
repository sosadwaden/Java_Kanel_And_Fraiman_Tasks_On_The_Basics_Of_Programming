package section_18_array_description_initialization_properties;

import java.util.Scanner;

/*
    Задание: Напишите класс, который заполняет случайными двузначными числами
    массив, размер которого при инициализации вводится с клавиатуры.
    После заполнения класс должен вывести на экран значения массива
    следующим образом:
    • в первой строке - значения из первой половины массива, начиная с «начала»;
    • во второй строке - значения из второй половины массива, начиная с «конца»).
 */
public class Task_18_18 {

    public void action() {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] m = new int[length];
        int down = 10;
        int up = 99;

        fill(m, down, up);
        write(m);
        scanner.close();
    }

    public void write(int[] m) {
        for (int i = 0; i < m.length / 2; i++) {
            System.out.print(m[i] + " ");
        }

        System.out.println();

        for (int i = m.length - 1; i >= m.length / 2; i--) {
            System.out.print(m[i] + " ");
        }
    }

    public void fill(int[] m, int down, int up) {
        for (int i = 0; i < m.length; i++) {
            m[i] = down + (int) ((up - down) * Math.random());
        }
    }
}
