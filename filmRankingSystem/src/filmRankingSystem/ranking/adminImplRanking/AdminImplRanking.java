/**
 * create: 22/07/2018
 */
package filmRankingSystem.ranking.adminImplRanking;

import java.util.LinkedList;
import java.util.List;

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
    List< RankingDTO > myStructure = new LinkedList< RankingDTO >();
    
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
        if( myStructure.add( ranking ) )
            System.out.println( ">> Se añadió tu ranking" );
        else
        {
            System.out.println( ">> No se pudo añadir tu ranking" );
            return false;
        }
        return true;
    }

    /* (non-Javadoc)
     * @see filmRankingSystem.ranking.adminRanking.adminRanking#delete(int)
     */
    @Override
    public boolean delete( int index )
    {
        if( myStructure.remove( index ) != null && index > myStructure.size() &&
                    index < myStructure.size() )
            System.out.println( ">> Se elimnió el ranking" );
        else
        {
            System.out.println( ">> No se eliminó" );
            return false;
        }
        return true;
    }

    /* (non-Javadoc)
     * @see filmRankingSystem.ranking.adminRanking.adminRanking#delete
     * (filmRankingSystem.ranking.dataRanking.RankingDTO)
     */
    @Override
    public boolean delete( RankingDTO ranking )
    {
        if( myStructure.remove( ranking ) )
            System.out.println( ">> Se elimnió el ranking" );
        else
        {
            System.out.println( ">> No se eliminó" );
            return false;
        }
        return true;
    }

    /* (non-Javadoc)
     * @see filmRankingSystem.ranking.adminRanking.adminRanking#updateView
     * (int, java.lang.Boolean)
     */
    @Override
    public boolean updateView( int index, Boolean b )
    {
        if( index > myStructure.size() && index < myStructure.size()  ) 
        {
            myStructure.get( index ).setView( b );
            System.out.println( ">> Se actualizó" );
        }
        else 
        {
            System.out.println( ">> No se actualizó" );
            return false;
        }
        return true;   
    }

    /* (non-Javadoc)
     * @see filmRankingSystem.ranking.adminRanking.adminRanking#updateView
     * (filmRankingSystem.ranking.dataRanking.RankingDTO, java.lang.Boolean)
     */
    @Override
    public boolean updateView( RankingDTO ranking, Boolean b )
    {
        if( myStructure.contains( ranking ) ) 
        {
            myStructure.get( myStructure.indexOf( ranking ) ).setView( b );
            System.out.println( ">> Se actualizó" );
        }
        else 
        {
            System.out.println( ">> No se actualizó" );
            return false;
        }
        return true;   
    }

    /* (non-Javadoc)
     * @see filmRankingSystem.ranking.adminRanking.adminRanking#updateRank
     * (int, int)
     */
    @Override
    public boolean updateRank( int index, int rank )
    {
        if( index > myStructure.size() && index < myStructure.size()  ) 
        {
            myStructure.get( index ).setRank( rank );
            System.out.println( ">> Se actualizó el ranking" );
        }
        else 
        {
            System.out.println( ">> No se actualizó el ranking" );
            return false;
        }
        return true;  
    }

    /* (non-Javadoc)
     * @see filmRankingSystem.ranking.adminRanking.adminRanking#updateRank
     * (filmRankingSystem.ranking.dataRanking.RankingDTO, int)
     */
    @Override
    public boolean updateRank( RankingDTO ranking, int rank )
    {
        if( myStructure.contains( ranking ) ) 
        {
            myStructure.get( myStructure.indexOf( ranking ) ).setRank( rank );
            System.out.println( ">> Se actualizó el ranking" );
        }
        else 
        {
            System.out.println( ">> No se actualizó el ranking" );
            return false;
        }
        return true;  
    }

    /* (non-Javadoc)
     * @see filmRankingSystem.ranking.adminRanking.adminRanking#updateSynopsis
     * (int, java.lang.String)
     */
    @Override
    public boolean updateSynopsis( int index, String synopsis )
    {
        if( index > myStructure.size() && index < myStructure.size()  ) 
        {
            myStructure.get( index ).setSynopsis( synopsis );
            System.out.println( ">> Se actualizó la sinopsis" );
        }
        else 
        {
            System.out.println( ">> No se actualizó la sinopsis" );
            return false;
        }
        return true;  
    }

    /* (non-Javadoc)
     * @see filmRankingSystem.ranking.adminRanking.adminRanking#updateSynopsis
     * (filmRankingSystem.ranking.dataRanking.RankingDTO, java.lang.String)
     */
    @Override
    public boolean updateSynopsis( RankingDTO ranking, String synopsis )
    {
        if( myStructure.contains( ranking ) ) 
        {
            myStructure.get( myStructure.indexOf( ranking ) ).setSynopsis
                    ( synopsis );
            System.out.println( ">> Se actualizó la sinopsis" );
        }
        else 
        {
            System.out.println( ">> No se actualizó la sinopsis" );
            return false;
        }
        return true;  
    }

    /* (non-Javadoc)
     * @see filmRankingSystem.ranking.adminRanking.adminRanking#updateReview
     * (int, java.lang.String)
     */
    @Override
    public boolean updateReview( int index, String review )
    {
        if( index > myStructure.size() && index < myStructure.size()  ) 
        {
            myStructure.get( index ).setReview( review );
            System.out.println( ">> Se actualizó la reseña" );
        }
        else 
        {
            System.out.println( ">> No se actualizó la reseña" );
            return false;
        }
        return true;  
    }

    /* (non-Javadoc)
     * @see filmRankingSystem.ranking.adminRanking.adminRanking#updateReview
     * (filmRankingSystem.ranking.dataRanking.RankingDTO, java.lang.String)
     */
    @Override
    public boolean updateReview( RankingDTO ranking, String review )
    {
        if( myStructure.contains( ranking ) ) 
        {
            myStructure.get( myStructure.indexOf( ranking ) ).setReview
                    ( review );
            System.out.println( ">> Se actualizó la reseña" );
        }
        else 
        {
            System.out.println( ">> No se actualizó la reseña" );
            return false;
        }
        return true;  
    }

    @Override
    public void findUser( String user )
    {
        System.out.println( "============================================" );
        System.out.println( ">> Resultados de Busqueda: " + user );
        System.out.println( "============================================" );
        for( RankingDTO r : myStructure )
            if( r.getUser().getUserName() != null && 
                    r.getUser().getUserName().equals( user ) )
            {
                System.out.println( "indice: " + myStructure.indexOf( r ) );
                System.out.println( r.toString() );
                System.out.println( "--------------------------------------------" );    
            }
            else
                System.out.println( ">> No se encontró resultados en la busqueda" );
        System.out.println( "============================================" );
    }

    @Override
    public void findFilm( String film )
    {
        System.out.println( "============================================" );
        System.out.println( ">> Resultados de Busqueda: " + film );
        System.out.println( "============================================" );
        for( RankingDTO r : myStructure )
            if( r.getFilm().getName() != null && 
                    r.getFilm().getName().equals( film ) )
            {
                System.out.println( "indice: " + myStructure.indexOf( r ) );
                System.out.println( r.toString() );
                System.out.println( "--------------------------------------------" );    
            }
            else
                System.out.println( ">> No se encontró resultados en la busqueda" );
        System.out.println( "============================================" );
    }

    @Override
    public void find( int rank )
    {
        System.out.println( "============================================" );
        System.out.println( ">> Resultados de Busqueda: " + rank );
        System.out.println( "============================================" );
        for( RankingDTO r : myStructure )
            if( r.getRank() == rank )
            {
                System.out.println( "indice: " + myStructure.indexOf( r ) );
                System.out.println( r.toString() );
                System.out.println( "--------------------------------------------" );    
            }
            else
                System.out.println( ">> No se encontró resultados en la busqueda" );
        System.out.println( "============================================" );
    }

    /* (non-Javadoc)
     * @see filmRankingSystem.ranking.adminRanking.adminRanking#consult()
     */
    @Override
    public void consult()
    {
        System.out.println( "============================================" );
        System.out.println( "Consulta de servicios" );
        System.out.println( "============================================" );
        for( RankingDTO r : myStructure )
            if(r != null)
                System.out.println( r.toString() );
        System.out.println( "============================================" );
    }
    
}
