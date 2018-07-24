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
                    System.out.println( "índice: " + myStructure.indexOf( r ) );
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
            System.out.println( ">> Se añadió nuevo Film " );
        else
        {
            System.out.println( ">> No se pudo añadir" );
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
                    System.out.println( ">> Se elimnió el Film" );
                else
                {
                    System.out.println( ">> Error al eliminar Film" );
                    return false;
                }
            }
            else 
            {
                System.out.println( ">> índice incorrecto" );
                return false;
            }
        }
        else 
        {
            System.out.println( ">> La lista está vacía" );
            return false;
        }
        return true;
    }
}
