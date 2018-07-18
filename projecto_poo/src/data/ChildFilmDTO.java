/**
 * create: 04/07/2018
 */
package data;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * @author Erik J
 * This class inherits from Film class
 * This class stores child's film data.
 */
public class ChildFilmDTO extends FilmDTO
{
    // attributes
        // instance attributes
    private String  _animationType;//nombre provicional. 2D o 3D o R
    private int     _recommendedAge;
    
    // methods
        // constructors
    /**
     * 
     */
    public ChildFilmDTO()
    {
        super();
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
     * @param watched
     * @param dateWatched
     * @param score
     * @param synopsis
     * @param animationType
     * @param recommendedAge
     */
    public ChildFilmDTO( String name, String translatedName,
            char rating, String genre, int duration, String country,
            int year, String language, String dirtector, BigDecimal cost,
            boolean watched, Calendar dateWatched, int score,
            String synopsis,String animationType, int recommendedAge )
    {
        super( name, translatedName, rating, genre, duration, country,
                year, language, dirtector, cost, watched, dateWatched, score,
                synopsis );
        _animationType = animationType;
        // validation
        if( recommendedAge < 0 )
            _recommendedAge = 0;
        else
            _recommendedAge = recommendedAge;
    }

    /**
     * @param name
     * @param rating
     * @param genre
     */
    public ChildFilmDTO( String name, char rating, String genre )
    {
        super( name, rating, genre );
    }
   
        // display
    public String getAnimationType()
    {
        return _animationType;
    }

    public void setAnimationType( String animationType )
    {
        _animationType = animationType;
    }

    public int getRecommendedAge()
    {
        return _recommendedAge;
    }

    public void setRecommendedAge( int recommendedAge )
    {
        // validation
        if( recommendedAge < 0 )
            _recommendedAge = 0;
        else
            _recommendedAge = recommendedAge;
    }

        // override
    @Override
    public void display()
    {
        super.display();
        System.out.println( "Tipo de Animación: " + _animationType );
        System.out.println( "Edad Recomendada: " + _recommendedAge );
        System.out.println( "*********************" );
    }
    
    @Override
    public String toString()
    {
        String str = super.toString() 
                + "\nTipo de Animación: " + _animationType
                + "\nEdad Recomendada: " + _recommendedAge
                + "\n*********************";
        return str;
    }
}
