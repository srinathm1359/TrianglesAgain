public class Tester {
  public static void main(String[] args) {
    Point A = new Point(1,2);
    //Testing getX() and getY()
    System.out.println(A.getX());
    System.out.println(A.getY());
    Point B = new Point(4,6);
    //Testing distanceTo()
    System.out.println(A.distanceTo(B));
  }
}
