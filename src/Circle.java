public class Circle {

    public static Circle newCircle(final int x, final int y, final int radius) {
        if (radius < 0) {
            Utility.error("Trying to create circle with negative radius " + radius + "!");
            return null;
        }
        final Circle res = new Circle();
        res.x = x;
        res.y = y;
        res.radius = radius;
        return res;
    }

    private int radius;

    private int x;

    private int y;

    @Override
    public Circle clone() {
        return Circle.newCircle(this.x, this.y, this.radius);
    }

}
