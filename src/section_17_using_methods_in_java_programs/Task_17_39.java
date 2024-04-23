package section_17_using_methods_in_java_programs;

/*
    Задание: Напишите метод, который принимает две пары чисел: первая - координаты
    (Х и У) точки А, вторая - координаты (Х и У) точки В. Метод
    возвращает значение true, если отрезок пересекает хотя бы одну ось
    координат; в ином случае метод возвращает значение false.
 */
public class Task_17_39 {

    public boolean method(int x1, int y1, int x2, int y2) {
        return (x1 * x2 < 0) || (y1 * y2 < 0);
    }
}