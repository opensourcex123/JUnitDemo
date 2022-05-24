public class TestObject {
    public int funcCoverage(int x, int y, int z) {
        if ((x > 3) && (z > 10)) {
            x++;
        } else {
            x--;
        }

        if ((y == 4) || (z < 12)) {
            z++;
        } else {
            z--;
        }

        return x + y + z;
    }
}
