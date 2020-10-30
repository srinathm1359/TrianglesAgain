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
    Point C = new Point(1,2);
    System.out.println(A.equals(B));
    System.out.println(A.equals(C));
    System.out.println(B.equals(C));
  }
}
