package ru.nsu.mivlix;

public class Main {

    /**
     * Пирамидальная сортировка (min-heap).
     * В результате массив сортируется по убыванию.
     */

    public static void sort(int[] arr) {
        int n = arr.length;

        // 1. Построение min-кучи
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // 2. Извлечение элементов из кучи по одному
        for (int i = n - 1; i > 0; i--) {
            // Перемещаем текущий корень (минимум) в конец
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Вызываем heapify на уменьшенной куче
            heapify(arr, i, 0);
        }

        reverse(arr);
    }

    private static void heapify(int[] arr, int n, int i) {
        int smallest = i;          // Изначально корень — наименьший
        int left = 2 * i + 1;      // Левый потомок
        int right = 2 * i + 2;     // Правый потомок

        // Если левый потомок меньше корня
        if (left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }

        // Если правый потомок меньше текущего наименьшего
        if (right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }

        // Если наименьший не корень, меняем и продолжаем просеивание
        if (smallest != i) {
            int swap = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = swap;

            heapify(arr, n, smallest);
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7, 1, 9, 3};

        System.out.println("Исходный массив:");
        printArray(array);

        sort(array);

        System.out.println("Отсортированный массив (убывание, min-heap):");
        printArray(array);
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Вспомогательный метод для разворота массива (если нужен возрастающий порядок)
    private static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}