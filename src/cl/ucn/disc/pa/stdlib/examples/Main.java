package cl.ucn.disc.pa.stdlib.examples;
import edu.princeton.cs.stdlib.StdDraw;
import java.awt.*;

/**
 * Programa que crea un protector de pantalla
 * @author Fernando Chavez Briceno
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
        double vx = Math.random();
        double vy = Math.random();
        // velocidad de la segunda linea.
        double vx1 = Math.random();
        double vy1 = Math.random();
        // velocidad de la tercera linea.
        double vx2 = Math.random();
        double vy2 = Math.random();
        // velocidad de la cuarta linea.
        double vx3 = Math.random();
        double vy3 = Math.random();
        // velocidad de la quinta linea.
        double vx4 = Math.random();
        double vy4 = Math.random();
        // velocidad de la sexta linea.
        double vx5 = Math.random();
        double vy5 = Math.random();
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
            if (Math.abs(x1 + vx) > 1.0 - radio){
                vx = -vx;
            }
            if (Math.abs(y1 + vy) > 1.0 -radio){
                vy = -vy;
            }
            //Colision segunda linea
            if (Math.abs(x2 + vx1) > 1.0 - radio){
                vx1 = -vx1;
            }
            if (Math.abs(y2 + vy1) > 1.0 -radio){
                vy1 = -vy1;
            }
            if (Math.abs(x3 + vx1) > 1.0 - radio){
                vx1 = -vx1;
            }
            if (Math.abs(y3 + vy1) > 1.0 -radio){
                vy1 = -vy1;
            }
            //Colision tercera linea
            if (Math.abs(x4 + vx2) > 1.0 - radio){
                vx2 = -vx2;
            }
            if (Math.abs(y4 + vy2) > 1.0 -radio){
                vy2 = -vy2;
            }
            if (Math.abs(x5 + vx2) > 1.0 - radio){
                vx2 = -vx2;
            }
            if (Math.abs(y5 + vy2) > 1.0 -radio){
                vy2 = -vy2;
            }
            //Colision cuarta linea
            if (Math.abs(x6 + vx3) > 1.0 - radio){
                vx3 = -vx3;
            }
            if (Math.abs(y6 + vy3) > 1.0 -radio){
                vy3 = -vy3;
            }
            if (Math.abs(x7 + vx3) > 1.0 - radio){
                vx3 = -vx3;
            }
            if (Math.abs(y7 + vy3) > 1.0 -radio){
                vy3 = -vy3;
            }
            //Colision quinta linea
            if (Math.abs(x8 + vx4) > 1.0 - radio){
                vx4 = -vx4;
            }
            if (Math.abs(y8 + vy4) > 1.0 -radio){
                vy4 = -vy4;
            }
            if (Math.abs(x9 + vx4) > 1.0 - radio){
                vx4 = -vx4;
            }
            if (Math.abs(y9 + vy4) > 1.0 -radio){
                vy4 = -vy4;
            }
            //Colision sexta linea
            if (Math.abs(x10 + vx5) > 1.0 - radio){
                vx5 = -vx5;
            }
            if (Math.abs(y10 + vy5) > 1.0 -radio){
                vy5 = -vy5;
            }
            if (Math.abs(x11 + vx5) > 1.0 - radio){
                vx5 = -vx5;
            }
            if (Math.abs(y11 + vy5) > 1.0 -radio){
                vy5 = -vy5;
            }
            // actualizacion de posicion primera linea
            x0 += vx;
            y0 += vy;
            x1 += vx;
            y1 += vy;
            // actualizacion de posicion segunda linea
            x2 += vx1;
            y2 += vy1;
            x3 += vx1;
            y3 += vy1;
            // actualizacion de posicion tercera linea
            x4 += vx2;
            y4 += vy2;
            x5 += vx2;
            y5 += vy2;
            // actualizacion de posicion cuarta linea
            x6 += vx3;
            y6 += vy3;
            x7 += vx3;
            y7 += vy3;
            // actualizacion de posicion quinta linea
            x8 += vx4;
            y8 += vy4;
            x9 += vx4;
            y9 += vy4;
            // actualizacion de posicion sexta linea
            x10 += vx5;
            y10 += vy5;
            x11 += vx5;
            y11 += vy5;

            StdDraw.clear();
            //dibujar la esfera de la primera linea
            StdDraw.filledCircle(x0,y0,radio);
            StdDraw.filledCircle(x1,y1,radio);
            //dibujar la esfera de la segunda linea
            StdDraw.filledCircle(x2,y2,radio);
            StdDraw.filledCircle(x3,y3,radio);
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