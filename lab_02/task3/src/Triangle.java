public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        if (isCollinear(a, b, c)) {
            throw new RuntimeException("Точки належать до однієї прямої, трикутник не існує");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private boolean isCollinear(Point a, Point b, Point c) {
        double dx1 = b.getX() - a.getX();
        double dy1 = b.getY() - a.getY();
        double dx2 = c.getX() - a.getX();
        double dy2 = c.getY() - a.getY();
        return dx1 * dy2 - dx2 * dy1 == 0;
    }

    public double area() {
        double ax = a.getX();
        double ay = a.getY();
        double bx = b.getX();
        double by = b.getY();
        double cx = c.getX();
        double cy = c.getY();
        return Math.abs((ax * (by - cy) + bx * (cy - ay) + cx * (ay - by)) / 2.0);
    }

    public Point centroid() {
        double x = (a.getX() + b.getX() + c.getX()) / 3.0;
        double y = (a.getY() + b.getY() + c.getY()) / 3.0;
        return new Point(x, y);
    }
}