import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class RectangleRule implements TestRule {
    private Rectangle rectangle;

    private double a;
    private double b;

    @Override
    public Statement apply(final Statement base, final Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                a = Math.random();
                b = Math.random();
                rectangle = new Rectangle(a, b);
                base.evaluate();
            }
        };
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

}