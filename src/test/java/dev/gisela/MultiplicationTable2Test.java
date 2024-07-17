package dev.gisela;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class MultiplicationTable2Test {
        @Test
        public void MultiplicationTable2() {
            int n = 2;
            int[] expected = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
            assertArrayEquals(expected, generateMultiplicationTableArrayNumber2(n));
        }
        
        private int[] generateMultiplicationTableArrayNumber2(int n) {
            int[] result = new int[10];
            for (int i = 1; i <= 10; i++) {
                result[i - 1] = n * i;
            }
            return result;
        }
        
}
