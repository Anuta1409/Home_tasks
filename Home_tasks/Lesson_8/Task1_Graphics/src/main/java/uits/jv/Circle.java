package uits.jv;

/**
 * Created by Anna on 24.11.2015.
 */
public class Circle extends Shape {

    private Point center;
    private int rad;

    public Circle(int rad, Point c){
        this.rad = rad;
        this.center = c;
    }

    @Override
    public void draw() {

       // this.rad = 10;

        Point[] points = new Point[rad*4];

        for(int i = 0;i < rad;i++ ){
            int xOffset = rad - i;
            int yOffset = (int)Math.sqrt(Math.pow((double)rad,2.0) - Math.pow((double)xOffset,2.0));

            Point topRight = new Point(center.getX()+xOffset, center.getY()-yOffset);
            Point topLeft = new Point(center.getX()-xOffset, center.getY()-yOffset);
            Point bottomLeft = new Point(center.getX()-xOffset, center.getY()+yOffset);
            Point bottomRight = new Point(center.getX()+xOffset, center.getY()+yOffset);

            points[i] = topRight;
            points[i+(rad-1)] = topLeft;
            points[i+(rad*2-1)] = bottomLeft;
            points[i+(rad*3-1)] = bottomRight;
        }
        for(int i=0; i<points.length;i++){
            System.out.println(points[i]);
        }
    }
}
