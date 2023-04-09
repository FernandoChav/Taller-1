package cl.ucn.disc.pa.stdlib.examples;
import edu.princeton.cs.stdlib.StdDraw;
import java.awt.*;

/**
 * Programa que crea un protector de pantalla
 * @author Fernando Chavez Briceno correo fernando.chavez@alumnos.ucn.cl rut: 21.180.530-7
 */
public class Main {
    public static void main(String[] args) {
        //Rango del dibujo
        double min = -1.0;
        double max = 1.0;
        // Definicion de la escala del lienzo de dibujo
        StdDraw.setXscale(min,max);
        StdDraw.setYscale(min,max);
        //Evitar el parpadeo de la pantalla
        StdDraw.enableDoubleBuffering();
        // Linea principal
        double x0 = min + (max - min) * Math.random();
        double y0 = min + (max - min) * Math.random();
        double x1 = min + (max - min) * Math.random();
        double y1 = min + (max - min) * Math.random();
        //segunda linea
        double x2 = x0+0.06;
        double y2 = y0+0.06;
        double x3 = x1+0.06;
        double y3 = y1+0.06;
        // tercera linea
        double x4 = x2+0.06;
        double y4 = y2+0.06;
        double x5 = x3+0.06;
        double y5 = y3+0.06;
        //cuarta linea
        double x6 = x4+0.06;
        double y6 = y4+0.06;
        double x7 = x5+0.06;
        double y7 = y5+0.06;
        //quinta linea
        double x8 = x6+0.06;
        double y8 = y6+0.06;
        double x9 = x7+0.06;
        double y9 = y7+0.06;
        // sexta linea
        double x10 = x8+0.06;
        double y10 = y8+0.06;
        double x11 = x9+0.06;
        double y11 = y9+0.06;

        // velocidad de la linea principal.
        double vx = 0.006*Math.random();
        double vy = 0.006*Math.random();

        double vx1 = vx;
        double vy1 = vy;
        // velocidad de la segunda linea.
        double vx2 = vx;
        double vy2 = vy;

        double vx3 = vx;
        double vy3 = vy;
        // velocidad tercera linea.
        double vx4 = vx;
        double vy4 = vy;

        double vx5 = vx;
        double vy5 = vy;
        //velocidad de la cuarta linea
        double vx6 = vx;
        double vy6 = vy;

        double vx7 = vx;
        double vy7 = vy;
        //velocidad de la quinta linea
        double vx8 = vx;
        double vy8 = vy;

        double vx9 = vx;
        double vy9 = vy;
        //velocidad de la sexta linea.
        double vx10 = vx;
        double vy10 = vy;

        double vx11 = vx;
        double vy11 = vy;


        //radio general de cada circulo.
        double radio = 0.001;
        //declaramos el arreglo de colores
        Color[] colores = {Color.BLUE,Color.RED,Color.YELLOW,Color.ORANGE,Color.BLACK,Color.CYAN};
        while(true){
            //Colision primera linea
            if (Math.abs(x0 + vx) > 1.0 - radio){
                vx = -vx;
            }
            if (Math.abs(y0 + vy) > 1.0 -radio){
                vy = -vy;
            }
            if (Math.abs(x1 + vx1) > 1.0 - radio){
                vx1 = -vx1;
            }
            if (Math.abs(y1 + vy1) > 1.0 -radio){
                vy1 = -vy1;
            }
            //Colision segunda linea
            if (Math.abs(x2 + vx2) > 1.0 - radio){
                vx2 = -vx2;
            }
            if (Math.abs(y2 + vy1) > 1.0 -radio){
                vy2 = -vy2;
            }
            if (Math.abs(x3 + vx3) > 1.0 - radio){
                vx3 = -vx3;
            }
            if (Math.abs(y3 + vy3) > 1.0 -radio){
                vy3 = -vy3;
            }
            //Colision tercera linea
            if (Math.abs(x4 + vx4) > 1.0 - radio){
                vx4 = -vx4;
            }
            if (Math.abs(y4 + vy4) > 1.0 -radio){
                vy4 = -vy4;
            }
            if (Math.abs(x5 + vx5) > 1.0 - radio){
                vx5 = -vx5;
            }
            if (Math.abs(y5 + vy5) > 1.0 -radio){
                vy5 = -vy5;
            }
            //Colision cuarta linea
            if (Math.abs(x6 + vx6) > 1.0 - radio){
                vx6 = -vx6;
            }
            if (Math.abs(y6 + vy6) > 1.0 -radio){
                vy6 = -vy6;
            }
            if (Math.abs(x7 + vx7) > 1.0 - radio){
                vx7 = -vx7;
            }
            if (Math.abs(y7 + vy7) > 1.0 -radio){
                vy7 = -vy7;
            }
            //Colision quinta linea
            if (Math.abs(x8 + vx8) > 1.0 - radio){
                vx8 = -vx8;
            }
            if (Math.abs(y8 + vy8) > 1.0 -radio){
                vy8 = -vy8;
            }
            if (Math.abs(x9 + vx9) > 1.0 - radio){
                vx9 = -vx9;
            }
            if (Math.abs(y9 + vy9) > 1.0 -radio){
                vy9 = -vy9;
            }
            //Colision sexta linea
            if (Math.abs(x10 + vx10) > 1.0 - radio){
                vx10 = -vx10;
            }
            if (Math.abs(y10 + vy10) > 1.0 -radio){
                vy10 = -vy10;
            }
            if (Math.abs(x11 + vx11) > 1.0 - radio){
                vx11 = -vx11;
            }
            if (Math.abs(y11 + vy11) > 1.0 -radio){
                vy11 = -vy11;
            }
            // actualizacion de posicion primera linea
            x0 += vx;
            y0 += vy;
            x1 += vx1;
            y1 += vy1;
            // actualizacion de posicion segunda linea
            x2 += vx2;
            y2 += vy2;
            x3 += vx3;
            y3 += vy3;
            // actualizacion de posicion tercera linea
            x4 += vx4;
            y4 += vy4;
            x5 += vx5;
            y5 += vy5;
            // actualizacion de posicion cuarta linea
            x6 += vx6;
            y6 += vy6;
            x7 += vx7;
            y7 += vy7;
            // actualizacion de posicion quinta linea
            x8 += vx8;
            y8 += vy8;
            x9 += vx9;
            y9 += vy9;
            // actualizacion de posicion sexta linea
            x10 += vx10;
            y10 += vy10;
            x11 += vx11;
            y11 += vy11;

            StdDraw.clear();
            //dibujar la esfera de la primera linea
            StdDraw.filledCircle(x0,y0,radio);
            StdDraw.filledCircle(x1,y1,radio);
            //dibujar la esfera de la segunda linea
            StdDraw.filledCircle(x2,y2,radio);
            StdDraw.filledCircle(x3,y3,radio);
            //dibujar la esfera de la tercera linea
            StdDraw.filledCircle(x4,y4,radio);
            StdDraw.filledCircle(x5,y5,radio);
            //dibujar la esfera de la cuarta linea
            StdDraw.filledCircle(x6,y6,radio);
            StdDraw.filledCircle(x7,y7,radio);
            //dibujar la esfera de la quinta linea
            StdDraw.filledCircle(x8,y8,radio);
            StdDraw.filledCircle(x9,y9,radio);
            //dibujar la esfera de la sexta linea
            StdDraw.filledCircle(x10,y10,radio);
            StdDraw.filledCircle(x11,y11,radio);
            //Generar las lineas.
            StdDraw.setPenColor(Color.RED);
            StdDraw.line(x0,y0,x1,y1);
            StdDraw.setPenColor(Color.BLACK);
            StdDraw.line(x2,y2,x3,y3);
            StdDraw.setPenColor(Color.CYAN);
            StdDraw.line(x4,y4,x5,y5);
            StdDraw.setPenColor(Color.YELLOW);
            StdDraw.line(x6,y6,x7,y7);
            StdDraw.setPenColor(Color.GREEN);
            StdDraw.line(x8,y8,x9,y9);
            StdDraw.setPenColor(Color.MAGENTA);
            StdDraw.line(x10,y10,x11,y11);

            StdDraw.show();

        }

    }
}