package org.parog.algo_roadmap.arrays_hashing;

/**
 * 1.
 * 0 <= key, value <= 10^6
 * Будет сделано не более 10^4 вызовов для put, get и remove.
 * 2.
 * Временная сложность: в большинстве случае каждая операция в HashMap равна O(1), если все ключи равномерно распределены.
 * В худшем случае, если все элементы попадают в один bucket, операции put, get и remove могут занимать O(N) время.
 * Пространственная сложность: O(N + M), где N - количество бакетов, а M - количество элементов, хранящихся в хэш-таблице.
 * Пространственная сложность определяется размером массива buckets и количеством элементов в каждом bucket.
 */
public class DesignHashMap706 {
    class BucketNode {
        private Integer key;
        private Integer value;
        private BucketNode next;

        public BucketNode(Integer key, Integer value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private final int SIZE = 1000;
    private BucketNode[] parentMap;

    /**
     * В конструкторе создается фиктивный узел с ключом -1 и значением -1 для каждого bucket. Фиктивный узел служит якорем,
     * к которому привязываются все реальные узлы, и предотвращает потерю связи при удалении первого реального узла.
     */
    public DesignHashMap706() {
        this.parentMap = new BucketNode[SIZE];
        for (int i = 0; i < SIZE; i++) {
            parentMap[i] = new BucketNode(-1, -1);
        }
    }

    /**
     * Добавляем ключ-значение в HashMap
     *
     * @param key   ключ
     * @param value значение
     */
    public void put(int key, int value) {
        int indexBucket = hash(key);
        BucketNode current = parentMap[indexBucket];

        while (current.next != null) {
            if (current.next.key == key) {
                current.next.value = value;
                return;
            }
            current = current.next;
        }
        current.next = new BucketNode(key, value);
    }

    /**
     * Возвращаем значение по ключу
     *
     * @param key ключ
     * @return {@code -1} если не нашли значение по ключу, иначе возвращаем значение из HashMap
     */
    public int get(int key) {
        int indexBucket = hash(key);
        // пропускаем фиктивный узел и начинаем поиск с первого реального узла
        BucketNode current = parentMap[indexBucket].next;

        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }
        return -1;
    }

    /**
     * Удаляем узел по ключу
     *
     * @param key ключ
     */
    public void remove(int key) {
        int indexBucket = hash(key);
        BucketNode current = parentMap[indexBucket];

        while (current.next != null) {
            if (current.next.key == key) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    /**
     * Вычисляем индекс bucket (хэш-функция).
     *
     * @param key входящий элемент
     * @return хэш
     */
    private int hash(int key) {
        return key % SIZE;
    }
}
