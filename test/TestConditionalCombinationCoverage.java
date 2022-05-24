import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

// 条件组合覆盖
@RunWith(value = Parameterized.class)
public class TestConditionalCombinationCoverage {
    TestObject testObject = new TestObject();
    private final int x;
    private final int y;
    private final int z;
    private final int expected;

    public TestConditionalCombinationCoverage(int x, int y, int z, int expected) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.expected = expected;
    }

    @Test
    public void funcCoverage() {
        int actual = testObject.funcCoverage(x, y, z);
        assertEquals(expected, actual);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getTestParams() {
        return Arrays.asList(new Object[][]{
                {4, 4, 13, 23}, // tttf
                {4, 4, 9, 17},  // tftt
                {1, 3, 11, 15},  //ftft
                {1, 4, 9, 14},   // fftt
                {4, 1, 13, 18}   // ttff
        });
    }
}
