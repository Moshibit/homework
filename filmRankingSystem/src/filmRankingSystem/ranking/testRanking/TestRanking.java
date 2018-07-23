/**
 * create: 19/07/2018
 */
package filmRankingSystem.ranking.testRanking;

import java.util.Calendar;

import filmRankingSystem.film.dataFilm.FilmDTO;
import filmRankingSystem.ranking.dataRanking.RankingDTO;
import filmRankingSystem.user.dataUser.UserDTO;

/**
 * @author EEE
 */
public class TestRanking
{

    /**
     * 
     */
    public TestRanking()
    {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        UserDTO user1 = new UserDTO( "Pedro444" );
        
        FilmDTO film1 = new FilmDTO( "ESDLA" );
        
        Calendar c = Calendar.getInstance();
        
        RankingDTO rank1 = new RankingDTO( film1, user1, true, c,5, "asdf", 
                "fdaa");
        
        rank1.deploy();
        
        System.out.println( rank1.toString() );
    
    }

}
