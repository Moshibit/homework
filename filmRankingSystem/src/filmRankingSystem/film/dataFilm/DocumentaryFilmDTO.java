/**
 * create: 14/07/2018
 */
package filmRankingSystem.film.dataFilm;

import java.math.BigDecimal;

/**
 * @author EEE
 */
public class DocumentaryFilmDTO extends FilmDTO
{
    // attributes
        // instance attributes
    private String _theme;

    // methods
        // constructors
    /**
     * 
     */
    public DocumentaryFilmDTO()
    {
        // TODO Auto-generated constructor stub
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
     * @param theme
     */
    public DocumentaryFilmDTO( String name, String translatedName,
            RatingEnum rating, GenreEnum[] genre, int duration, String country,
            int year, String language, String dirtector, BigDecimal cost,
            String theme )
    {
        super( name, translatedName, rating, genre, duration, country, year,
                language, dirtector, cost );
        _theme = theme;
    }

        // accessors
    public String getTheme()
    {
        return _theme;
    }

    public void setTheme( String theme )
    {
        _theme = theme;
    }
    
        // override
    @Override
    public void deploy()
    {
        super.deploy();
        System.out.println( "Theme: " + _theme );
        System.out.println( "*********************" );
    }
    
    @Override
    public String toString()
    {
        String str = super.toString()
                + "\nTheme: " + _theme
                + "\n*********************";
        return str;
    }
}
