import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;


// 条件覆盖
@RunWith(value = Parameterized.class)
public class TestConditionalCoverage {
    TestObject testObject = new TestObject();
    private final int x;
    private final int y;
    private final int z;
    private final int expected;

    public TestConditionalCoverage(int x, int y, int z, int expected){
        this.x = x;
        this.y = y;
        this.z = z;
        this.expected = expected;
    }

    @Test
    public void funcCoverage() {
        int actual = testObject.funcCoverage(x, y,z);
        assertEquals(expected, actual);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getTestParams() {
        return Arrays.asList(new Object[][]{
                {4, 4, 9, 17},  // tftt
                {2, 3, 13, 16}, // ftff
        });
    }
}
