/**
 * create: 04/07/2018
 */
package datos;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * @author Erik J
 * Clase que hereda de la clase Pelicula
 * Almacena informacion de una pelicula infantil
 */
public class PeliculaInfantil extends Pelicula
{
    //ATRIBUTOS
        //de instancia
    private String  _tipoAnimacion;//nombre provicional. 2D o 3D o R
    private int     _edadRecomendada;
    
    //METODOS
        //constructores
    /**
     * 
     */
    public PeliculaInfantil()
    {
        super();
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
     * @param tipoAnimacion
     * @param edadRecomendada
     */
    public PeliculaInfantil( String titulo, String tituloTraducido,
            char clasificacion, String genero, int duracion, String pais,
            int anyo, String idioma, String dirtector, BigDecimal costo,
            boolean vista, Calendar fechaVista, int calificacion,
            String sinopsis,String tipoAnimacion, int edadRecomendada )
    {
        super( titulo, tituloTraducido, clasificacion, genero, duracion, pais,
                anyo, idioma, dirtector, costo, vista, fechaVista, calificacion,
                sinopsis );
        _tipoAnimacion = tipoAnimacion;
        //validación
        if( edadRecomendada < 0 )
            _edadRecomendada = 0;
        else
            _edadRecomendada = edadRecomendada;
    }

    /**
     * @param titulo
     * @param clasificacion
     * @param genero
     */
    public PeliculaInfantil( String titulo, char clasificacion, String genero )
    {
        super( titulo, clasificacion, genero );
    }
    
        //accesores
    public String getTipoAnimacion()
    {
        return _tipoAnimacion;
    }

    public void setTipoAnimacion( String tipoAnimacion )
    {
        _tipoAnimacion = tipoAnimacion;
    }

    public int getEdadRecomendada()
    {
        return _edadRecomendada;
    }

    public void setEdadRecomendada( int edadRecomendada )
    {
        //validación
        if( edadRecomendada < 0 )
            _edadRecomendada = 0;
        else
            _edadRecomendada = edadRecomendada;
    }

        //sobreescritura
    @Override
    public void despliega()
    {
        super.despliega();
        System.out.println( "Tipo de Animación: " + _tipoAnimacion );
        System.out.println( "Edad Recomendada: " + _edadRecomendada );
        System.out.println( "*********************" );
    }
    
    @Override
    public String toString()
    {
        String str = super.toString() 
                + "\nTipo de Animación: " + _tipoAnimacion
                + "\nEdad Recomendada: " + _edadRecomendada
                + "\n*********************";
        return str;
    }
}
