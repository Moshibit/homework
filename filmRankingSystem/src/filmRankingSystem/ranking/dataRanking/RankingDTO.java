/**
 * create: 19/07/2018
 */
package filmRankingSystem.ranking.dataRanking;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import filmRankingSystem.film.dataFilm.FilmDTO;
import filmRankingSystem.user.dataUser.UserDTO;

/**
 * @author EEE
 */
public class RankingDTO
{
    // attributes
        // instance attributes
    private FilmDTO     _film;
    private UserDTO     _user;
    private boolean     _view;
    private Calendar    _watchedDate;
    private int         _rank;
    private String      _synopsis;
    private String      _review;
    
        // class attributes
    SimpleDateFormat myDateFormat = new SimpleDateFormat
            ( "dd 'de' MMMM 'del' yyyy." );
    
    // methods
        // constructors
    /**
     * 
     */
    public RankingDTO()
    {
        // TODO Auto-generated constructor stub
    }   
        
        /**
     * @param film
     * @param user
     * @param view
     * @param watchedDate
     * @param rank
     * @param synopsis
     * @param review
     * @param myDateFormat
     */
    public RankingDTO( FilmDTO film, UserDTO user, boolean view,
            Calendar watchedDate, int rank, String synopsis, String review )
    {
        super();
        Calendar today = Calendar.getInstance();
        
        _film = film;
        _user = user;
        _view = view;
        // rank validation 
        if( rank > 0 && rank < 6  )
            _rank = rank;
        else
            _rank = 1;
        
        _synopsis = synopsis;
        _review = review;
        // warchedFate validation
        if( watchedDate.after( today ) ) 
            _watchedDate = watchedDate;
        else
            _watchedDate = today; 
    }



        // accessors
    public boolean isView()
    {
        return _view;
    }

    public void setView( boolean view )
    {
        _view = view;
    }

    public int getRank()
    {
        return _rank;
    }

    public void setRank( int rank )
    {
        if( rank > 0 && rank < 6  )
            _rank = rank;
        else
            _rank = 1;
    }

    public String getSynopsis()
    {
        return _synopsis;
    }

    public void setSynopsis( String synopsis )
    {
        _synopsis = synopsis;
    }

    public String getReview()
    {
        return _review;
    }

    public void setReview( String review )
    {
        _review = review;
    }

    public Calendar getWatchedDate()
    {
        return _watchedDate;
    }

    public void setWatchedDate( Calendar watchedDate )
    {
        Calendar today = Calendar.getInstance();
        if( watchedDate.after( today ) ) 
            _watchedDate = watchedDate;
        else
            _watchedDate = today; 
    }

        // Implemented
    public void deploy()
    {
        Date tempDate;
        String s = " ";
        
        if( _watchedDate != null ) 
        {
            tempDate = _watchedDate.getTime();
            s = myDateFormat.format( tempDate );
        }
        
        System.out.println( "\n*******************" );
        System.out.println( "Rankin" );
        System.out.println( "*******************" );
        System.out.println( "Usuario: " + _user.getName() + " " + 
                _user.getSurname1() + " " + _user.getSurname2() );
        System.out.println( "Película: " + _film.getName() );
        System.out.println( "vista: : " + _view );
        System.out.println( "Fecha en que se vio : " + s );
        System.out.println( "Calificación: " + _rank + "/5" );
        System.out.println( "Sinopsis: " + _synopsis );
        System.out.println( "Reseña: " + _review );
        System.out.println( "*******************" );
    }
    
        // override
    @Override
    public String toString()
    {
        Date tempDate;
        String s = " ";
        
        if( _watchedDate != null ) 
        {
            tempDate = _watchedDate.getTime();
            s = myDateFormat.format( tempDate );
        }
        String str = "\n*******************"
                + "\nRanking"
                + "\n*******************"
                + "\nUsuario: " + _user.getName().toString() 
                        + " " + _user.getSurname1() 
                        + " " + _user.getSurname2().toString()
                + "\nPelícula: " + _film.getName()
                + "\nvista: : " + _view 
                + "\nFecha en que se vio : " + s
                + "\nCalificación: " + _rank + "/5"
                + "\nSinopsis: " + _synopsis
                + "\nReseña: " + _review 
                + "\n******************";
        return str;
    }
}
