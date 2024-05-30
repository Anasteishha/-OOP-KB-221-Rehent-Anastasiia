public class Line {
    private double k; // Коефіцієнт k
    private double b; // Коефіцієнт b

    public Line(double k, double b) {
        this.k = k;
        this.b = b;
    }

    // Метод для знаходження точки перетину з іншою лінією
    public Point intersection(Line otherLine) {
        if (this.k == otherLine.k) {
            if (this.b == otherLine.b) {
                return null; // Лінії збігаються
            } else {
                return null; // Лінії паралельні
            }
        }

        // Знаходження точки перетину за формулами
        double x = (otherLine.b - this.b) / (this.k - otherLine.k);
        double y = this.k * x + this.b;

        return new Point(x, y);
    }

    public double getK() {
        return k;
    }

    public double getB() {
        return b;
    }
}