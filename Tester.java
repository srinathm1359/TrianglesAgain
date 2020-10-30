public class Tester {
  public static void main(String[] args) {
    //Testing getX() and getY()
    Point A = new Point(1,2);
    System.out.println(A.getX());
    System.out.println(A.getY());
    //Testing distanceTo()
    Point B = new Point(4,6);
    System.out.println(A.distanceTo(B));
    //Testing equals()
    Point C = new Point(A);
    System.out.println(A.equals(B));
    System.out.println(A.equals(C));
    System.out.println(B.equals(C));
    //Triangle.java
    Point D = new Point(4,2);
    Triangle first = new Triangle(A,B,D);
    Triangle second = new Triangle(0,0,3,3,6,0);
    //Testing getPerimeter()
    System.out.println(first.getPerimeter());
    System.out.println(second.getPerimeter());
    //Testing getArea()
    System.out.println(first.getArea());
    System.out.println(second.getArea());
    //Testing classify()
    Triangle third = new Triangle(0,0,2,0,1,1.7320508);
    System.out.println(first.classify());
    System.out.println(second.classify());
    System.out.println(third.classify());
    //Testing toString()
    System.out.println(first);
    System.out.println(second);
    System.out.println(third);
    //Testing setVertex()
    second.setVertex(1,D);
    System.out.println(second);
  }
}
