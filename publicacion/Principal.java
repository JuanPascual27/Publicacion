/*
   Alumno: Juan Manuel Pascual Navarro
   Grupo: A

   *En el programa si se hizo el cambio de arreglo a ArrayList
   *¿Se podra realizar un ArrayList de tipo Object? 
      R = Si es posible realizar un ArrayList de tipo Object mediante la implementacion de la clase object
            como tipo generico del ArrayList a partir del operador de diamante <> el cual definira que ArrayList
            representara objetos de la superclase Object, en este caso los objetos de las clases hijas Revista, Periodico, Libro.
*/

package publicacion;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
   static Scanner leer = new Scanner(System.in);
   
   public static void main(String[] args) {
      int opc1,opc2;
      Revista revista;
      Periodico periodico;
      Libro libro;
      ArrayList<Object> publicaciones = new ArrayList<Object>();
      
      do{
         System.out.println("-------------------Menu----------------");
         System.out.println("1. Dar de alta una publicacion");
         System.out.println("2. Mostrar publicaciones");
         System.out.println("3. Salir");
         opc1 = opc(3);
         switch(opc1){
            case 1:
               System.out.println("¿Que tipo de publicacion desea dar de alta?");
               System.out.println("1. Revista");
               System.out.println("2. Libro");
               System.out.println("3. Periodico");
               System.out.println("4. Salir");
               opc2 = opc(4);
               switch(opc2){
                  case 1:
                     revista = new Revista();
                     revista.setTitulo(titulo());
                     revista.setPrecio(precio());
                     revista.setNumPag(paginas());
                     System.out.println("Ingrese el ISSN en formato 0000-0000:");
                     revista.setISSN(leer.nextLine());
                     revista.setNumero(numero());
                     revista.setAnio(anio());
                     publicaciones.add(revista);
                     break;
                  case 2:
                     libro = new Libro();
                     libro.setTitulo(titulo());
                     libro.setPrecio(precio());
                     libro.setNumPag(paginas());
                     System.out.println("Ingrese el ISBN en el siguiente formato 0000-00-0000:");
                     libro.setISBN(leer.nextLine());
                     System.out.println("Ingrese el autor del libro");
                     libro.setAutor(leer.nextLine());
                     System.out.println("Ingrese la edicion del libro:");
                     libro.setEdicion(leer.nextLine());
                     System.out.println("");
                     publicaciones.add(libro);
                     break;
                  case 3:
                     periodico = new Periodico();
                     periodico.setTitulo(titulo());
                     periodico.setPrecio(precio());
                     periodico.setNumPag(paginas());
                     System.out.println("Ingrese las secciones del periodico:");
                     periodico.setSecciones(leer.nextLine());
                     System.out.println("Ingrese la edicion del periodico:");
                     periodico.setEdicion(leer.nextLine());
                     System.out.println("");
                     publicaciones.add(periodico);
                     break;
               }
               break;
            case 2:
               Object p;
               for(int i = 0; i < publicaciones.size(); i++){
                  p = publicaciones.get(i);
                  if(p instanceof Revista){
                     revista = (Revista)p;
                     System.out.println("----REVISTA----");
                     System.out.println("Titulo: " + revista.getTitulo());
                     System.out.println("Precio: $" + revista.getPrecio());
                     System.out.println("Paginas: " + revista.getNumPag());
                     System.out.println("Numero: " + revista.getNumero());
                     System.out.println("Anio: " + revista.getAnio());
                     System.out.println("ISSN: " + revista.getISSN());
                  }else if(p instanceof Libro){
                     libro = (Libro)p;
                     System.out.println("---LIBRO---");
                     System.out.println("Titulo: " + libro.getTitulo());
                     System.out.println("Precio: $" + libro.getPrecio());
                     System.out.println("Paginas: " + libro.getNumPag());
                     System.out.println("Autor: " + libro.getAutor());
                     System.out.println("Edicion: " + libro.getEdicion());
                     System.out.println("ISBN: " + libro.getISBN());
                  }else if(p instanceof Periodico){
                     periodico = (Periodico)p;
                     System.out.println("---PERIODICO---");
                     System.out.println("Titulo: " + periodico.getTitulo());
                     System.out.println("Precio: $" + periodico.getPrecio());
                     System.out.println("Paginas: " + periodico.getNumPag());
                     System.out.println("Secciones: " + periodico.getSecciones());
                     System.out.println("Edicion: " + periodico.getEdicion());
                  }
                  System.out.println("");
               }
               break;
            case 3:
               System.out.println("Gracias");
               break;
         }
      }while(opc1 != 3);
   }
   
   public static int opc(int a){
      int num = -1;
      System.out.println("Ingrese el numero de una opcion a realizar:");
      do{
         try{
            num = Integer.parseInt(leer.nextLine());
         }catch(NumberFormatException e){
            System.out.println("El dato que ingreso no es un numero");
         }
         if(num < 1 || num > a)
            System.out.println("Ingrese una opcion correcta:");
      }while(num < 1 || num > a);
      System.out.println("");
      return num;
   }
   
   public static String titulo(){
      System.out.println("Ingrese el titulo de la publicacion");
      String t = leer.nextLine();
      return t;
   }
   
   public static int paginas(){
      System.out.println("Ingrese el numero de paginas de la publicacion: ");
      int pag = -1;
      do{
         try{
            pag = Integer.parseInt(leer.nextLine());
         }catch(NumberFormatException e){
            System.out.println("El dato que ingreso no es un numero");
         }
         if(pag < 1)
            System.out.println("Ingrese un numero de paginas valido:");
      }while(pag < 1);
      System.out.println("");
      return pag;
   }
   
   public static double precio(){
      System.out.println("Ingrese el precio de la publicacion: ");
      double p = -1;
      do{
         try{
            p = Double.parseDouble(leer.nextLine());
         }catch(NumberFormatException e){
            System.out.println("El dato que ingreso no es un numero");
         }
         if(p < 0)
            System.out.println("Ingrese un precio valido:");
      }while(p < 0);
      System.out.println("");
      return p;
   }
   
   public static int numero(){
      System.out.println("Ingrese el numero de la publicacion: ");
      int num = -1;
      do{
         try{
            num = Integer.parseInt(leer.nextLine());
         }catch(NumberFormatException e){
            System.out.println("El dato que ingreso no es un numero");
         }
         if(num< 1)
            System.out.println("Ingrese un numero valido:");
      }while(num < 1);
      System.out.println("");
      return num;
   }
   
   public static int anio(){
      System.out.println("Ingrese el anio de la publicacion: ");
      int a = -1;
      do{
         try{
            a = Integer.parseInt(leer.nextLine());
         }catch(NumberFormatException e){
            System.out.println("El dato que ingreso no es un anio");
         }
         if(a < 1000 || a > 3000)
            System.out.println("Ingrese un anio valido:");
      }while(a < 1);
      System.out.println("");
      return a;
   }
}