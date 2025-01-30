package Codigo;

import java.util.Scanner;//importar libreria

public class Codigo6 {
	  public static void main (String []args) {//Falta poner el public static void main para correr
		  Scanner scanner = new Scanner(System.in);// scanner para la entrada que se le debe de dar
	  
    int[] n =new int[20];//faltaba poner new
    
    for (int i = 0; i < 20; i++) { //faltaba poner el + para ir incrementando 
      n[i] = (int)(Math.random() * 381) + 20;
      System.out.print(n[i] + " "); //faltaba acompletar mi sysout
    }
    
    System.out.println("\n¿Qué números quiere resaltar? "); //Faltaba poner "n" en println
    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
    int opcion = scanner.nextInt(); //Se cambia correctamente el ingreso del usuario 
    
    int multiplo = (opcion == 1) ?  5 : 7;// va alreves el  ? y los dos :

    for (int e : n) { //es un for 
      if (e % multiplo == 0) {
        System.out.print("[" + e + "] ");
      }else {
        System.out.print(e + " ");// faltaba el out
      }
    }
    }  
}