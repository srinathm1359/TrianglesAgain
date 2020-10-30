public class Point {
  private double x,y;

  //Construct a point given coordinates
  public Point(double X, double Y) {
    x = X;
    y = Y;
  }

  //Construct a point given a point
  public Point(Point p) {
    x = p.x;
    y = p.y;
  }
}
