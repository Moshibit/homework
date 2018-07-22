/**
 * create: 22/07/2018
 */
package filmRankingSystem.ranking.adminImplRanking;

import java.util.TreeMap;

import filmRankingSystem.film.dataFilm.FilmDTO;
import filmRankingSystem.ranking.adminRanking.AdminRanking;
import filmRankingSystem.ranking.dataRanking.RankingDTO;
import filmRankingSystem.user.dataUser.UserDTO;

/**
 * @author EEE
 */
public class AdminImplRanking implements AdminRanking
{
    // Structure
    List< String, RankingDTO > myStructure = 
            new List< String, RankingDTO >();
    
    /**
     * 
     */
    public AdminImplRanking(){}

    /* (non-Javadoc)
     * @see filmRankingSystem.ranking.adminRanking.adminRanking#add
     * (filmRankingSystem.ranking.dataRanking.RankingDTO)
     */
    @Override
    public boolean add( RankingDTO ranking )
    {
        myTreeMap.put( ranking.getFilm(), ranking );
        System.out.println( ">> Se añadió tu calificación al sistema" );
        return true;
    }

    /* (non-Javadoc)
     * @see filmRankingSystem.ranking.adminRanking.adminRanking#delete(int)
     */
    @Override
    public boolean delete( int index )
    {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see filmRankingSystem.ranking.adminRanking.adminRanking#delete
     * (filmRankingSystem.ranking.dataRanking.RankingDTO)
     */
    @Override
    public boolean delete( RankingDTO ranking )
    {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see filmRankingSystem.ranking.adminRanking.adminRanking#updateView
     * (int, java.lang.Boolean)
     */
    @Override
    public boolean updateView( int index, Boolean b )
    {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see filmRankingSystem.ranking.adminRanking.adminRanking#updateView
     * (filmRankingSystem.ranking.dataRanking.RankingDTO, java.lang.Boolean)
     */
    @Override
    public boolean updateView( RankingDTO ranking, Boolean b )
    {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see filmRankingSystem.ranking.adminRanking.adminRanking#updateRank
     * (int, int)
     */
    @Override
    public boolean updateRank( int index, int rank )
    {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see filmRankingSystem.ranking.adminRanking.adminRanking#updateRank
     * (filmRankingSystem.ranking.dataRanking.RankingDTO, int)
     */
    @Override
    public boolean updateRank( RankingDTO ranking, int rank )
    {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see filmRankingSystem.ranking.adminRanking.adminRanking#updateSynopsis
     * (int, java.lang.String)
     */
    @Override
    public boolean updateSynopsis( int index, String synopsis )
    {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see filmRankingSystem.ranking.adminRanking.adminRanking#updateSynopsis
     * (filmRankingSystem.ranking.dataRanking.RankingDTO, java.lang.String)
     */
    @Override
    public boolean updateSynopsis( RankingDTO ranking, String synopsis )
    {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see filmRankingSystem.ranking.adminRanking.adminRanking#updateReview
     * (int, java.lang.String)
     */
    @Override
    public boolean updateReview( int index, String synopsis )
    {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see filmRankingSystem.ranking.adminRanking.adminRanking#updateReview
     * (filmRankingSystem.ranking.dataRanking.RankingDTO, java.lang.String)
     */
    @Override
    public boolean updateReview( RankingDTO ranking, String synopsis )
    {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see filmRankingSystem.ranking.adminRanking.adminRanking#find
     * (filmRankingSystem.user.dataUser.UserDTO)
     */
    @Override
    public void find( UserDTO user )
    {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see filmRankingSystem.ranking.adminRanking.adminRanking#find
     * (filmRankingSystem.film.dataFilm.FilmDTO)
     */
    @Override
    public void find( FilmDTO film )
    {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see filmRankingSystem.ranking.adminRanking.adminRanking#find(int)
     */
    @Override
    public void find( int rank )
    {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see filmRankingSystem.ranking.adminRanking.adminRanking#consult()
     */
    @Override
    public void consult()
    {
        // TODO Auto-generated method stub

    }

}
