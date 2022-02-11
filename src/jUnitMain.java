import static org.junit.Assert.*;
import org.junit.Test;

class TestLogic {

    private Object Calculation;

    @Test
    public void testFindMax() {
        try {
            assertEquals(Calculation.equals(new int[]{1, 3, 4, 2}), 4);
            assertEquals(-1, Calculation.equals(new int[]{-12, -1, -3, -4, -2}));
            System.out.println("print something");
        }catch (Exception e){
            System.out.println("Exception: "+ e.getMessage());

        }
    }
}

    public class jUnitMain {
    public static void main(String[] args){
        TestLogic obj = new TestLogic();
        obj.testFindMax();
    }
}
