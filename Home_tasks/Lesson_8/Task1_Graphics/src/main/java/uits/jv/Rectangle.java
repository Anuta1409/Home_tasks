package uits.jv;

public class Rectangle extends Shape{

    private Point point1;
    private Point point2;

    public Rectangle(Point point1,Point point2){
        this.point1 = point1;
        this.point2 = point2;
    }



    @Override
    public void draw() {

        //++++++++++++++++++++++++++++FIND X++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        int horizontalLineLenght = Math.abs(point1.getX()- point2.getX());
        int[] x = new int[horizontalLineLenght];

        for (int i=0;i < horizontalLineLenght;i++){
            if(point1.getX()>point2.getX()) {
                x[i]= point1.getX() - i;
            }else if(point1.getX()<point2.getX()){
                x[i]= point1.getX() + i;
            }

            int xOffset = x[i];
            int yOffsetT = point1.getY();
            int yOffsetB = point2.getY();

            Point pointsRectLine1 = new Point(xOffset,yOffsetT);
            Point pointsRectLine2 = new Point(xOffset,yOffsetB);


            Point[] pointsR = new Point[2*horizontalLineLenght];
            pointsR[i] = pointsRectLine1;
            //pointsR[i] = pointsRectLine2;
            System.out.println(pointsR[i]);
        }
        System.out.println(point1.getX()+" "+point2.getX()+" "+horizontalLineLenght);

       //+++++++++++++++++++++++++++++++FIND Y+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        int verticalLineLenght = Math.abs(point1.getY()- point2.getY());
        int[] y = new int[verticalLineLenght];

        for (int i=0;i < verticalLineLenght;i++){
            if(point1.getY() > point2.getY()) {
                y[i]= point1.getY() - i;
            }else if(point1.getY() < point2.getY()) {
                y[i]= point1.getY() + i;
            }

            int yOffset = y[i];
            int xOffsetLine1 = point1.getX();
            int xOffsetLine2 = point2.getX();

            Point pointsRectLine1 = new Point(xOffsetLine1,yOffset);
            Point pointsRectLine2 = new Point(xOffsetLine2,yOffset);


            Point[] pointsR = new Point[2*verticalLineLenght];
            //pointsR[i] = pointsRectLine1;
            pointsR[i] = pointsRectLine2;
            System.out.println(pointsR[i]);
        }
        System.out.println(point1.getY()+" "+point2.getY()+" "+verticalLineLenght);


    }

}

