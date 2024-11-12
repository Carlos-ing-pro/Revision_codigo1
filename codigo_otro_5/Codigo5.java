
//se completo el scanner, se corrigio en el sysout la comilla simpe por doble, se corrigio el tipo de dato ya que se le solicita un numero y no un string al usuario y se le agrego una t al syout del if

public class Codigo5 {

	    Scanner s = new Scanner(System.in);
	    System.out.print("Introduzca un número: ");
	    int ni = s.nextInt();
	    int c = ni;
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (ni > 0) {
		  int digito = (int)(ni % 10);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
		  
		  ni /= 10;
	    }

	    if (afo > noAfo) {
	      System.out.println("El " + c + " es un número afortunado.");
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
	    
	  }
	  
	}