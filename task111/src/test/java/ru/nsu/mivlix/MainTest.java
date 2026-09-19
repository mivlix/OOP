package ru.nsu.mivlix;
import org.junit.jupiter.api.Test;
import static ru.nsu.mivlix.Main.*;

class MainTest {
    @Test
    void test1() {
        long[] array = {12, 11, 13, 5, 6, 7, 1, 9, 3};

        System.out.println("Исходный массив:");
        printArray(array);

        sort(array);

        System.out.println("Отсортированный массив (убывание, min-heap):");
        printArray(array);
    }

    @Test
    void test2() {
        long[] array = {};

        System.out.println("Исходный массив:");
        printArray(array);

        sort(array);

        System.out.println("Отсортированный массив (убывание, min-heap):");
        printArray(array);
    }

    @Test
    void test3() {
        long[] array = {-4};

        System.out.println("Исходный массив:");
        printArray(array);

        sort(array);

        System.out.println("Отсортированный массив (убывание, min-heap):");
        printArray(array);
    }

    @Test
    void test4() {
        long[] array = {0, -4, 4, -4, 4, -4, 4, 0};

        System.out.println("Исходный массив:");
        printArray(array);

        sort(array);

        System.out.println("Отсортированный массив (убывание, min-heap):");
        printArray(array);
    }
}