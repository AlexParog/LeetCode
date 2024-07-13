package org.parog.algo_roadmap.arrays_hashing;

/**
 * 1.
 * 0 <= key <= 10^6
 * Для add, remove и contains будет сделано не более 10^4 вызовов.
 * 2.
 * Временная сложность: в большинстве случае каждая операция в HashSet равна O(1)
 * Пространственная сложность: O(N), где n - количество ключей bucket в наборе HashSet
 */
public class DesignHashSet705 {

    /**
     * Класс Bucket
     */
    class BucketNode {
        /**
         * Номер bucket
         */
        private Integer key;
        /**
         * Указатель на следующий элемент в Bucket
         */
        private BucketNode next;

        public BucketNode() {
            this.key = null;
            this.next = null;
        }

        public BucketNode(Integer key) {
            this.key = key;
            this.next = null;
        }

        public BucketNode(Integer key, BucketNode next) {
            this.key = key;
            this.next = next;
        }
    }

    /**
     * Количество buckets
     */
    private final int PARENT_ARR_SIZE = 10001;
    private BucketNode[] parentSet;

    public DesignHashSet705() {
        this.parentSet = new BucketNode[PARENT_ARR_SIZE];
        for (int i = 0; i < PARENT_ARR_SIZE; i++) {
            parentSet[i] = new BucketNode();
        }
    }

    /**
     * Вставляет значение key в HashSet.
     *
     * @param key входящий элемент
     */
    public void add(int key) {
        int bucketIndex = getBucketIndex(key);
        BucketNode current = parentSet[bucketIndex];

        while (current.next != null) {
            if (current.next.key.equals(key)) {
                return;
            }
            current = current.next;
        }
        current.next = new BucketNode(key);
    }

    /**
     * Удаляет ключ-значение из HashSet. Если ключ не существует в HashSet, ничего не происходит.
     *
     * @param key входящий элемент
     */
    public void remove(int key) {
        int bucketIndex = getBucketIndex(key);
        BucketNode current = parentSet[bucketIndex];

        while (current.next != null) {
            if (current.next.key.equals(key)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    /**
     * Возвращает, существует ли ключ-значение в HashSet или нет.
     *
     * @param key входящий элемент
     * @return {@code true} элемент найден в наборе, иначе {@code false}
     */
    public boolean contains(int key) {
        int bucketIndex = getBucketIndex(key);
        BucketNode current = parentSet[bucketIndex];

        while (current.next != null) {
            if (current.next.key.equals(key)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * Вычисляем индекс bucket (хэш-функция).
     *
     * @param key входящий элемент
     * @return хэш
     */
    private int getBucketIndex(int key) {
        return key % PARENT_ARR_SIZE; // тут должна быть нормальная функция вычисления hashCode
    }
}
