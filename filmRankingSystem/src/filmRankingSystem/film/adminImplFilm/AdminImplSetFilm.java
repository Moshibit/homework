/**
 * create: 19/07/2018
 */
package filmRankingSystem.film.adminImplFilm;

import java.util.LinkedList;
import java.util.List;

import filmRankingSystem.film.adminFilm.*;
import filmRankingSystem.film.dataFilm.FilmDTO;
import filmRankingSystem.ranking.dataRanking.RankingDTO;

/**
 * @author EEE
 */
public class AdminImplSetFilm implements AdminFilm
{
	// Structure
    List< RankingDTO > myStructure = new LinkedList< RankingDTO >();
    /**
     * 
     */
    @Override
	public void buscanombre(  FilmDTO Film ) 
	{
	    System.out.println( "============================================"  );
        System.out.println( ">> Resultados de busqueda por nombre: " + Film );
        System.out.println( "============================================"  );
        for( RankingDTO r : myStructure)
        {
            if ( r.getFilm() != null ) 
            {
                if( r.getFilm().getName() != null && 
                        r.getFilm().getName().equals( Film ) )
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
	public boolean addfilm( RankingDTO FilmDTO_String )
    {
        if( myStructure.add( FilmDTO_String ) )
            System.out.println( ">> Se a�adi� nuevo Film " );
        else
        {
            System.out.println( ">> No se pudo a�adir" );
            return false;
        }
        return true;
    }

	@Override
	public boolean eliminarfilm( int delate_Film)
    {
        if( myStructure.size() != 0)
        {
            if( delate_Film >= 0 && delate_Film < myStructure.size() )
            {
                if( myStructure.remove( delate_Film ) != null )
                    System.out.println( ">> Se elimni� el Film" );
                else
                {
                    System.out.println( ">> Error al eliminar Film" );
                    return false;
                }
            }
            else 
            {
                System.out.println( ">> �ndice incorrecto" );
                return false;
            }
        }
        else 
        {
            System.out.println( ">> La lista est� vac�a" );
            return false;
        }
        return true;
    }
}
