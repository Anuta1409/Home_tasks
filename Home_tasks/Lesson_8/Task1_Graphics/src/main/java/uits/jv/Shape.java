package uits.jv;

/**
 * Created by Anna on 24.11.2015.
 */
public abstract class  Shape {
        public abstract void draw();


    public static class Point{
        private int x;
        private int y;



        public Point(int x,int y){
            this.x = x;
            this.y = y;
        }

        public int getX(){
            return x;
        }

        public void setX(int x) {
            this.x = x;

        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;

        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
   }
