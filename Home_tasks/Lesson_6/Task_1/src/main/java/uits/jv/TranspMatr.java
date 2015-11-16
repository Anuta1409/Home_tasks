package uits.jv;

/**
 * Created by Anna on 15.11.2015.
 */
public class TranspMatr {
    public static void main(String[] args){

        System.out.println("------Square matrix------");

        int[][] matr = new int[3][];//Initial Matrix
        int[][] tMatr = new int[3][];//Transpose square matrix


        for(int i = 0; i < matr.length; i++){
            matr[i] = new  int[3];
            tMatr[i] = new int[3];
            for (int j = 0; j < matr[i].length; j++){
                matr[i][j] = (int)(Math.round(Math.random()*100));
                System.out.print(matr[i][j]+ "  ");
            }
            System.out.println();
        }

        System.out.println("------Transpose square matrix------");
       for(int i = 0; i <  tMatr.length; i++) {
            for (int j = 0; j <  tMatr[i].length; j++) {
                tMatr[i][j] = matr[j][i];
                System.out.print(tMatr[i][j] + "  ");
            }
            System.out.println();
        }


        System.out.println("------Rectangle matrix------");

        int n = 2;
        int m = 10;

        int[][] matrRect = new int[n][];//Initial Matrix
        int[][] tMatrRect = new int[m][];//Transpose rectangle matrix

        for (int k = 0; k < tMatrRect.length; k++) {//Initialization massive size
            tMatrRect[k] = new int[n];
        }

        for (int k = 0; k < matrRect.length; k++){
            matrRect [k] = new int[m];
            for (int l = 0; l < matrRect[k].length; l++){
                matrRect[k][l] = (int)(Math.round(Math.random()*100));
                System.out.print(matrRect[k][l]+ "  ");
            }
            System.out.println();
        }

        System.out.println("------Transparent rectangle matrix------");

        for (int k = 0; k < tMatrRect.length; k++) {
            for (int l = 0; l <tMatrRect[k].length; l++) {
                tMatrRect[k][l] = matrRect[l][k];
                System.out.print(tMatrRect[k][l]+ "  ");
            }
            System.out.println();
        }
    }
}
