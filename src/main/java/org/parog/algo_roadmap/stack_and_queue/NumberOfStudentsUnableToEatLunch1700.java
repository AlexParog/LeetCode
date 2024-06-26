package org.parog.algo_roadmap.stack_and_queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1.
 * Диапазон длины массива студентов и бутербродов: 1 <= students.length, sandwiches.length <= 100
 * Длины массивов равны: students.length == sandwiches.length
 * Элемент sandwiches[i] равен 0 или 1.
 * Элемент students[i] равен 0 или 1.
 * 2.
 * Тестовый класс {@link NumberOfStudentsUnableToEatLunch1700Test}
 */
public class NumberOfStudentsUnableToEatLunch1700 {
    /**
     * Реализация через ОЧЕРЕДЬ.
     * <p>
     * Изначально добавляем в очередь пришедших студентов. Далее проходим по массиву сэндвичей до того момента,
     * пока очередь не станет пустой или не пройдет полный круг оставшихся голодных студентов. Если выбранный студент ест
     * сэндвич, то он уходит из очереди со студентов, увеличиваем индекс сэндвича и обнуляем количество попыток (на второй круг).
     * Иначе голодный студент идет в конец и количество попыток увеличивается.
     * <p>
     * Временная сложность: O(n), если студент не может взять сэндвич, он перемещается в конец очереди. Это перемещение
     * выполняется n раз в худшем случае, где n — количество студентов. Каждый студент может быть проверен максимум дважды:
     * первый раз, когда он находится в начале очереди и проверяется на соответствие текущему сэндвичу, и второй раз,
     * когда он проходит всю очередь и возвращается в начало
     * Пространственная сложность: O(n), где n количество студентов в очереди из входящего массива
     *
     * @param students   студенты
     * @param sandwiches сэндвичи
     * @return количество голодных студентов
     */
    public static int countStudentsWithQueue(int[] students, int[] sandwiches) {
        Queue<Integer> studentQueue = new LinkedList<>();
        for (int student : students) {
            studentQueue.add(student);
        }

        int sandwichIndex = 0;
        int attempts = 0;

        while (!studentQueue.isEmpty() && attempts != sandwiches.length) {
            if (studentQueue.peek() == sandwiches[sandwichIndex]) {
                studentQueue.poll();
                sandwichIndex++;
                attempts = 0;
            } else {
                studentQueue.add(studentQueue.poll());
                attempts++;
            }
        }

        return studentQueue.size();
    }

    /**
     * Реализация через фиксированный массив
     * <p>
     * Заполняем два счетчика для 0 и 1 в массиве countSandwiches, которые хотят студенты. Проходимся по массиву сэндвичей
     * и если количество сэндвичей определенного типа равно 0, то возвращаем количество голодных студентов, как разницу
     * между длиной массива сэндвичей и текущим индекса сэндвича, на котором застряла очередь. Иначе уменьшаем счетчик
     * определенного типа сэндвича.
     * <p>
     * Временная сложность: O(n), так как количество студентов равно количеству сэндвичей
     * Пространственная сложность: O(1), ограничили массив только дву конкретными значениями 0 и 1
     *
     * @param students   студенты
     * @param sandwiches сэндвичи
     * @return количество голодных студентов
     */
    public static int countStudentsWithMap(int[] students, int[] sandwiches) {
        int[] countSandwiches = new int[]{0, 0};
        for (int student : students) {
            countSandwiches[student]++;
        }

        for (int i = 0; i < sandwiches.length; i++) {
            if (countSandwiches[sandwiches[i]] == 0) {
                return sandwiches.length - i;
            }
            countSandwiches[sandwiches[i]]--;
        }

        return 0;
    }
}
