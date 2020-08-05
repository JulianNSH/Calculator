/* By Paniș Iulian
 * created on 8/5/2020
 */

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;

public class TestCalculator {
    //testing the div return
    @Test
    public void testDiv() {
        Calculate divObj = new Calculate();
        double result = divObj.doCalc(4, 10, 5);
        Assert.assertEquals(2.0, result, 0);
    }
    //test if menu return a integer value
    @Test
    public void testMenu() throws NoSuchMethodException {
        Menu menuObj = new Menu();
        Class c = menuObj.getClass();
        Method m = c.getDeclaredMethod("showSimpleMenu", null);
        Assert.assertEquals(m.getReturnType(), Integer.TYPE);
    }
}

