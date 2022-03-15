package proyectogit;

import java.util.Scanner;

public class test {
    public static void main (String args []){
        boolean bucle=true;
        Disco [] disc = new Disco[5];
        for (int i=0;i<disc.length;i++){
            disc[i]=new Disco();
        }
        while (bucle){
            System.out.println("Menú de discos");
            System.out.println("1: Insertar disco");
            System.out.println("2: Modificar disco");
            System.out.println("3: Borrar disco");
            System.out.println("4: Lista de discos");
            System.out.println("5: Salir del programa");
            System.out.print("Introduce una opción: ");
            int op=new Scanner(System.in).nextInt();
            switch(op){
                case 1 -> { 
                    if (Disco.getNumdisc()==disc.length){
                        System.out.println("No se puede introducir más discos, borra uno si quiere introducir otro");
                    }else{
                        try{
                            System.out.println("Indica la posición del disco (Del 1 al "+(disc.length)+")");
                            int d=new Scanner(System.in).nextInt();
                            d--;
                            if (disc[d].getEstado().equals("OCUPADO")){
                                System.out.println("El disco que has seleccionado ya está ocupado, por favor introduce otra posición");
                            }else{
                                System.out.println("Introduce el autor del disco");
                                String autor=new Scanner(System.in).nextLine();
                                System.out.println("Introduce el genero del disco");
                                String genero=new Scanner(System.in).nextLine();
                                System.out.println("Introduce el título del disco");
                                String titulo=new Scanner(System.in).nextLine();
                                System.out.println("Introduce la duración del disco");
                                int dur=new Scanner(System.in).nextInt();
                                disc[d]=new Disco(autor,titulo,genero,dur);
                                System.out.println("Insertando disco....");
                            }
                        }catch(Exception e){
                            System.out.println("Disco incorrecto ");
                        }
                    }
                }
                case 2 -> { 
                    for (int i=0;i<5;i++){
                        if (disc[i].getEstado().equals("OCUPADO"))
                        System.out.println(disc[i]);
                    }
                    System.out.println("Dime la posición del disco (Del 1 al "+(disc.length)+")");
                    Modificar m= new Modificar();
                    m.mod(disc);
                }
                case 3 -> {
                    System.out.println("Que disco desea borrar?");
                     
                    for (int i=0;i<5;i++){
                        if (disc[i].getEstado().equals("OCUPADO"))
                        System.out.println(disc[i]);
                    }
                    System.out.print("Elija un disco según su posición (Del 1 al "+(disc.length)+")");
                    int a=new Scanner(System.in).nextInt();
                    a--;
                    if (disc[a].getEstado().equals("LIBRE")){
                        System.out.println("El disco que has seleccionado no existe, prueba con otro disco.");
                    }else{
                        Disco dc2=new Disco();
                        disc[a]=dc2;
                        System.out.println("Disco eliminado");
                    }
                }
                case 4 -> {
                    System.out.println("Lista de todos los discos");
                    for (int i=0;i<5;i++){
                        System.out.println(disc[i]);
                    }
                    System.out.println("Menú de listados");
                    System.out.println("1. Lista de discos por autor");
                    System.out.println("2. Lista de discos por género");
                    System.out.println("3. Lista de discos por duracion");
                    System.out.println("4. Salir del menú de listados");
                    int a=new Scanner(System.in).nextInt();
                    a--;
                    switch (a) {
                        case 1 -> {
                            System.out.println("Introduce el autor del disco");
                            String aut = new Scanner(System.in).nextLine();
                            for (int i=0;i<disc.length;i++){
                                if (disc[i].getAutor().equals(aut)){
                                    System.out.println(disc[i]);
                                }
                            }
                        }
                        case 2 -> {
                            System.out.println("Introduce el género del disco");
                            String gen = new Scanner(System.in).nextLine();
                            for (int i=0;i<disc.length;i++){
                                if (disc[i].getGenero().equals(gen)){
                                    System.out.println(disc[i]);
                                }
                            }
                        }
                        case 3 -> {
                            System.out.println("Introduce el primer rango de duración del disco");
                            int dur1 = new Scanner(System.in).nextInt();
                            System.out.println("Introduce el segundo rango de duración del disco");
                            int dur2 = new Scanner(System.in).nextInt();
                            for (int i=0;i<disc.length;i++){
                                if (disc[i].getDuracion()>=dur1&&disc[i].getDuracion()<=dur2){
                                    System.out.println(disc[i]);
                                }
                            }
                        }
                        case 4 -> {
                            break;
                        }
                        default -> {
                            System.out.println("Opción inválida");
                        }
                    }
                }
                case 5 -> bucle=false;
                default -> System.out.println("Opción incorrecta");
            }
        }
    }
