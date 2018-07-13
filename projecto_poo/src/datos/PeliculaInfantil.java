/**
 * create: 04/07/2018
 */
package datos;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Erik J
 * Clase que hereda de la clase Pelicula
 * Almacena informacion de una pelicula infantil
 */
public class PeliculaInfantil extends Pelicula
{
    //ATRIBUTOS
    private String  _tipoAnimacion;//nombre provicional. 2D o 3D o R
    private int     _edadRecomendada;
    
    //METODOS
        //ACCESORES
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

        //CONSTRUCTORES
    /**
     * 
     */
    public PeliculaInfantil()
    {
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
        //IMPLEMENTADOS
    @Override
    public void despliega()
    {
        // TODO requiere una excepcion: si _fechaVista es 'null' 
        Date d = getFechaVista().getTime();
        SimpleDateFormat sF = new 
                SimpleDateFormat( "dd 'de' MMMM 'del' yyyy." );
        String s = sF.format( d );
        
        System.out.println( "\n****** Datos ******");
        System.out.println( "Titulo: " + getTitulo() );
        System.out.println( "Titulo traducido: " + getTituloTraducido() );
        System.out.println( "Clasificacion: " + getClasificacion() );
        System.out.println( "Genero: " + getGenero() );
        System.out.println( "Duración: " + getDuracion() + " minutos" );
        System.out.println( "Sinopsis: " + getSinopsis() );
        System.out.println( "Pais: " + getPais() );
        System.out.println( "Anyo: " + getAnyo() );
        System.out.println( "Idioma: " + getIdioma() );
        System.out.println( "Director: " + getDirtector() );
        System.out.println( "Costo: $" + getCosto() );
        System.out.println( "Vista: " + isVista() );
        System.out.println( "Fecha en que se vio: " + s );
        System.out.println( "Calificacion: " + getCalificacion() );
        System.out.println( "Tipo de Animación: " + _tipoAnimacion );
        System.out.println( "Edad Recomendada: " + _edadRecomendada );
    }
}
