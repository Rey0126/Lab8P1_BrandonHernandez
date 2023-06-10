/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8p1_brandonhernandez;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author brhb2
 */
public class Lab8P1_BrandonHernandez {

    static Scanner sc = new Scanner(System.in);
    static Random ran = new Random();
    static Libro[][] l;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean menu = true;
        boolean op2 = false;
        while (menu) {

            System.out.println("== MENU ==");
            System.out.println("1. Crear Biblioteca");
            System.out.println("2. Modificar Librero");
            System.out.println("3. Salir");
            System.out.println("Ingrese una opcion");
            int opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    l = llenarLibrero();
                    printLibrero(l);
                    op2 = true;

                    break;

                case 2:
                    if (op2) {
                        System.out.println("Ingrese el título del libro:");
                        String tituloN = sc.next();

                        System.out.println("Ingrese el escritor del libro:");
                        String escritorN = sc.next();

                        System.out.println("Ingrese el año del libro:");
                        int yearN = sc.nextInt();

                        l = ModificarLibro(l, tituloN, escritorN, yearN);
                        printLibrero(l);

                    } else {
                        System.out.println("Primero debes crear la biblioteca");
                    }
                    break;

                case 3:

                    menu = false;

                    break;

                default:
                    System.out.println("Opcion Invalida!!!!!");

            }

        }

    }

    static Libro[][] llenarLibrero() {

        System.out.println("Ingrese la cantidad de filas para el librero:");
        int filas = sc.nextInt();

        while (filas <= 0) {
            System.out.println("Cantidad Invalida, tiene que ser mayor que cero");
            System.out.println("Ingrese la cantidad de filas para el librero:");
            filas = sc.nextInt();
        }

        System.out.println("Ingrese la cantidad de columnas para el librero:");
        int columnas = sc.nextInt();

        while (columnas <= 0) {
            System.out.println("Cantidad Invalida, tiene que ser mayor que cero");
            System.out.println("Ingrese la cantidad de columnas para el librero:");
            columnas = sc.nextInt();
        }

        Libro[][] librero = new Libro[filas][columnas];

        for (int i = 0; i < librero.length; i++) {

            for (int j = 0; j < librero[i].length; j++) {

                System.out.println("Ingrese el titulo del libro");
                String titulo = sc.next();

                System.out.println("Ingrese el nombre del escritor");
                String escritor = sc.next();

                System.out.println("Ingrese el año de publicaion");
                int year = sc.nextInt();

                Libro L = new Libro(titulo, escritor, year);
                librero[i][j] = L;

            }
        }
        return librero;
    }

    public static void printLibrero(Libro[][] librero) {

        for (int i = 0; i < librero.length; i++) {

            for (int j = 0; j < librero[i].length; j++) {

                Libro librito = librero[i][j];
                System.out.print("[ " + librito.getNombre() + " ]");

            }
            System.out.println();
        }

    }

    public static Libro[][] ModificarLibro(Libro[][] librero, String titulo, String escritor, int año) {

        boolean title = false;
        boolean writ = false;
        boolean year = false;

        Libro[][] librero2 = new Libro[librero.length][librero.length];

        for (int i = 0; i < librero.length; i++) {

            for (int j = 0; j < librero[i].length; j++) {

                if (titulo.equals(librero[i][j].getNombre())) {
                    title = true;
                }

                if (escritor.equals(librero[i][j].getEscritor())) {
                    writ = true;
                }

                if (año == librero[i][j].getAño()) {
                    year = true;
                }

                if (title == true && writ == true && year == true) {

                    System.out.println("El libro fue encontrado en la fila " + i + 1 + " columna " + j + 1);

                    System.out.println();
                    System.out.println("Cambios para el Libro");
                    System.out.println("Ingrese el título del libro:");
                    String Ntitle = sc.next();
                    librero[i][j].setNombre(Ntitle);

                    System.out.println("Ingrese el escritor del libro:");
                    String Nwrit = sc.next();
                    librero[i][j].setEscritor(Nwrit);

                    System.out.println("Ingrese el año del libro:");
                    int Nyear = sc.nextInt();
                    librero[i][j].setAño(Nyear);

                    System.out.println("El librero fue modificado exitosamente");
                    System.out.println();
                    librero2[i][j] = librero[i][j];

                    System.out.println("El librero modificado es:");

                } else {
                    System.out.println("El libro no existe en la Biblioteca");
                }

            }

        }
        return librero2;
    }

}
