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
            System.out.println( ">> Se a�adi� tu ranking" );
        else
        {
            System.out.println( ">> No se pudo a�adir tu ranking" );
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
        if( index > myStructure.size() && index < myStructure.size() )
            if( myStructure.remove( index ) != null )
                System.out.println( ">> Se elimni� el ranking" );
            else
            {
                System.out.println( ">> No se elimin�" );
                return false;
            }
        else 
        {
            System.out.println( ">> �ndice incorrecto" );
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
            System.out.println( ">> Se elimni� el ranking" );
        else
        {
            System.out.println( ">> No se elimin� o no existe" );
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
            System.out.println( ">> Se actualiz�" );
        }
        else 
        {
            System.out.println( ">> No se actualiz�" );
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
            System.out.println( ">> Se actualiz�" );
        }
        else 
        {
            System.out.println( ">> No se actualiz�" );
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
            System.out.println( ">> Se actualiz� el ranking" );
        }
        else 
        {
            System.out.println( ">> No se actualiz� el ranking" );
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
            System.out.println( ">> Se actualiz� el ranking" );
        }
        else 
        {
            System.out.println( ">> No se actualiz� el ranking" );
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
            System.out.println( ">> Se actualiz� la sinopsis" );
        }
        else 
        {
            System.out.println( ">> No se actualiz� la sinopsis" );
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
            System.out.println( ">> Se actualiz� la sinopsis" );
        }
        else 
        {
            System.out.println( ">> No se actualiz� la sinopsis" );
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
            System.out.println( ">> Se actualiz� la rese�a" );
        }
        else 
        {
            System.out.println( ">> No se actualiz� la rese�a" );
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
            System.out.println( ">> Se actualiz� la rese�a" );
        }
        else 
        {
            System.out.println( ">> No se actualiz� la rese�a" );
            return false;
        }
        return true;  
    }

    @Override
    public void findUser( String user )
    {
        System.out.println( "============================================" );
        System.out.println( ">> Resultados de busqueda de usuario: " + user );
        System.out.println( "============================================" );
        for( RankingDTO r : myStructure)
        {
            if ( r.getUser() != null ) 
            {
                if( r.getUser().getUserName() != null && 
                        r.getUser().getUserName().equals( user ) )
                {
                    System.out.println( "�ndice: " + myStructure.indexOf( r ) );
                    System.out.println( r.toString() );
                    System.out.println( "--------------------------------------------" );    
                }
            }
        }
        System.out.println( "============================================\n" );
    }

    @Override
    public void findFilm( String film )
    {
        System.out.println( "============================================" );
        System.out.println( ">> Resultados de busqueda de pelicula: " + film );
        System.out.println( "============================================" );
        for( RankingDTO r : myStructure )
        {
            if( r.getFilm() != null ) 
            {
                if( r.getFilm().getName() != null &&
                        r.getFilm().getName().equals( film ) )
                {
                    System.out.println( "�ndice: " + myStructure.indexOf( r ) );
                    System.out.println( r.toString() );
                    System.out.println( "--------------------------------------------" );    
                }
            }
        }
        System.out.println( "============================================\n" );
    }

    @Override
    public void findRank( int rank )
    {
        System.out.println( "============================================" );
        System.out.println( ">> Resultado de busqueda de calificaci�n: " + rank );
        System.out.println( "============================================" );
        for( RankingDTO r : myStructure )
            if( r.getRank() == rank )
            {
                System.out.println( "�ndice: " + myStructure.indexOf( r ) );
                System.out.println( r.toString() );
                System.out.println( "--------------------------------------------" );    
            }
        System.out.println( "============================================\n" );
    }

    /* (non-Javadoc)
     * @see filmRankingSystem.ranking.adminRanking.adminRanking#consult()
     */
    @Override
    public void consult()
    {
        System.out.println( "============================================" );
        System.out.println( "Consulta todo" );
        System.out.println( "============================================" );
        for( RankingDTO r : myStructure )
            if(r != null) 
            {
                System.out.println( "�ndice: " + myStructure.indexOf( r ) );
                System.out.println( r.toString() );
                System.out.println( "--------------------------------------------" );
            }
        System.out.println( "============================================\n" );
    }
    
}
