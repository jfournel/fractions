
import org.junit.Test;

import static org.junit.Assert.*;


public class FractionTest {
    @Test
    public void premierTest() {
        Fraction fr1 = new Fraction(2, 4);
        assertEquals(fr1.getNum(), 2);
        assertEquals(fr1.getDen(), 4);

    }

    @Test
    public void fractionIrreductibleTest() {
        Fraction fr1 = new Fraction(2, 4);
        Fraction fr2 = fr1.toFractionIrreductible();
        assertEquals(fr1.getNum(), 2);
        assertEquals(fr1.getDen(), 4);
        assertEquals(fr2.getNum(), 1);
        assertEquals(fr2.getDen(), 2);
    }

}