/**
 * create: 04/07/2018
 */
package filmRankingSystem.film.dataFilm;

import java.math.BigDecimal;

/**
 * @author EEE
 * This class inherits from Film class
 * This class stores child's film data.
 */
public class ChildFilmDTO extends FilmDTO
{
    // attributes
        // instance attributes
    private String  _animationType;// 2D o 3D o R
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
     * @param animationType
     * @param recommendedAge
     */
    public ChildFilmDTO( String name, String translatedName, RatingEnum rating,
            GenreEnum[] genre, int duration, String country, int year,
            String language, String dirtector, BigDecimal cost,
            String animationType, int recommendedAge )
    {
        super( name, translatedName, rating, genre, duration, country, year,
                language, dirtector, cost );
        _animationType = animationType;
        // validation
        if( recommendedAge < 0 )
            _recommendedAge = 0;
        else
            _recommendedAge = recommendedAge;
    }



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
    public void deploy()
    {
        super.deploy();
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
