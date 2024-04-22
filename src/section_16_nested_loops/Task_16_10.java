package section_16_nested_loops;

/*
    Задание: Целое число называется «Полноценным», если сумма делителей (включая
    1, но, не включая само число) числа равна самому числу.
    Напишите класс, который выводит на экран все «полноценные» числа ОТ 1 ДО 100000.
 */
public class Task_16_10 {

    public void action() {
        for (int i = 1; i <= 100_000; i++) {
            int sum = 0;

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }

            if (sum == i) {
                System.out.println(i + " полноценное");
            }
        }
    }
}