package test;

import java.math.BigDecimal;
import java.util.Calendar;

import datos.Pelicula;
import datos.PeliculaInfantil;

public class TestPelicula
{

    public static void main( String[] args )
    {
    	//Se crea un arrreglo de objetos
    	PeliculaInfantil[] testArreglo = new PeliculaInfantil[10];
    	
    	//
        BigDecimal bd = new BigDecimal( "500.50" );
        Calendar c = Calendar.getInstance();
        c.set( Calendar.YEAR, 2007 );
        
        // Se crea un nuevo objeto que almacena los datos de una pelicula
        
        PeliculaInfantil peli1 = new PeliculaInfantil("The Incredibles", 
            "Los increíbles", 'A',"Superheroes", 115, "Estados Unidos", 
            2004, "Inglés", "Walt Disney", bd, true, c, 5, "bla bla", 
            "3d", 7);
        
        PeliculaInfantil peli2 = new PeliculaInfantil();
        PeliculaInfantil peli3 = new PeliculaInfantil(); 
        PeliculaInfantil peli4 = new PeliculaInfantil();
        PeliculaInfantil peli5 = new PeliculaInfantil();
        PeliculaInfantil peli6 = new PeliculaInfantil();
        PeliculaInfantil peli7 = new PeliculaInfantil();
        PeliculaInfantil peli8 = new PeliculaInfantil();
        PeliculaInfantil peli9 = new PeliculaInfantil();
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
        }

    }
}
