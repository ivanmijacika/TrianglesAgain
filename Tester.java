public class Tester {
  public static void main (String[] args){
    Point A = new Point(1.1, 2.3);
    Point B = new Point(7.1, 10.3);
    Point C = new Point(7.1,2.3);
    Point D = new Point(A);
    Triangle right = new Triangle(A,B,C);
    Triangle equilateral = new Triangle(-5,0,0,Math.sqrt(75),5,0);
    Triangle isosceles = new Triangle(-3,0,0,2,3,0);
    Triangle test = new Triangle(0,1,5,13,10,25);
    System.out.println(A.getX());
    System.out.println(A.getY());
    System.out.println(A.distanceTo(B));
    System.out.println(B.distanceTo(A));
    System.out.println(D.equals(A));
    System.out.println(D.distanceTo(A));
    System.out.println(A.equals(B));
    System.out.println(right.getPerimeter());
    System.out.println(right.getArea());
    System.out.println(right.classify());
    System.out.println(equilateral.classify());
    System.out.println(isosceles.classify());
    System.out.println(right);
    System.out.println(equilateral);
    System.out.println(isosceles);
    test.setVertex(0,A);
    System.out.println(test);
    test.setVertex(1,B);
    System.out.println(test);
  }
}
