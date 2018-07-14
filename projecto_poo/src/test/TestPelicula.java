package test;

import java.math.BigDecimal;
import java.util.Calendar;

import datos.Pelicula;
import datos.PeliculaDocumental;
import datos.PeliculaInfantil;

public class TestPelicula
{

    public static void main( String[] args )
    {
    	//Se crea un arrreglo de objetos
    	Pelicula[] testArreglo = new Pelicula[10];
    	
    	// BigDecimal y Calendar para pruebas
        BigDecimal bd = new BigDecimal( "500.50" );
        Calendar c = Calendar.getInstance();
        c.set( Calendar.YEAR, 2007 );
        
        // Se crea un nuevo objeto que almacena los datos de una pelicula
        
        Pelicula peli1 = new Pelicula( "Pulp Fiction", "Tiempos violentos", 'B',
                "Thriller", 154, "Estados Unidos", 1994, "Inglés", 
                "Quentin Tarantino", bd, true, c, 5, "bla bla bla" );
        PeliculaInfantil peli2 = new PeliculaInfantil("The Incredibles", 
            "Los increíbles", 'A',"Superheroes", 115, "Estados Unidos", 
            2004, "Inglés", "Walt Disney", bd, true, c, 5, "bla bla", 
            "3d", 7);
        PeliculaDocumental peli3 = new PeliculaDocumental(
                "Bowling for Columbine", "Masacre en Columbine", 'B', 
                "Documental", 120, "Estados Unidos", 2002, "Inglés", 
                "Michael Moore", bd, false, c, 5, "bla bla bla", 
                "problemas de las armas en EEUU"); 
        Pelicula peli4 = new Pelicula();
        PeliculaInfantil peli5 = new PeliculaInfantil();
        PeliculaDocumental peli6 = new PeliculaDocumental();
        Pelicula peli7 = new Pelicula();
        PeliculaInfantil peli8 = new PeliculaInfantil();
        PeliculaDocumental peli9 = new PeliculaDocumental();
        PeliculaInfantil peli10 = new PeliculaInfantil();
        
        testArreglo[0] = peli1;
        
        testArreglo[1] = peli2;
        testArreglo[2] = peli3;
        testArreglo[3] = peli4;
        testArreglo[4] = peli5;
        testArreglo[5] = peli6;
        testArreglo[6] = peli7;
        testArreglo[7] = peli8;
        testArreglo[8] = peli9;
        testArreglo[9] = peli10;
        
        
        for(int i = 0; i < testArreglo.length; i++)
        {
        	testArreglo[i].despliega();
        	// System.out.println( testArreglo[i].toString() );
        }

    }
}
