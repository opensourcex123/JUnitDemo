import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;


// 判定覆盖
@RunWith(value = Parameterized.class)
public class TestDecisionCoverage {
    TestObject testObject = new TestObject();
    private final int x;
    private final int y;
    private final int z;
    private final int expected;

    public TestDecisionCoverage(int x, int y, int z, int expected){
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
                {4, 4, 11, 21}, // 两个分支均为true
                {2, 3, 13, 16}, // 两个分支均为false
        });
    }
}
