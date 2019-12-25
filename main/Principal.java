package main;
import punto.*;
import figura.*;

public class Principal {
    public static void main(String[] args) {

        P2 punto2 = new P2();
        P2 segundoPunto = new P2(1,2);
        P2 tercerPunto = new P2(segundoPunto);

        P3 cuartoPunto = new P3();
        P3 quintoPunto = new P3(1,2,3);
        P3 sextoPunto = new P3(segundoPunto, 2);
        P3 septimoPunto = new P3(quintoPunto);

        P4 octavoPunto = new P4();
        P4 novenoPunto = new P4(4,5,6,7);
        P4 decimoPunto = new P4(quintoPunto, 6);
        P4 onceavoPunto = new P4 (decimoPunto);

        System.out.println("Figura 4D");
        System.out.println(octavoPunto);
        System.out.println(novenoPunto);
        System.out.println(decimoPunto);
        System.out.println(onceavoPunto);
        System.out.println(octavoPunto.calcularDistancia(decimoPunto));

        Triangulo equilatero = new Triangulo();
        equilatero.setPunto1(punto2);
        equilatero.setPunto2(segundoPunto);
        equilatero.setPunto3(tercerPunto);

        Cubo cubito = new Cubo();
        cubito.getVertices()[0] = new P3(4,5,6);
        cubito.getVertices()[1] = septimoPunto;
        cubito.getVertices()[2] = sextoPunto;
        cubito.getVertices()[3] = quintoPunto;
        cubito.setVertices(cubito.getVertices());

        System.out.println("Figura 3D");
        System.out.println(cuartoPunto);
        System.out.println(quintoPunto);
        System.out.println(sextoPunto);
        System.out.println(septimoPunto);
        /*P3 [] a = cubito.getVertices();
        for(P3 p:a){
        System.out.println(p);
        */

        //P2 pruebaLiskov = new P3();

    }
}
