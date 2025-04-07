public class Rectangle {

    public static Rectangle copy(final Rectangle toCopy) {
        return Rectangle.newRectangle(toCopy.x, toCopy.y, toCopy.width, toCopy.height);
    }

    public static Rectangle newRectangle(
            final int x,
            final int y,
            final int width,
            final int height
    ) {
        if (width < 0 || height < 0) {
            Utility.error(
                    String.format(
                            "Invalid rectangle dimensions: height %d, width %d",
                            height,
                            width
                    )
            );
            return null;
        }
        final Rectangle res = new Rectangle();
        res.x = x;
        res.y = y;
        res.width = width;
        res.height = height;
        return res;
    }

    private int height;

    private int width;

    private int x;

    private int y;

}
