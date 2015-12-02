package uits.jv;

/**
 * 1) ���� ��� ����� ������������ �, �, �
 * 2) ������� �������� ��������� ��� ������ �� ������ ������������ (y=kx+b):
 *  a) k = (A.getY()-B.getY())/((A.getX()-B.getX())
 *     b = kx - y
 *  b) k = (B.getY()-C.getY())/((C.getX()-C.getX())
 *     b = kx - y
 *  c) k = (C.getY()-A.getY())/((A.getX()-B.getX())
 *     b = kx - y
 * 3) � ����� �� ��������� xABOffset = A.getX()+i � ���������� �������� ������� ������� Y
 *                         xBCOffset = B.getX()+i
 *                         xCAOffset = C.getX()+i
 * 4) ����� ������ � �������
 */
public class Triangle extends Shape{
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle(Point pointA, Point pointB, Point pointC){
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    @Override
    public void draw() {

        // ������ �������
        int abLength = Math.abs(pointA.getX() - pointB.getX());
        int bcLength = Math.abs(pointB.getX() - pointC.getX());
        int caLength = Math.abs(pointC.getX() - pointA.getX());

        // ����� ������������� k � b
        double abK = (pointA.getY() - pointB.getY()) / (pointA.getX() - pointB.getX());
        double abB = abK * pointA.getX() - pointA.getY();

        double bcK = (pointB.getY() - pointC.getY()) / (pointB.getX() - pointC.getX());
        double bcB = bcK * pointB.getX() - pointB.getY();

        double caK = (pointC.getY() - pointA.getY()) / (pointC.getX() - pointA.getX());
        double caB = caK * pointC.getX() - pointC.getY();

        Point[] points = new Point[abLength+bcLength+caLength];
        // ����� Y �� ��������� ���������

        for (int i = 0; i < abLength; i++){
            int xABOffset = pointA.getX()+i;
            int yABOffset = (int) ((abK * xABOffset) + abB);

            Point ABTriangleLine = new Point(xABOffset,yABOffset);
            points[i] = ABTriangleLine;
        }

        for (int i = 0; i < bcLength; i++){
            int xBCOffset = pointB.getX()+i;
            int yBCOffset = (int) ((bcK * xBCOffset) + bcB);

            Point BCTriangleLine = new Point(xBCOffset,yBCOffset);
            points[abLength+i] = BCTriangleLine;
        }

        for (int i = 0; i < caLength; i++){
            int xCAOffset = pointC.getX()+i;
            int yCAOffset = (int) ((caK * xCAOffset) + caB);

            Point CATriangleLine = new Point(xCAOffset,yCAOffset);
            points[abLength+bcLength+i] = CATriangleLine;
        }


        for (int i = 0; i < points.length; i++)
        System.out.println( points[i]);
    }
}



