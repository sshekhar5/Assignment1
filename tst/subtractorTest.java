public class subtractorTest {
    public void testSubtract() {
        subtractor sub = new subtractor();
        int result = sub.subtract(5, 2);
        assert(result == 3);
    }
}
