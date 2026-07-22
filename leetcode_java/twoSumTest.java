import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class twoSumTest {
    private final twoSum sol = new twoSum();

    @Test
    void findsPairSummingToTarget() {
        assertArrayEquals(new int[]{0, 1}, sol.twosum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void findsPairNotAtStart() {
        assertArrayEquals(new int[]{1, 2}, sol.twosum(new int[]{3, 2, 4}, 6));
    }

    @Test
    void noPairFound() {
        assertArrayEquals(new int[]{-1, -1}, sol.twosum(new int[]{1, 2, 3}, 100));
    }
}
