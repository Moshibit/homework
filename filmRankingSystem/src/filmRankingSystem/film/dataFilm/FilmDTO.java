/**
 * create: 04/07/2018
 */
package filmRankingSystem.film.dataFilm;

import java.math.BigDecimal;

/**
 * @author EEE
 * This class stores film data.
 */
public class FilmDTO
{
    // attributes
        // instance attributes
            // general
    private String      _name;
    private String      _translatedName;
    private RatingEnum  _rating;// A, B, C, D simplified Mexico's rating system
    private GenreEnum _genre;// list maximum 3
    private int         _duration;// minutes
    private String      _country; 
    private int         _year;
    private String      _language; 
    private String      _dirtector; 
    private BigDecimal  _cost;
        // class attributes
    BigDecimal zeroBD = new BigDecimal("0.00");
    
    // methods
        // constructors
    /**
     * 
     */
    public FilmDTO()
    {
        
    }
 
    /**
     * @param name
     */
    public FilmDTO( String name )
    {
        super();
        _name = name;
    }



    /**
     * @param name
     * @param translatedName
     * @param rating
     * @param genre
     * @param duration
     * @param country
     * @param year
     * @param language
     * @param dirtector
     * @param cost
     */
    public FilmDTO( String name, String translatedName, RatingEnum rating,
            GenreEnum genre, int duration, String country, int year, String language,
            String dirtector, BigDecimal cost )
    {
        super();
        _name = name;
        _translatedName = translatedName;
        // TODO validation rating
        _rating = rating;
        _genre = genre;
        // validation duration
        if( duration > 0 )
            _duration = duration;
        else
            _duration = 0;
        _country = country;
        // validation year
        if( year >= 1895 && year < 9999)
            _year = year;
        else
            _year = 1895;
        _language = language;
        _dirtector = dirtector;
        // validation cost
        if ( cost.compareTo( zeroBD ) >= 0)
            _cost = cost;
        else
            _cost = zeroBD;
    }

    /**
     * @param name
     * @param rating
     * @param genre
     */
    public FilmDTO( String name, RatingEnum rating, GenreEnum genre )
    {
        super();
        _name = name;
        _rating = rating;
        _genre = genre;
    }
    
        // accessors
    public String getName()
    {
        return _name;
    }
    
    public void setName( String name )
    {
        _name = name;
    }
    
    public String getTranslatedName()
    {
        return _translatedName;
    }
    
    public void setTranslatedName( String translatedName )
    {
        _translatedName = translatedName;
    }
    
    public RatingEnum getRating()
    {
        return _rating;
    }
    
    public void setRating( RatingEnum rating )
    {
        // TODO validation
        _rating = rating;
    }
    
    public GenreEnum getGenre()
    {
        return _genre;
    }
    
    public void setGenre( GenreEnum genre )
    {
        _genre = genre;
    }
    
    public int getDuration()
    {
        return _duration;
    }
    
    public void setDuration( int duration )
    {
        // validation
        if( duration > 0 )
            _duration = duration;
        else
            _duration = 0;
    }
    
    public String getCountry()
    {
        return _country;
    }
    
    public void setCountry( String country )
    {
        _country = country;
    }
    
    public int getYear()
    {
        return _year;
    }
    
    public void setYear( int year )
    {
        // validation
        if( year >= 1895 )
            _year = year;
        else
            _year = 1895;
    }
    
    public String getIdioma()
    {
        return _language;
    }
    
    public void setIdioma( String language )
    {
        _language = language;
    }
    
    public String getDirtector()
    {
        return _dirtector;
    }
    
    public void setDirtector( String dirtector )
    {
        _dirtector = dirtector;
    }
    
    public BigDecimal getCost()
    {
        return _cost;
    }
    
    public void setCost( BigDecimal cost )
    {
        // validation cost
        if ( cost.compareTo( zeroBD ) >= 0)
            _cost = cost;
        else
            _cost = zeroBD;
    }
    
        // implemented
    public void deploy()
    {
        System.out.println( "\n***********************" );
        System.out.println( "Informaci�n de la pelicual" );
        System.out.println( "***********************" );
        System.out.println( "T�tulo: " + _name );
        System.out.println( "T�tulo traducido: " + _translatedName );
        System.out.println( "Clasificaci�n: " + _rating ); 
        System.out.println( "G�nero: " + _genre );// TODO
        System.out.println( "Duraci�n: " + _duration + " minutos" );
        System.out.println( "Pa�s: " + _country );
        System.out.println( "A�o: " + _year );
        System.out.println( "Idioma: " + _language );
        System.out.println( "Director: " + _dirtector );
        System.out.println( "Costo: $" + _cost );
        System.out.println( "***********************" );
    }
    
        // override
    @Override
    public String toString()
    {
        String str = "\n***********************"
                + "\nInformaci�n de la pelicual"
                + "\n***********************"
                + "\nT�tulo: " + _name
                + "\nT�tulo traducido: " + _translatedName
                + "\nClasificaci�n: " + _rating
                + "\nG�nero: " + _genre //TODO
                + "\nDuraci�n: " + _duration + " minutos"
                + "\nPa�s: " + _country
                + "\nA�o: " + _year
                + "\nIdioma: " + _language
                + "\nDirector: " + _dirtector
                + "\nCosto: $" + _cost
                + "\n*********************";
        return str;
    }
}
