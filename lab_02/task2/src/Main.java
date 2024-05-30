public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(3, 3);
        Segment segment = new Segment(p1, p2);

        System.out.println("Довжина відрізка: " + segment.length());
        System.out.println("Середня точка відрізка: " + segment.middle());

        Point p3 = new Point(2, 2);
        Point p4 = new Point(4, 4);
        Segment anotherSegment = new Segment(p3, p4);

        Point intersection = segment.intersection(anotherSegment);
        if (intersection!= null) {
            System.out.println("Точка перетину: " + intersection);
        } else {
            System.out.println("Лінії не перетинаються");
        }
    }
}