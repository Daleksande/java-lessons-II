import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class RectangleTest {

//параметризация + проверка исключения

    Rectangle rectangle = new Rectangle();


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
        {3, 3, 9}, {2, 2, 4}});
    }

    @Parameterized.Parameter
    public double a;

    @Parameterized.Parameter(1)
    public double b;

    @Parameterized.Parameter(2)
    public double c;


    @Test
    public void testArea() {
//        assertEquals("Площадь треугольника считается неверно",9.0, rectangle.rectangleArea(3,3));
        assertEquals("Площадь треугольника считается неверно",c, rectangle.rectangleArea(a,b));
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testException() throws NullPointerException {
        thrown.expect(NullPointerException.class);
        thrown.expectMessage("Некорректное значение одного из параметров");
        rectangle.rectangleArea(0, 3);
    }

}
