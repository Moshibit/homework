/**
 * create: 19/07/2018
 */
package filmRankingSystem.ranking.testRanking;

import java.util.Calendar;

import filmRankingSystem.film.dataFilm.FilmDTO;
import filmRankingSystem.ranking.adminImplRanking.AdminImplRanking;
import filmRankingSystem.ranking.dataRanking.RankingDTO;
import filmRankingSystem.user.dataUser.UserDTO;

/**
 * @author EEE
 */
public class TestAdminImplRanking2
{

    /**
     * 
     */
    public TestAdminImplRanking2(){}

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        UserDTO user00 = new UserDTO( "Miguel" );
        UserDTO user01 = new UserDTO( "María" );
        
        FilmDTO film00 = new FilmDTO( "Avengers" );
        FilmDTO film01 = new FilmDTO( "Spider-Man" );
        FilmDTO film02 = new FilmDTO( "Harry Potter" );
        
        Calendar viewDate = Calendar.getInstance();
        
        
        RankingDTO ranking00 = new RankingDTO( film00, user00, true, 
                viewDate, 3, "bla bla", "pero pero" );
        RankingDTO ranking01 = new RankingDTO( film00, user00, true, 
                viewDate, 4, "bla bla", "pero pero" ); 
        RankingDTO ranking02 = new RankingDTO( film01, user00, true, 
                viewDate, 5, "bla bla", "pero pero" );
        RankingDTO ranking03 = new RankingDTO( film01, user01, true, 
                viewDate, 5, "bla bla", "pero pero" );
        RankingDTO ranking04 = new RankingDTO( film02, user00, true, 
                viewDate, 4, "bla bla", "pero pero" );
        RankingDTO ranking05 = new RankingDTO( film02, user01, true, 
                viewDate, 3, "bla bla", "pero pero" );
        RankingDTO ranking06 = new RankingDTO(); // test filled whit null and 0
        
        AdminImplRanking rankingSystem = new AdminImplRanking();  
        
        /////////// SET Ranking
        ranking00 = rankingSystem.setRanking( ranking00 );
        
        /////////// Add
        rankingSystem.add( ranking06 ); // test filled whit null and 0
        rankingSystem.add( ranking00 );
        rankingSystem.add( ranking01 );
        rankingSystem.add( ranking02 );
        rankingSystem.add( ranking03 );
        rankingSystem.add( ranking04 );
        rankingSystem.add( ranking05 );
        
        /////////// Remove
        // rankingSystem.delete( ranking06 ); // test 
        rankingSystem.delete( 0 );
        
        /////////// Update
        rankingSystem.updateRank( 0, 1 );
        rankingSystem.updateSynopsis( 0, "asdf" );
        rankingSystem.updateReview( 0, "qwer" );
        
        rankingSystem.updateRank( ranking01, 2 );
        rankingSystem.updateSynopsis( ranking01, "lkjh" );
        rankingSystem.updateReview( ranking01, "poiu" );
        
        /////////// Find
        rankingSystem.findRank( 15 ); // test
        rankingSystem.findFilm( "Fast" ); // test 
        rankingSystem.findUser( "Fast" ); // test
        rankingSystem.findRank( 5 );
        
        /////////// Consult
        rankingSystem.consult();
    }

}
