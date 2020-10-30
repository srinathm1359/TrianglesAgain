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

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double distanceTo(Point other) {
    double xshift = x - other.x;
    double yshift = y - other.y;
    return Math.sqrt(xshift*xshift + yshift*yshift);
  }

  public boolean equals(Point other) {
    return (x == other.x && y == other.y);
  }
}
