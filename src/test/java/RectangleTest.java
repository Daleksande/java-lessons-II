import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

public class RectangleTest {

    Rectangle rectangle = new Rectangle();

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
        {3, 3, 9}, {2, 2, 4}});
    }

    @Parameterized.Parameter
    public double a;

    @Parameterized.Parameter
    public double b;

    @Parameterized.Parameter
    public double c;


    @Test
    public void testArea() {
//        assertEquals("Площадь треугольника считается неверно",9.0, rectangle.rectangleArea(3,3));
        assertEquals("Площадь треугольника считается неверно",c, rectangle.rectangleArea(a,b));
    }

}
