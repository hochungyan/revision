import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DistributeCandieTest {

    private final distributeCandie sol = new distributeCandie();

    @Test
    void evenSplitAcrossTypes() {
        assertEquals(3, sol.distributeCandies(new int[]{1, 1, 2, 2, 3, 3}));
    }

    @Test
    void moreTypesThanHalfAllowance() {
        assertEquals(2, sol.distributeCandies(new int[]{1, 1, 2, 3}));
    }

    @Test
    void singleTypeOnly() {
        assertEquals(1, sol.distributeCandies(new int[]{6, 6, 6, 6}));
    }

    @Test
    void allUniqueTypes() {
        assertEquals(2, sol.distributeCandies(new int[]{1, 2, 3, 4}));
    }

    @Test
    void minimumSizeArray() {
        assertEquals(1, sol.distributeCandies(new int[]{5, 5}));
    }

    @Test
    void negativeAndBoundaryTypeValues() {
        assertEquals(3, sol.distributeCandies(new int[]{-100000, -100000, 0, 0, 100000, 100000}));
    }
}
