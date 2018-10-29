import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class RectangleTestWithRule {
    @Rule
    public RectangleRule rule = new RectangleRule();

    @Test
    public void rectangleTest() {
        Rectangle rectangle = rule.getRectangle();
        Assert.assertEquals(rule.getA() * rule.getB(), rectangle.rectangleArea(rule.getA(), rule.getB()), 0);
    }


}
