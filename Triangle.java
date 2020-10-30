public class Triangle {
  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
    v1 = new Point(x1,y1);
    v2 = new Point(x2,y2);
    v3 = new Point(x3,y3);
  }

  public double getPerimeter() {
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
  }

  public double getArea() {
    double a = v1.distanceTo(v2);
    double b = v2.distanceTo(v3);
    double c = v3.distanceTo(v1);
    double s = this.getPerimeter() / 2.0;
    return Math.sqrt(s * (s-a) * (s-b) * (s-c));
  }

  public String classify() {
    double a = v1.distanceTo(v2);
    double b = v2.distanceTo(v3);
    double c = v3.distanceTo(v1);
    a = Math.round(a*10000.0)/10000.0;
    b = Math.round(b*10000.0)/10000.0;
    c = Math.round(c*10000.0)/10000.0;
    if (a == b && b == c) {
      return "equilateral";
    }
    if (a == b || b == c || a == c) {
      return "isosceles";
    }
    return "scalene";
  }
}
