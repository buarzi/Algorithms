package buarzi.learning;

import org.junit.Test;

import static org.junit.Assert.*;

public class BytelandianGoldCoinsTest {

    @Test
    public void calculate12() {
        assertEquals(13,BytelandianGoldCoins.calculate(12));
    }

    @Test
    public void calculate2() {
        assertEquals(2,BytelandianGoldCoins.calculate(2));
    }

    @Test
    public void calculate20() {
        assertEquals(21,BytelandianGoldCoins.calculate(20));
    }

    @Test
    public void calculate23() {
        assertEquals(23,BytelandianGoldCoins.calculate(23));
    }

    @Test
    public void calculate1200() {
        assertEquals(1300,BytelandianGoldCoins.calculate(1200));
    }

    @Test
    public void calculate12345() {
        assertEquals(13373,BytelandianGoldCoins.calculate(12345));
    }

    @Test
    public void calculate289574() {
        assertEquals(313704,BytelandianGoldCoins.calculate(289574));
    }

    @Test
    public void calculate789350() {
        assertEquals(855128,BytelandianGoldCoins.calculate(789350));
    }

}