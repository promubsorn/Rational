import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testConstructor() throws Rational.Illegal {
        Rational x = new Rational(1, 2);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(2, x.denominator);
    }
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
    }
    @Test
    public void testSubtract() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }
    @Test
    public void testMultiply() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.multiply(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(8, x.denominator);
    }

    @Test
    public void testDivide() throws Rational.Illegal {
        Rational x = new Rational(1, 2);
        Rational y = new Rational(1, 4);
        x.divide(y);
        Assert.assertEquals(2, x.numerator);
        Assert.assertEquals(1, x.denominator);
    }

    @Test
    public void testEqual() throws Rational.Illegal {
        Rational x = new Rational(2, 4);
        Rational y = new Rational(1, 2);
        Assert.assertTrue(x.equals(y));

        Rational a = new Rational(2, 4);
        Rational b = new Rational(1, 4);
        Assert.assertFalse(a.equals(b));
    }

    @Test
    public void testCompareTo() throws Rational.Illegal {
        Rational x = new Rational(1, 2);
        Rational y = new Rational(2, 4);
        Assert.assertEquals(0, x.compareTo(y));

        Rational w = new Rational(1, 3);
        Rational v = new Rational(2, 3);
        Assert.assertEquals(1, v.compareTo(w));

        Rational a = new Rational(1, 3);
        Rational b = new Rational(2, 3);
        Assert.assertEquals(-1, a.compareTo(b));
    }

    @Test
    public void testToString() throws Rational.Illegal {
        Rational x = new Rational(1, 2);
        Assert.assertEquals("1/2", x.toString());
    }
}
