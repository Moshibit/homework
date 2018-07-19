package filmRankingSystem.film.testFilm;

import java.math.BigDecimal;
import java.util.Calendar;

import filmRankingSystem.film.dataFilm.ChildFilmDTO;
import filmRankingSystem.film.dataFilm.DocumentaryFilmDTO;
import filmRankingSystem.film.dataFilm.FilmDTO;

public class TestFilm
{

    public static void main( String[] args )
    {
    	// an arrangement of objects is created
    	FilmDTO[] testArray = new FilmDTO[10];
    	
    	// BigDecimal and Calendar objects for tests
        BigDecimal bd = new BigDecimal( "500.50" );
        Calendar c = Calendar.getInstance();
        c.set( Calendar.YEAR, 2007 );
        
        // objects that store films data are created
        FilmDTO movie1 = new FilmDTO( "Pulp Fiction", "Tiempos violentos", 'B',
                "Thriller", 154, "Estados Unidos", 1994, "Inglés", 
                "Quentin Tarantino", bd);
        ChildFilmDTO movie2 = new ChildFilmDTO("The Incredibles", 
            "Los increíbles", 'A',"Superheroes", 115, "Estados Unidos", 
            2004, "Inglés", "Walt Disney", bd, "3d", 7);
        DocumentaryFilmDTO movie3 = new DocumentaryFilmDTO(
                "Bowling for Columbine", "Masacre en Columbine", 'B', 
                "Documental", 120, "Estados Unidos", 2002, "Inglés", 
                "Michael Moore", bd, "problemas de las armas en EEUU"); 
        FilmDTO movie4 = new FilmDTO();
        ChildFilmDTO movie5 = new ChildFilmDTO();
        DocumentaryFilmDTO movie6 = new DocumentaryFilmDTO();
        FilmDTO movie7 = new FilmDTO();
        ChildFilmDTO movie8 = new ChildFilmDTO();
        DocumentaryFilmDTO movie9 = new DocumentaryFilmDTO();
        ChildFilmDTO movie10 = new ChildFilmDTO();
        
        testArray[0] = movie1;
        testArray[1] = movie2;
        testArray[2] = movie3;
        testArray[3] = movie4;
        testArray[4] = movie5;
        testArray[5] = movie6;
        testArray[6] = movie7;
        testArray[7] = movie8;
        testArray[8] = movie9;
        testArray[9] = movie10;
        
        for(int i = 0; i < testArray.length; i++)
        {
        	testArray[i].deploy();
        	// System.out.println( testArray[i].toString() );
        }

    }
}
