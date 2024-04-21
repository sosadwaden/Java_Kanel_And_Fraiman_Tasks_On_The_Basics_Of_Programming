package section_11_for_loop;

/*
    Задание: Напишите класс, который выводит на экран (в строку с пробелами) все
    трехзначные целые положительные числа, соответствующие следующему
    требованию: две последних цифры (десятков и единиц) образуют
    двузначное число, делящееся без остатка на первую цифру (сотен).
 */
public class Task_11_46 {

    public void action() {
        for (int i = -999; i < 1000; i++) {
            int firstDigit = i / 100;
            int rightPart = i % 100;

            if (rightPart % firstDigit == 0) {
                System.out.print(i + " ");
            }

        }
    }
}
