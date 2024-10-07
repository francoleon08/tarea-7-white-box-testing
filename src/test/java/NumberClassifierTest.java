import org.example.NumberClassifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * White-box test for the NumberClassifier class.
 */
public class NumberClassifierTest {

    private final NumberClassifier classifier = new NumberClassifier();
        
    @Test
    public void testPositiveEven() {
        String result = classifier.getNumberClassification(4);
        assertEquals("Positive Even", result);
    }

    @Test
    public void testPositiveOdd() {
        String result = classifier.getNumberClassification(3);
        assertEquals("Positive Odd", result);
    }

    @Test
    public void testNegativeEven() {
        String result = classifier.getNumberClassification(-2);
        assertEquals("Negative Even", result);
    }

    @Test
    public void testNegativeOdd() {
        String result = classifier.getNumberClassification(-5);
        assertEquals("Negative Odd", result);
    }

    @Test
    public void testZero() {
        String result = classifier.getNumberClassification(0);
        assertEquals("Zero", result);
    }

    @Test
    public void testNonPrimeNumbersLessThanOrEqualTo1() {
        assertFalse(classifier.isPrime(-5));
        assertFalse(classifier.isPrime(0));
        assertFalse(classifier.isPrime(1));
    }

    @Test
    public void testPrimeNumbers() {
        assertTrue(classifier.isPrime(2));
        assertTrue(classifier.isPrime(3));
        assertTrue(classifier.isPrime(5));
        assertTrue(classifier.isPrime(7));
        assertTrue(classifier.isPrime(11));
        assertTrue(classifier.isPrime(13));
    }

    @Test
    public void testNonPrimeNumbersGreaterThan1() {
        assertFalse(classifier.isPrime(4));
        assertFalse(classifier.isPrime(6));
        assertFalse(classifier.isPrime(8));
        assertFalse(classifier.isPrime(9));
        assertFalse(classifier.isPrime(12));
    }
}
