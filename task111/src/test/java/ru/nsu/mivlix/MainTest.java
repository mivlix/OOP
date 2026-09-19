package ru.nsu.mivlix;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static ru.nsu.mivlix.Main.*;

class MainTest {
    @Test
    void sorttest() {
        int[] array = {12, 11, 13, 5, 6, 7, 1, 9, 3};

        System.out.println("Исходный массив:");
        printArray(array);

        sort(array);

        System.out.println("Отсортированный массив (убывание, min-heap):");
        printArray(array);

        // Если нужен возрастающий порядок — раскомментируйте:
        // reverse(array);
        // System.out.println("Возрастающий порядок:");
        // printArray(array);
    }
}