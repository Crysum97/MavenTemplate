import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import testExample.MathFacade;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest {

    static MathFacade test;

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(9.0, 3, 2),
                Arguments.of(100.0,10,2),
                Arguments.of(27.0, 3, 3)
        );
    }

    @BeforeAll
    static void setup() {
        test = new MathFacade();
    }

    @Test
    public void testSinglePow() {
        assertEquals(9.0, test.pow(3,2));
    }

    @ParameterizedTest
    @MethodSource("testData")
    public void testAllPow(double result, int base, int exp) {
        assertEquals(result, test.pow(base, exp));
    }
}
