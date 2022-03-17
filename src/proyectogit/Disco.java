package proyectogit;

import java.util.Random;

public class Disco {
    private String estado="LIBRE";
    public String autor,titulo,genero;
    public int duracion;
    public int codigo;
    public static int ndisc;
    public Disco (){
        this.estado="LIBRE";
        this.autor="";
        this.titulo="";
        this.genero="";
        this.duracion=0;
        this.codigo=0;
        
    }
    public Disco (String a,String t,String g,int d){
        this.estado="OCUPADO";
        this.autor=a;
        this.titulo=t;
        this.genero=g;
        this.duracion=d;
        Random rn=new Random();
        this.codigo=1000+rn.nextInt(9999-1000);
        Disco.ndisc++;
    }
    public static int getNumdisc(){
        return ndisc;
    }
    public String getEstado(){
        return estado;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String autor){
        this.autor=autor;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public void setGenero(String genero){
        this.genero=genero;
    }
    
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String ti){
        this.titulo=ti;
    }
    public int getDuracion(){
        return duracion;
    }
    
    public void setDuracion(int duracion){
        this.duracion=duracion;
    }
    
    public String toString(){
        String cadena="\n-------------------------------";
            cadena+="\nCódigo: "+this.codigo;
            cadena+="\nAutor: "+this.autor;
            cadena+="\nTítulo: "+this.titulo;
            cadena+="\nGénero: "+this.genero;
            cadena+="\nDuración: "+this.duracion+" minutos";
            cadena+="\n-------------------------------";
        return cadena;
    }
}
