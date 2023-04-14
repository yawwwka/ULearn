public class Point {
    //реализуйте геттеры, конструктор и метод toString() в формате:[x, y]
    private final int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getDistance(Point p2) {
        return Math.sqrt((p2.getY() - y) * (p2.getY() - y) + (p2.getX() - x) * (p2.getX() - x));
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}
