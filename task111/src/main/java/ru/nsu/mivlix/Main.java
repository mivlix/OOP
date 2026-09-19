package ru.nsu.mivlix;

public class Main {

    /**
     * Пирамидальная сортировка (min-heap).
     * Массив сортируется по возрастанию.
     */
    public static void sort(long[] arr) {
        int n = arr.length;   // длина — int, не long

        // 1. Построение min-кучи
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // 2. Извлечение элементов из кучи по одному
        for (int i = n - 1; i > 0; i--) {
            long temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }

        reverse(arr);
    }

    private static void heapify(long[] arr, int n, int i) {
        int smallest = i;          // индекс — int
        int left = 2 * i + 1;      // индекс — int
        int right = 2 * i + 2;     // индекс — int

        if (left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }
        if (right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }

        if (smallest != i) {
            long swap = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = swap;

            heapify(arr, n, smallest);
        }
    }

    public static void printArray(long[] arr) {
        for (long value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private static void reverse(long[] arr) {
        int left = 0, right = arr.length - 1;   // индексы — int
        while (left < right) {
            long temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}