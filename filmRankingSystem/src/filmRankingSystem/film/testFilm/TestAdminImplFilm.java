/**
 * create: 19/07/2018
 */
package filmRankingSystem.film.testFilm;
import filmRankingSystem.film.adminFilm.*;
import filmRankingSystem.film.adminImplFilm.AdminImplSetFilm;
import filmRankingSystem.film.dataFilm.FilmDTO;
import filmRankingSystem.ranking.dataRanking.RankingDTO;
/**
 * @author EEE
 */
public class TestAdminImplFilm
{

    /**
     * 
     */
    public TestAdminImplFilm()
    {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main( String[] args )
    
    {
    	FilmDTO film = new FilmDTO( "Avengers1" );
    	FilmDTO film1 = new FilmDTO( "Avengers2" );
    	FilmDTO film2 = new FilmDTO( "Avengers3" );
    	FilmDTO film3 = new FilmDTO( "Avengers4" );
    	
    	AdminImplSetFilm myadminfilm = new AdminImplSetFilm();
      
    	//ADD
    	myadminfilm.buscanombre(film);
    	myadminfilm.buscanombre(film1);
    	myadminfilm.buscanombre(film2);
    	myadminfilm.buscanombre(film3);
    	
    	//SEARCH
    	myadminfilm.addfilm(null);
    	
    	//delate Film
    	myadminfilm.eliminarfilm(1);
    }

}
