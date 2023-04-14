import java.util.ArrayList;

public class PolygonalLine {
    private ArrayList<Point> points = new ArrayList<>();

    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.size() - 1; i++) length += points.get(i).getDistance(points.get(i + 1));
        return length;
    }

    public void addPoint(Point p) {
        points.add(p);
        //реализуйте метод добавления точки
    }

    public void setPoints(ArrayList<Line> lines) {
        for (Line line : lines) {
            this.points.add(line.getStartPoint());
            this.points.add(line.getEndPoint());
        }
        //инициализация ломаной линии с помощью листа линий
    }
}
