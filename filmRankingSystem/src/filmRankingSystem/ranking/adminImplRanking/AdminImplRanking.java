/**
 * create: 22/07/2018
 */
package filmRankingSystem.ranking.adminImplRanking;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

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
        if( myStructure.size() != 0)
        {
            if( index >= 0 && index < myStructure.size() )
            {
                if( myStructure.remove( index ) != null )
                    System.out.println( ">> Se elimni� el ranking" );
                else
                {
                    System.out.println( ">> No se elimin�" );
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
        if( myStructure.size() != 0)
        {
            if( index >= 0 && index < myStructure.size()  ) 
            {
                myStructure.get( index ).setView( b );
                System.out.println( ">> Se actualiz�" );
            }
            else 
            {
                System.out.println( ">> No se actualiz�" );
                return false;
            }
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
            System.out.println( ">> No se actualiz� o no existe" );
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
        if ( myStructure.size() != 0 )
        {
            if( index >= 0 && index < myStructure.size()  ) 
            {
                myStructure.get( index ).setRank( rank );
                System.out.println( ">> Se actualiz� el ranking" );
            }
            else 
            {
                System.out.println( ">> No se actualiz� el ranking" );
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
            System.out.println( ">> No se actualiz� el ranking o no existe" );
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
        if( myStructure.size() != 0)
        {
            if( index >= 0 && index < myStructure.size()  ) 
            {
                myStructure.get( index ).setSynopsis( synopsis );
                System.out.println( ">> Se actualiz� la sinopsis" );
            }
            else 
            {
                System.out.println( ">> No se actualiz� la sinopsis" );
                return false;
            }
        }
        else
        {
            System.out.println( ">> La lista est� vac�a" );
            return true;
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
        if( myStructure.size() != 0 ) 
        {
            if( index >= 0 && index < myStructure.size()  ) 
            {
                myStructure.get( index ).setReview( review );
                System.out.println( ">> Se actualiz� la rese�a" );
            }
            else 
            {
                System.out.println( ">> No se actualiz� la rese�a" );
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
            System.out.println( ">> No se actualiz� la rese�a o no existe" );
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
        {
            if( r.getRank() == rank )
            {
                System.out.println( "�ndice: " + myStructure.indexOf( r ) );
                System.out.println( r.toString() );
                System.out.println( "--------------------------------------------" );    
            }
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
        {
            if(r != null) 
            {
                System.out.println( "�ndice: " + myStructure.indexOf( r ) );
                System.out.println( r.toString() );
                System.out.println( "--------------------------------------------" );
            }
        }
        System.out.println( "============================================\n" );
    }
    
    @Override
    public RankingDTO setRanking( RankingDTO o )
    {
        int scanInt;
        
        int year;
        int month;
        int day;
        int monthType;
        boolean isleapYear;
        
        boolean isView;
        Calendar viewDate = Calendar.getInstance();
        int rank;
        String synopsis;
        String review;
      
        Scanner sc = new Scanner(System.in);
        
        ////////////////////// Scan Data
        /////// Scan view
        do
        {
            System.out.println( "�Has visto la pelicula?\n"
                    + "Escribe '1' para s� o '0' para no" );
            
            try
            {
                scanInt = sc.nextInt();
            }
            catch ( InputMismatchException e )
            {
                scanInt = 0;
                System.out.println( "Excepcion: Error de entrada.\n"
                        + "Se corrigi� marcando como pel�cula no vista" );
                e.printStackTrace();
            }
            
        }while ( scanInt < 0 || scanInt > 1 );
        sc.nextLine();
        if( scanInt == 0 ) 
        {
            isView = false;
        }
        else
        {
            isView = true;
        }
        /////// Scan date
        System.out.println( "Introduce la fecha en que viste la pelicula" );
        /// year
        do
        {
            System.out.println( "A�o: " );
            
            try
            {
                year = sc.nextInt();
            }
            catch ( InputMismatchException e )
            {
                year = 0;
                System.out.println( "Excepcion: Error de entrada.\n"
                        + "Se ajust� el a�o en 0" );
                e.printStackTrace();
            }

        }while(year < 0 || year > 9999);
        sc.nextLine();
        
        isleapYear = false;
        if( year % 4 == 0 ) 
        {
            if( year % 400 == 0 || year % 100 != 0 )
            {
                isleapYear = true;
            }
        }
        
        /// month
        do
        {
            System.out.println( "Mes: " );
            
            try
            {
                month = sc.nextInt();
            }
            catch ( InputMismatchException e )
            {
                month = 1;
                System.out.println( "Excepcion: Error de entrada.\n"
                        + "Se ajust� el mes en enero" );
                e.printStackTrace();
            }
            
        }while(month < 1 || month > 12 );
        sc.nextLine();
        
        month--;
        monthType = 0;
        if( month == 0 || month == 2 || month == 4 || month == 6 || 
                month == 7 || month == 9 || month == 11 )
        {
            monthType = 1;
        }
        else if( month == 3 || month == 5 || month == 8 || month == 10 )
        {
            monthType = 2;
        }
        else if( isleapYear ) 
        {
            monthType = 3;
        }
        /// day
        switch( monthType )
        {
            case 1:
                do
                {
                    System.out.println( "D�a: " );
                    
                    try
                    {
                        day = sc.nextInt();
                    }
                    catch ( InputMismatchException e )
                    {
                        day = 1;
                        System.out.println( "Excepcion: Error de entrada.\n"
                                + "Se ajust� el d�a en 1" );
                        e.printStackTrace();
                    }
                    
                }while(day < 1 || day > 31 );
                break;
            case 2:
                do
                {
                    System.out.println( "D�a: " );
                    
                    try
                    {
                        day = sc.nextInt();
                    }
                    catch ( InputMismatchException e )
                    {
                        day = 1;
                        System.out.println( "Excepcion: Error de entrada.\n"
                                + "Se ajust� el d�a en 1" );
                        e.printStackTrace();
                    }
                    
                }while(day < 1 || day > 30 );
                break;
            case 3:
                do
                {
                    System.out.println( "D�a:" );
                    
                    try
                    {
                        day = sc.nextInt();
                    }
                    catch ( InputMismatchException e )
                    {
                        day = 1;
                        System.out.println( "Excepcion: Error de entrada.\n"
                                + "Se ajust� el d�a en 1" );
                        e.printStackTrace();
                    }
                    
                }while(day < 1 || day > 29 );
                break;
            default:
                do
                {
                    System.out.println( "D�a:" );
                    
                    try
                    {
                        day = sc.nextInt();
                    }
                    catch ( InputMismatchException e )
                    {
                        day = 1;
                        System.out.println( "Excepcion: Error de entrada.\n"
                                + "Se ajust� el d�a en 1" );
                        e.printStackTrace();
                    }
                    
                }while(day < 1 || day > 28 );
        }
        sc.nextLine();
        
        viewDate.set(Calendar.YEAR, year);
        viewDate.set(Calendar.MONTH, month);
        viewDate.set(Calendar.DATE, day);
        ////////// rank
        
        rank = 0;
        do 
        {
            System.out.println( "Da tu califiaci�n del 1 al 5" );     
            
            try 
            {
                rank = sc.nextInt();
                
            }
            catch ( InputMismatchException e )
            {
                rank = 1;
                System.out.println( "Excepcion: Error de entrada.\n"
                        + "Se corrigi� con calificaci�n 1" );
                e.printStackTrace();
            }
        }while( rank < 0 || rank > 6 );
        sc.nextLine();   
        
        System.out.println( "Escribe tu sinopsis" );
        synopsis = sc.nextLine();
        
        System.out.println( "Escribe tu rese�a" );
        review = sc.nextLine();
        
        sc.close();
        
        o.setRank( rank );
        o.setReview( review );
        o.setSynopsis( synopsis );
        o.setView( isView );
        o.setWatchedDate( viewDate );

        return o;
    }
    
}
