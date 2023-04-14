public class Line {
    //реализуйте получение стартовой точки, конечной, toString() в формате: [x, y], [x1, y1], GetLength() и hasPoint()
    private final Point startPoint;
    private final Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double getLength() {
        return startPoint.getDistance(endPoint);
    }

    public boolean hasPoint(Point p) {
        try {
            if (startPoint.getX() == endPoint.getX()) {
                return (startPoint.getX() == p.getX()) && (p.getY() >= Math.min(startPoint.getY(), endPoint.getY())) && (p.getY() <= Math.max(startPoint.getY(), endPoint.getY()));
            } else if (startPoint.getY() == endPoint.getY()) {
                return (startPoint.getY() == p.getY()) && (p.getX() >= Math.min(startPoint.getX(), endPoint.getX())) && (p.getX() <= Math.max(startPoint.getX(), endPoint.getX()));
            } else
                return (((p.getX() - startPoint.getX()) / (endPoint.getX() - endPoint.getY())) == ((p.getY() - startPoint.getX()) / (endPoint.getY() - startPoint.getY())));
        } catch (Exception e) {
            return false;
        }
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    @Override
    public String toString() {
        return String.format("[%d, %d], [%d, %d]", startPoint.getX(), startPoint.getY(), endPoint.getX(), endPoint.getY());
    }
}
