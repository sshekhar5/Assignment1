public class SubtractorTest {
   public void testSubtract() {
     Subtractor adder = new Subtractor();
     int result = adder.subtract(2,1);
     assert(result==1);
   }
}
