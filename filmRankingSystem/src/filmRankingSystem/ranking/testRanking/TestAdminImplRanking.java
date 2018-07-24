/**
 * create: 19/07/2018
 */
package filmRankingSystem.ranking.testRanking;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

import filmRankingSystem.film.dataFilm.FilmDTO;
import filmRankingSystem.ranking.adminImplRanking.AdminImplRanking;
import filmRankingSystem.ranking.dataRanking.RankingDTO;
import filmRankingSystem.user.dataUser.UserDTO;

/**
 * @author EEE
 */
public class TestAdminImplRanking
{

    /**
     * 
     */
    public TestAdminImplRanking(){}

    /**
     * @param args
     */
    public static void main( String[] args )
    {
        UserDTO user00 = new UserDTO( "Emmanuel" );
        UserDTO user01 = new UserDTO( "Luis" );
        UserDTO user02 = new UserDTO( "Erik" );
        
        FilmDTO film00 = new FilmDTO( "Avengers" );
        FilmDTO film01 = new FilmDTO( "Spider-Man" );
        FilmDTO film02 = new FilmDTO( "Harry Potter" );
        
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
            System.out.println( "¿Has visto la pelicula?\n"
                    + "Escribe '1' para sí o '0' para no" );
            
            try
            {
                scanInt = sc.nextInt();
            }
            catch ( InputMismatchException e )
            {
                scanInt = 0;
                System.out.println( "Excepcion: Error de entrada.\n"
                        + "Se corrigió marcando como película no vista" );
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
            System.out.println( "Año: " );
            
            try
            {
                year = sc.nextInt();
            }
            catch ( InputMismatchException e )
            {
                year = 0;
                System.out.println( "Excepcion: Error de entrada.\n"
                        + "Se ajustó el año en 0" );
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
                        + "Se ajustó el mes en enero" );
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
                    System.out.println( "Día: " );
                    
                    try
                    {
                        day = sc.nextInt();
                    }
                    catch ( InputMismatchException e )
                    {
                        day = 1;
                        System.out.println( "Excepcion: Error de entrada.\n"
                                + "Se ajustó el día en 1" );
                        e.printStackTrace();
                    }
                    
                }while(day < 1 || day > 31 );
                break;
            case 2:
                do
                {
                    System.out.println( "Día: " );
                    
                    try
                    {
                        day = sc.nextInt();
                    }
                    catch ( InputMismatchException e )
                    {
                        day = 1;
                        System.out.println( "Excepcion: Error de entrada.\n"
                                + "Se ajustó el día en 1" );
                        e.printStackTrace();
                    }
                    
                }while(day < 1 || day > 30 );
                break;
            case 3:
                do
                {
                    System.out.println( "Día:" );
                    
                    try
                    {
                        day = sc.nextInt();
                    }
                    catch ( InputMismatchException e )
                    {
                        day = 1;
                        System.out.println( "Excepcion: Error de entrada.\n"
                                + "Se ajustó el día en 1" );
                        e.printStackTrace();
                    }
                    
                }while(day < 1 || day > 29 );
                break;
            default:
                do
                {
                    System.out.println( "Día:" );
                    
                    try
                    {
                        day = sc.nextInt();
                    }
                    catch ( InputMismatchException e )
                    {
                        day = 1;
                        System.out.println( "Excepcion: Error de entrada.\n"
                                + "Se ajustó el día en 1" );
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
            System.out.println( "Da tu califiación del 1 al 5" );     
            
            try 
            {
                rank = sc.nextInt();
                
            }
            catch ( InputMismatchException e )
            {
                rank = 1;
                System.out.println( "Excepcion: Error de entrada.\n"
                        + "Se corrigió con calificación 1" );
                e.printStackTrace();
            }
        }while( rank < 0 || rank > 6 );
        sc.nextLine();   
        
        System.out.println( "Escribe tu sinopsis" );
        synopsis = sc.nextLine();
        
        System.out.println( "Escribe tu reseña" );
        review = sc.nextLine();
        
        sc.close();
        
        RankingDTO ranking00 = new RankingDTO( film00, user00, isView, 
                viewDate, rank, synopsis, review );
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
