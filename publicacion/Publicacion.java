package publicacion;

public abstract class Publicacion {
   private String titulo;
   private int numPag;
   private double precio;
   
   public String getTitulo(){
      return titulo;
   }
   
   public void setTitulo(String tit){
      titulo = tit;
   }
   
   public int getNumPag(){
      return numPag;
   }
   
   public void setNumPag(int np){
      numPag = np;
   }
   
   public double getPrecio(){
      return precio;
   }
   
   public void setPrecio(double pre){
      precio = pre;
   }
}