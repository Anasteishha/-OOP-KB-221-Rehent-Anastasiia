public class Segment {
    private Point start;
    private Point end;

    public Segment(Point start, Point end) {
        if (start.equals(end)) {
            throw new RuntimeException("Відрізок не може бути виродженим");
        }
        this.start = start;
        this.end = end;
    }

    public double length() {
        double dx = end.getX() - start.getX();
        double dy = end.getY() - start.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Point middle() {
        double x = (start.getX() + end.getX()) / 2;
        double y = (start.getY() + end.getY()) / 2;
        return new Point(x, y);
    }

    public Point intersection(Segment another) {
        // Реалізація методу intersection
        //...
        // для простоти, повертаємо null, якщо лінії не перетинаються
        return null;
    }
}