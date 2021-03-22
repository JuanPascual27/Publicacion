package publicacion;

public class Periodico extends Publicacion implements Periodicidad {
   private String secciones;
   private String edicion;
   
   public String getSecciones(){
      return secciones;
   }
   
   public void setSecciones(String sec){
      secciones = sec;
   }

   public String getEdicion(){
      return edicion;
   }
   
   public void setEdicion(String edi){
      edicion = edi;
   }
    
   @Override
   public String getPeriodicidad(){
      return periodicidad;
   }
}