/**
 * create: 19/07/2018
 */
package filmRankingSystem.ranking.adminRanking;

import filmRankingSystem.ranking.dataRanking.RankingDTO;

/**
 * @author EEE
 * This interface administer the RankingDTO class.
 * Add, delete, update, find and consult RankingDTO objects storage in a 
 * structure
 */
public interface AdminRanking
{
    
    /**
     * @param ranking
     * This method adds RankingDTO objects to the structure 
     */
    public boolean add( RankingDTO ranking );
    
    /**
     * @param index
     * This method deletes RankingDTO objects from the structure 
     */
    public boolean delete(int index);
    
    
    /**
     * @param ranking
     * This method deletes RankingDTO objects from the structure 
     */
    public boolean delete( RankingDTO ranking );
    
    /**
     * @param 
     * This method 
     */
    public boolean updateView( int index, Boolean b );
    
    /**
     * @param 
     * This method 
     */
    public boolean updateView( RankingDTO ranking, Boolean b );
    
    /**
     * @param 
     * This method 
     */
    public boolean updateRank( int index, int rank );
    
    /**
     * @param 
     * This method 
     */
    public boolean updateRank( RankingDTO ranking, int rank );
    
    /**
     * @param 
     * This method 
     */
    public boolean updateSynopsis( int index, String synopsis );
    
    /**
     * @param 
     * This method 
     */
    public boolean updateSynopsis( RankingDTO ranking, String synopsis );
    
    /**
     * @param 
     * This method 
     */
    public boolean updateReview( int index, String review );
    
    /**
     * @param 
     * This method 
     */
    public boolean updateReview( RankingDTO ranking, String review );
    
    /**
     * @param user
     * This method  
     */
    public void findUser( String user );
    
    /**
     * @param film
     * This method  
     */
    public void findFilm( String film );
    
    /**
     * @param rank
     * This method  
     */
    public void findRank( int rank );
    
    /**
     * This method
     */
    public void consult();
    
    /**
     * This method
     */
    public RankingDTO setRanking( RankingDTO o );
    
}
