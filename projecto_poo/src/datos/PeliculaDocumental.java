/**
 * create: 14/07/2018
 */
package datos;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * @author Erik J
 */
public class PeliculaDocumental extends Pelicula
{
    //ATRIBUTOS
        //instancia
            //general
    private String _tema;

    //METODOS
        //constructores
    
    /**
     * 
     */
    public PeliculaDocumental()
    {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param titulo
     * @param tituloTraducido
     * @param clasificacion
     * @param genero
     * @param duracion
     * @param pais
     * @param anyo
     * @param idioma
     * @param dirtector
     * @param costo
     * @param vista
     * @param fechaVista
     * @param calificacion
     * @param sinopsis
     */
    public PeliculaDocumental( String titulo, String tituloTraducido,
            char clasificacion, String genero, int duracion, String pais,
            int anyo, String idioma, String dirtector, BigDecimal costo,
            boolean vista, Calendar fechaVista, int calificacion,
            String sinopsis, String tema )
    {
        super( titulo, tituloTraducido, clasificacion, genero, duracion, pais,
                anyo, idioma, dirtector, costo, vista, fechaVista, calificacion,
                sinopsis );
        _tema = tema;
    }

    /**
     * @param titulo
     * @param clasificacion
     * @param genero
     */
    public PeliculaDocumental( String titulo, char clasificacion,
            String genero )
    {
        super( titulo, clasificacion, genero );
        // TODO Auto-generated constructor stub
    }
        
        //accesores
    public String getTema()
    {
        return _tema;
    }

    public void setTema( String tema )
    {
        _tema = tema;
    }
    
        //sobreescritura
    @Override
    public void despliega()
    {
        super.despliega();
        System.out.println( "Tema: " + _tema );
        System.out.println( "*********************" );
    }
    
    @Override
    public String toString()
    {
        String str = super.toString()
                + "\nTema: " + _tema
                + "\n*********************";
        return str;
    }
}
