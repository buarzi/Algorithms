package buarzi.learning;

import org.junit.Test;

import static org.junit.Assert.*;

public class RacingHorsesTest {

    @Test
    public void findMinimum01() {
        assertEquals(3, RacingHorses.findMinimum(new int[]{4, 9, 1, 32, 13}));
    }

    @Test
    public void findMinimum02() {
        assertEquals(1, RacingHorses.findMinimum(new int[]{44, 45, 2, 7, 11, 99, 151}));
    }

    @Test
    public void findMinimum03() {
        assertEquals(2, RacingHorses.findMinimum(new int[]{15, 19, 85, 3, 7, 41, 89, 69, 5}));
    }
}