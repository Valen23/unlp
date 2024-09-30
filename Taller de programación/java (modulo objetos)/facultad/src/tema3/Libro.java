package tema3;

public class Libro {
    private String titulo;
    private Autor primerAutor;
    private String editorial;
    private int a�oEdicion;
    private String ISBN;
    private double precio;
    
    public Libro(String unTitulo, String unaEditorial, int unA�oEdicion, Autor unPrimerAutor, String unISBN, double unPrecio){
        titulo = unTitulo;
        editorial = unaEditorial; 
        a�oEdicion = unA�oEdicion;
        primerAutor = unPrimerAutor;
        ISBN = unISBN;
        precio = unPrecio;
    }
    
    public Libro(String unTitulo, String unaEditorial, Autor unPrimerAutor, String unISBN){
        titulo = unTitulo;
        editorial = unaEditorial; 
        a�oEdicion = 2015;
        primerAutor = unPrimerAutor;
        ISBN = unISBN;
        precio = 100;
    }
    
    public Libro(){
   
    }
        
    public String getTitulo(){
        return titulo;
    }
  
    public String getEditorial(){
        return editorial;
    }
    
    public int getA�oEdicion(){
        return a�oEdicion;
    }
  
    public Autor getPrimerAutor(){
        return primerAutor;
    }
    
    public String getISBN(){
        return ISBN;
    } 
    
    public double getPrecio(){
        return precio;
    }
   
    public void setTitulo(String unTitulo){
        titulo = unTitulo;
    }
   
    public void setEditorial(String unaEditorial){
         editorial = unaEditorial;
    }
    
    public void setA�oEdicion(int unA�o){
         a�oEdicion = unA�o;
    }
   
    public void setPrimerAutor(Autor unPrimerAutor){
         primerAutor = unPrimerAutor;
    }
    
    public void setISBN(String unISBN){
         ISBN = unISBN;
    }
    
    public void setPrecio(double unPrecio){
         precio = unPrecio;
    }
    
    @Override
    public String toString(){
        String aux;
        aux = titulo + " por " + primerAutor.getNombre() + " - " + a�oEdicion + " - " + " ISBN: " + ISBN;
        return aux;
    }
        
}