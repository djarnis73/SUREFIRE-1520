import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Just a simple test to verify that surefire does actually run junit 5 tests
 */
public class Junit5Test {

    @Test
    public void test() {
        Assertions.assertTrue(true);
    }
}
