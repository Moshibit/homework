/**
 * create: 19/07/2018
 */
package filmRankingSystem.ranking.dataRanking;

import java.text.SimpleDateFormat;
import java.util.Calendar;

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
    private int         _rank;
    private String      _synopsis;
    private String      _review;
    private Calendar    _watchedDate;
        // class attributes
    SimpleDateFormat formatoFecha = new SimpleDateFormat
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
     * @param view
     * @param rank
     * @param synopsis
     * @param review
     * @param watchedDate
     */
    public RankingDTO( boolean view, int rank, String synopsis, String review,
            Calendar watchedDate )
    {
        super();
        Calendar today = Calendar.getInstance();
        
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
        System.out.println( "*******************" );
        System.out.println( "Rankin" );
        System.out.println( "*******************" );
        System.out.println( "Usuario: " + _user.getName() + 
                _user.getSurname1() + _user.getSurname2() );
        System.out.println( "Película: " + _film.getName() );
        
        System.out.println( "*******************" );

    }
    
        // override
    @Override
    public String toString()
    {
        String str = "";
        return str;
    }
}
