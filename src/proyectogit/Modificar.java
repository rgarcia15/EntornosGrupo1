package proyectogit;

import java.util.Scanner;

public class Modificar extends Disco{
    public Modificar(){
        
    }
    public void mod (Disco d[]){
        int e=new Scanner(System.in).nextInt();
        e--;
        if (d[e].getEstado().equals("LIBRE")){
            System.out.println("El disco que has seleccionado no existe, prueba con otro disco.");
        }else{
            System.out.println("Que es lo que quieres modificar?");
            System.out.println("1.Autor del disco ");
            System.out.println("2.Género del disco ");
            System.out.println("3.Título del disco ");
            System.out.println("4.Duración del disco ");
            int op=new Scanner(System.in).nextInt();
            switch (op){
                case 1 -> {
                    System.out.println("Introduce el autor del disco");
                    String autor2=new Scanner(System.in).nextLine();
                    d[e].setAutor(autor2);
                }
                case 2 -> {
                    System.out.println("Introduce el genero del disco");
                    String genero2=new Scanner(System.in).nextLine();
                    d[e].setGenero(genero2);
                }
                case 3 -> {
                    System.out.println("Introduce el título del disco");
                    String titulo2=new Scanner(System.in).nextLine();
                    d[e].setTitulo(titulo2);
                }
                case 4 -> {
                    System.out.println("Introduce la duración ");
                    int dur2=new Scanner(System.in).nextInt();
                    d[e].setDuracion(dur2);
                }
                default -> System.out.println("Opción incorrecta :(");
            }
        }
    }
}
