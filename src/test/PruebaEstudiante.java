package test;

import dominio.Estudiante;
import java.util.Scanner;

public class PruebaEstudiante {

    static Scanner datos = new Scanner(System.in);

    public static void main(String[] args) {
        Estudiante[] estudiantes;
        int n = 3;
        estudiantes = new Estudiante[n];
        llenaDatos(estudiantes);
        System.out.println("Datos de Estudiantes");
        System.out.println("Nombre \t\tGénero\t\tNota");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i]);
        }
    }

    public static void llenaDatos(Estudiante est[]) {
        String nombre;
        char genero;
        double nota;
        for (int i = 0; i < est.length; i++) {
            System.out.println("Nombre:");
            nombre = datos.nextLine();
            System.out.println("Género:");
            genero = datos.nextLine().charAt(0);
            System.out.println("Nota:");
            nota = datos.nextDouble();
            est[i] = new Estudiante(nombre, genero, nota);
            datos.nextLine();
        }

    }
    /*public static void Pmujeres(Estudiante mujer){
        int nm, pm;
        if(estudiantes == 'M' || estudiantes == 'm'){
            pm++;           
        }
        nm = pm*100/n;
        System.out.println("El porcentaje de mujeres es: "+nm+" %");
    }
    public static void PHombres(Estudiante hombre){
        int nh, ph;
        if(estudiantes == 'M' || estudiantes == 'm'){
            ph++;
        }
        nh = ph*100/n;
        System.out.println("El porcentaje de mujeres es: "+nh+" %");
    }*/

}
