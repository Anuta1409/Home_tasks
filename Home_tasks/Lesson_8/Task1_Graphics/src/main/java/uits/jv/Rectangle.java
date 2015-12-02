package uits.jv;
//цикл по горизонтали
//для каждой точки на отрезке
//создаем новую точку для верхнего и нижнего отрезка
//координаты вержнего (tL.x + xOffset, tl.y)
//координаты нижнего  (tL.x + xOffset, bR.y)
////////////////////////////////////////////////////////////////////////
//цикл по вертикали
//для каждой точки на отрезке
//создаем новую точку для левого и правого отрезка
//координаты левый (tL.x , tl.y + offset)
//координаты правый(bR.x, tl.y + offset)

public class Rectangle extends Shape{

    private Point point1;
    private Point point2;

    public Rectangle(Point point1,Point point2){
        this.point1 = point1;
        this.point2 = point2;
    }



    @Override
    public void draw() {
        int horizontalLineLenght = Math.abs(point1.getX()- point2.getX());
        int verticalLineLenght = Math.abs(point1.getY()- point2.getY());
        Point[] points = new Point[2*horizontalLineLenght+2*verticalLineLenght];//Определили размер массива точек

        //++++++++++++++++++++++++++++FIND X++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


        int[] x = new int[horizontalLineLenght];

        for (int i=0;i < horizontalLineLenght;i++){ //проверка на расположение точек в плоскости
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



            points[i] = pointsRectLine1;
            points[i+horizontalLineLenght] = pointsRectLine2;
        }

       //+++++++++++++++++++++++++++++++FIND Y+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

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


            points[2*horizontalLineLenght+i] = pointsRectLine1;
            points[2*horizontalLineLenght+verticalLineLenght+i] = pointsRectLine2;

        }

        for(int i = 0; i < points.length; i++){
            System.out.println(points[i]);
        }


    }

}

