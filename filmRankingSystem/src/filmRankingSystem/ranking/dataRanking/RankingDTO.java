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
    public RankingDTO(){}   
        
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
    public FilmDTO getFilm()
    {
        return _film;
    }

    public void setFilm( FilmDTO film )
    {
        _film = film;
    }

    public UserDTO getUser()
    {
        return _user;
    }

    public void setUser( UserDTO user )
    {
        _user = user;
    }
    
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
        String s1 = " ";
        String s2 = " ";
        
        if( _user != null )
            s1 = _user.getUserName();
        if( _film != null )
            s2 = _film.getName();
        
        Date tempDate;
        String s3 = " ";
        
        if( _watchedDate != null ) 
        {
            tempDate = _watchedDate.getTime();
            s3 = myDateFormat.format( tempDate );
        }
        
        System.out.println( "*******************" );
        System.out.println( "Rankin" );
        System.out.println( "*******************" );
        System.out.println( "Usuario: " + s1 );
        System.out.println( "Película: " + s2 );
        System.out.println( "vista: : " + _view );
        System.out.println( "Fecha en que se vio : " + s3 );
        System.out.println( "Calificación: " + _rank + "/5" );
        System.out.println( "Sinopsis: " + _synopsis );
        System.out.println( "Reseña: " + _review );
        System.out.println( "*******************" );
    }
    
        // override
    @Override
    public String toString()
    {
        String s1 = " ";
        String s2 = " ";
        
        if( _user != null )
            s1 = _user.getUserName();
        if( _film != null )
            s2 = _film.getName();
        
        Date tempDate;
        String s3 = " ";
  
        if( _watchedDate != null ) 
        {
            tempDate = _watchedDate.getTime();
            s3 = myDateFormat.format( tempDate );
        }
        String str = "*******************"
                + "\nRanking"
                + "\n*******************"
                + "\nUsuario: " + s1
                + "\nPelícula: " + s2
                + "\nvista: : " + _view 
                + "\nFecha en que se vio : " + s3
                + "\nCalificación: " + _rank + "/5"
                + "\nSinopsis: " + _synopsis
                + "\nReseña: " + _review 
                + "\n******************";
        return str;      
    }
}
