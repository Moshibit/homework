/**
 * create: 04/07/2018
 */
package data;

import java.math.BigDecimal;

/**
 * @author Erik J
 * This class stores film data.
 */
public class FilmDTO
{
    // attributes
        // instance attributes
            // general
    private String     _name;
    private String     _translatedName;
    private char       _rating;// A, B, C, D simplified Mexico's rating system
    private String     _genre;// list maximum 3
    private int        _duration;// minutes
    private String     _country; 
    private int        _year;
    private String     _language; 
    private String     _dirtector; 
    private BigDecimal _cost;
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
    public FilmDTO( String name, String translatedName, char rating,
            String genre, int duration, String country, int year, String language,
            String dirtector, BigDecimal cost )
    {
        super();
        _name = name;
        _translatedName = translatedName;
        // validation rating
        if( rating == 'A' )
            _rating = rating;
        else if( rating == 'B' )
            _rating = rating;
        else if(rating == 'C' )
            _rating = rating;
        else
            _rating = '\u0000';
        _genre = genre;
        // validation duration
        if( duration > 0 )
            _duration = duration;
        else
            _duration = 0;
        _country = country;
        // validation year
        if( year >= 1895 )
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
    public FilmDTO( String name, char rating, String genre )
    {
        super();
        _name = name;
        _rating = rating;
        _genre = genre;
    }
    
        // accessors
    public String getTitulo()
    {
        return _name;
    }
    
    public void setTitulo( String name )
    {
        _name = name;
    }
    
    public String gettranslatedName()
    {
        return _translatedName;
    }
    
    public void settranslatedName( String translatedName )
    {
        _translatedName = translatedName;
    }
    
    public char getRating()
    {
        return _rating;
    }
    
    public void setRating( char rating )
    {
        // validation
        if( rating == 'A' )
            _rating = rating;
        else if( rating == 'B' )
            _rating = rating;
        else if(rating == 'C' )
            _rating = rating;
        else
            _rating = '\u0000';
    }
    
    public String getGenre()
    {
        return _genre;
    }
    
    public void setGenre( String genre )
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
        System.out.println( "\n****** Datos ******" );
        System.out.println( "Titulo: " + _name );
        System.out.println( "Titulo traducido: " + _translatedName );
        System.out.println( "Clasificacion: " + _rating ); 
        System.out.println( "Genero: " + _genre );
        System.out.println( "Duración: " + _duration + " minutos" );
        System.out.println( "País: " + _country );
        System.out.println( "Año: " + _year );
        System.out.println( "Idioma: " + _language );
        System.out.println( "Director: " + _dirtector );
        System.out.println( "Costo: $" + _cost );
        System.out.println( "*********************" );
    }
    
        // override
    @Override
    public String toString()
    {
        String str = "\n****** Datos ******"
                + "\nTitulo: " + _name
                + "\nTitulo traducido: " + _translatedName
                + "\nClasificacion: " + _rating
                + "\nGenero: " + _genre
                + "\nDuración: " + _duration + " minutos"
                + "\nPaís: " + _country
                + "\nAño: " + _year
                + "\nIdioma: " + _language
                + "\nDirector: " + _dirtector
                + "\nCosto: $" + _cost
                + "\n*********************";
        return str;
    }
}
