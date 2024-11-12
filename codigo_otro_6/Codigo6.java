//se coloco en el main, se corrio la sintaxis en el array, en la condicion ternaria, se corrigio el for en el incremento de la iteracion, se coloco el  out en el sysyout, en el parse int se agrego el parentesis faltante, se creo la variable e entera, se coloco el out en el ultimo sysyout y la palabra for en lugar de foreach, ademas de cambiar el chr por el int

public class codigo6 {
	  
	   Scanner s = new Scanner(System.in);
            int n[] = new int[20];
            int e;

	    for (int i = 0; i < 20; i++) {
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " ");
	    }
	    
	    System.out.println("\n¿Qué números quiere resaltar? ");
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    int opcion = Integer.parseInt(System.console().readLine());

	    int multiplo = (opcion == 1) ? 5 : 7;

	    for (int e : n) {
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");}
	       else {
	        System.out.print(e + " ");
	      }
	    }
    
	}