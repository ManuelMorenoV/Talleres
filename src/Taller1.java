import edu.princeton.cs.stdlib.StdDraw;

import java.awt.*;

public class Taller1 {
    public static void main(String[] args) {


        double min = -1.0;
        double max = 1.0;

        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);

        StdDraw.enableDoubleBuffering();

        /*Se declara la variable de x0 que es la posicion del punto 1 en coordenadas (x0,y0), de manera aleatoria las
        siguientes 4 conforman la linea*/

        double x0 = Math.random();
        double y0 = Math.random();

        double x1 = Math.random();
        double y1 = Math.random();

        //Para la siguiente linea 2//

        double x2 = x0-0.06;
        double y2 = y0-0.06;

        double x3 = x1-0.06;
        double y3 = y1-0.06;

        //Para la siguiente linea 3//

        double x4 = x2-0.06;
        double y4 = y2-0.06;

        double x5 = x3-0.06;
        double y5 = y3-0.06;

        //Para la siguiente linea 4//

        double x6 = x4-0.06;
        double y6 = y4-0.06;

        double x7 = x5-0.06;
        double y7 = y5-0.06;

        //Para la siguiente linea 5//

        double x8 = x6-0.06;
        double y8 = y6-0.06;

        double x9 = x7-0.06;
        double y9 = y7-0.06;

        //Para la siguiente linea 6//

        double x10 = x8-0.06;
        double y10 = y8-0.06;

        double x11 = x9-0.06;
        double y11 = y9-0.06;

        //Velocidad del movimiento de las lineas al azar y es la misma para las demas lineas//

        double vx = 0.001 * Math.random();
        double vy = 0.002 * Math.random();

        double vxLinea2 = vx;
        double vyLinea2 = vy;

        double vxLinea3 = vx;
        double vyLinea3 = vy;

        double vxLinea4 = vx;
        double vyLinea4 = vy;

        double vxLinea5 = vx;
        double vyLinea5 = vy;

        double vxLinea6 = vx;
        double vyLinea6 = vy;

        while (true) {

            if (Math.abs(x0+vx) > 1.0 ){ //linea 1 contiene las condiciones del movimiento de las lineas//
                                            // y que no se salga de la ventana generada, lo mismo con las otras Lineas//
                vx = -vx;
            }

            if (Math.abs(y0+vy) > 1.0 ){
                vy = -vy;
            }

            x1+=vx;
            y1+=vy;

            if (Math.abs(x1+vx) > 1.0 ){
                vx = -vx;
            }

            if (Math.abs(y1+vy) > 1.0 ){
                vy = -vy;
            }

            x0+=vx;
            y0+=vy;

            if (Math.abs(x2+vxLinea2) > 1.0 ){ //Line 2//
                vxLinea2 = -vxLinea2;
            }

            if (Math.abs(y2+vyLinea2) > 1.0 ){
                vyLinea2 = -vyLinea2;
            }

            x3+=vxLinea2;
            y3+=vyLinea2;

            if (Math.abs(x3+vxLinea2) > 1.0 ){
                vxLinea2 = -vxLinea2;
            }

            if (Math.abs(y3+vyLinea2) > 1.0 ){
                vyLinea2 = -vyLinea2;
            }

            x2+=vxLinea2;
            y2+=vyLinea2;

            if (Math.abs(x4+vxLinea3) > 1.0 ){ //Linea 3//
                vxLinea3 = -vxLinea3;
            }

            if (Math.abs(y4+vyLinea3) > 1.0 ){
                vyLinea3 = -vyLinea3;
            }

            x5+=vxLinea3;
            y5+=vyLinea3;

            if (Math.abs(x5+vxLinea3) > 1.0 ){
                vxLinea3 = -vxLinea3;
            }

            if (Math.abs(y5+vyLinea3) > 1.0 ){
                vyLinea3 = -vyLinea3;
            }

            x4+=vxLinea3;
            y4+=vyLinea3;

            if (Math.abs(x6+vxLinea4) > 1.0 ){ //Linea 4//
                vxLinea4 = -vxLinea4;
            }

            if (Math.abs(y6+vyLinea4) > 1.0 ){
                vyLinea4 = -vyLinea4;
            }

            x7+=vxLinea4;
            y7+=vyLinea4;

            if (Math.abs(x7+vxLinea4) > 1.0 ){
                vxLinea4 = -vxLinea4;
            }

            if (Math.abs(y7+vyLinea4) > 1.0 ){
                vyLinea4 = -vyLinea4;
            }
            x6+=vxLinea4;
            y6+=vyLinea4;

            if (Math.abs(x8+vxLinea5) > 1.0 ){ //Linea 5//
                vxLinea5 = -vxLinea5;
            }

            if (Math.abs(y8+vyLinea5) > 1.0 ){
                vyLinea5 = -vyLinea5;
            }

            x9+=vxLinea5;
            y9+=vyLinea5;

            if (Math.abs(x9+vxLinea5) > 1.0 ){
                vxLinea5 = -vxLinea5;
            }

            if (Math.abs(y9+vyLinea5) > 1.0 ){
                vyLinea5 = -vyLinea5;
            }
            x8+=vxLinea5;
            y8+=vyLinea5;

            if (Math.abs(x10+vxLinea6) > 1.0 ){ //Linea 6//
                vxLinea6 = -vxLinea6;
            }

            if (Math.abs(y10+vyLinea6) > 1.0 ){
                vyLinea6 = -vyLinea6;
            }

            x11+=vxLinea6;
            y11+=vyLinea6;

            if (Math.abs(x11+vxLinea6) > 1.0 ){
                vxLinea6 = -vxLinea6;
            }

            if (Math.abs(y11+vyLinea6) > 1.0 ){
                vyLinea6 = -vyLinea6;
            }
            x10+=vxLinea6;
            y10+=vyLinea6;

            //Se dibujan las lineas con distintos colores usando la libreria//

            StdDraw.setPenColor(StdDraw.BLUE.brighter());
            StdDraw.line(x0,y0,x1,y1);
            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.line(x2,y2,x3,y3);
            StdDraw.setPenColor(Color.cyan);
            StdDraw.line(x4,y4,x5,y5);
            StdDraw.setPenColor(Color.black);
            StdDraw.line(x6,y6,x7,y7);
            StdDraw.setPenColor(StdDraw.ORANGE);
            StdDraw.line(x8,y8,x9,y9);
            StdDraw.setPenColor(Color.GRAY);
            StdDraw.line(x10,y10,x11,y11);
            StdDraw.show();
            StdDraw.clear();
        }
    }
}
