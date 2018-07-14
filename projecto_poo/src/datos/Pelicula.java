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
 * Clase que almacena datos de una pelicula
 */
public class Pelicula
{
    //ATRIBUTOS
        //instancia
            //general
    private String     _titulo;
    private String     _tituloTraducido;
    private char       _clasificacion;//A, B, C
    private String     _genero;//list maximo 3
    private int        _duracion;//en minutos
    private String     _pais; //origen
    private int        _anyo; //estreno
    private String     _idioma; //nativo
    private String     _dirtector; //nombre
    private BigDecimal _costo;
            //usuario
    private boolean    _vista;//true=si, false=no
    private Calendar   _fechaVista;   
    private int        _calificacion;//5 maximo   
    private String     _sinopsis;//list<String>??
        //de clase
    SimpleDateFormat sDF = new SimpleDateFormat( "dd 'de' MMMM 'del' yyyy." );
    
    //METODOS
        //constructores
    /**
     * 
     */
    public Pelicula()
    {
        
    }

    /**
     * @param titulo
     * @param tituloTraducido
     * @param clasificacion
     * @param genero
     * @param duración
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
    public Pelicula( String titulo, String tituloTraducido, char clasificacion,
            String genero, int duracion, String pais, int anyo, String idioma,
            String dirtector, BigDecimal costo, boolean vista,
            Calendar fechaVista, int calificacion, String sinopsis )
    {
        super();
        BigDecimal ceroBD = new BigDecimal("0.00");
        Calendar hoy = Calendar.getInstance();
        
        _titulo = titulo;
        _tituloTraducido = tituloTraducido;
        //validacion clasificacion
        if( clasificacion == 'A' )
            _clasificacion = clasificacion;
        else if( clasificacion == 'B' )
            _clasificacion = clasificacion;
        else if(clasificacion == 'C' )
            _clasificacion = clasificacion;
        else
            _clasificacion = '\u0000';;
        _genero = genero;
        //validacion duracion
        if( duracion > 0 )
            _duracion = duracion;
        else
            _duracion = 0;
        _pais = pais;
        //validacion anyo
        if( anyo >= 1895 )
            _anyo = anyo;
        else
            _anyo = 1895;
        _idioma = idioma;
        _dirtector = dirtector;
        // validacion costo
        if ( costo.compareTo( ceroBD ) >= 0)
            _costo = costo;
        else
            _costo = ceroBD;
        _vista = vista;
        // validacion fechaVista
        if( fechaVista.after( hoy ) ) 
            _fechaVista = fechaVista;
        else 
            _fechaVista = hoy;
        //Validacion de calificacion
        if (calificacion > 0 && calificacion < 6)
            _calificacion = calificacion;
        else 
            _calificacion = 0;
        _sinopsis = sinopsis;
    }

    /**
     * @param titulo
     * @param clasificacion
     * @param genero
     */
    public Pelicula( String titulo, char clasificacion, String genero )
    {
        super();
        _titulo = titulo;
        _clasificacion = clasificacion;
        _genero = genero;
    }
    
        //accesores
    public String getTitulo()
    {
        return _titulo;
    }
    
    public void setTitulo( String titulo )
    {
        _titulo = titulo;
    }
    
    public String getTituloTraducido()
    {
        return _tituloTraducido;
    }
    
    public void setTituloTraducido( String tituloTraducido )
    {
        _tituloTraducido = tituloTraducido;
    }
    
    public char getClasificacion()
    {
        return _clasificacion;
    }
    
    public void setClasificacion( char clasificacion )
    {
        //validacion
        if( clasificacion == 'A' )
            _clasificacion = clasificacion;
        else if( clasificacion == 'B' )
            _clasificacion = clasificacion;
        else if(clasificacion == 'C' )
            _clasificacion = clasificacion;
        else
            _clasificacion = '\u0000';
    }
    
    public String getGenero()
    {
        return _genero;
    }
    
    public void setGenero( String genero )
    {
        _genero = genero;
    }
    
    public int getDuracion()
    {
        return _duracion;
    }
    
    public void setDuración( int duracion )
    {
        //validacion
        if( duracion > 0 )
            _duracion = duracion;
        else
            _duracion = 0;
    }
    
    public String getPais()
    {
        return _pais;
    }
    
    public void setPais( String pais )
    {
        _pais = pais;
    }
    
    public int getAnyo()
    {
        return _anyo;
    }
    
    public void setAnyo( int anyo )
    {
        //validacion
        if( anyo >= 1895 )
            _anyo = anyo;
        else
            _anyo = 1895;
    }
    
    public String getIdioma()
    {
        return _idioma;
    }
    
    public void setIdioma( String idioma )
    {
        _idioma = idioma;
    }
    
    public String getDirtector()
    {
        return _dirtector;
    }
    
    public void setDirtector( String dirtector )
    {
        _dirtector = dirtector;
    }
    
    public BigDecimal getCosto()
    {
        return _costo;
    }
    
    public void setCosto( BigDecimal costo )
    {
        // validacion costo
        BigDecimal ceroBD = new BigDecimal("0.00");
        if ( costo.compareTo( ceroBD ) >= 0)
            _costo = costo;
        else
            _costo = ceroBD;
    }
    
    public boolean isVista()
    {
        return _vista;
    }
    
    public void setVista( boolean vista )
    {
        _vista = vista;
    }
    
    public Calendar getFechaVista()
    {
        return _fechaVista;
    }
    
    public void setFechaVista( Calendar fechaVista )
    {
        // validacion fechaVista
        Calendar hoy = Calendar.getInstance();
        
        if( fechaVista.after( hoy ) ) 
            _fechaVista = fechaVista;
        else 
            _fechaVista = hoy;
    }
    
    public int getCalificacion()
    {
        return _calificacion;
    }
    
    public void setCalificacion( int calificacion )
    {
        //Validacion
        if (calificacion > 0 && calificacion < 6)
            _calificacion = calificacion;
        else 
            _calificacion = 0;
    }
    
    public String getSinopsis()
    {
        return _sinopsis;
    }
    
    public void setSinopsis( String sinopsis )
    {
        _sinopsis = sinopsis;
    }

        //implementados
    public void despliega()
    {
        // TODO requiere una excepcion: si _fechaVista es 'null' 
        Date fS = new Date();
        String sC = new String();
        
        if( _fechaVista != null ) 
        {
            fS = _fechaVista.getTime();
            sC = sDF.format( fS );
        } 
        
        System.out.println( "\n****** Datos ******" );
        System.out.println( "Titulo: " + _titulo );
        System.out.println( "Titulo traducido: " + _tituloTraducido );
        System.out.println( "Clasificacion: " + _clasificacion ); 
        System.out.println( "Genero: " + _genero );
        System.out.println( "Duración: " + _duracion + " minutos" );
        System.out.println( "Sinopsis: " + _sinopsis );
        System.out.println( "Pais: " + _pais );
        System.out.println( "Anyo: " + _anyo );
        System.out.println( "Idioma: " + _idioma );
        System.out.println( "Director: " + _dirtector );
        System.out.println( "Costo: $" + _costo );
        System.out.println( "Vista: " + _vista );
        System.out.println( "Fecha en que se vio: " + sC );
        System.out.println( "Calificacion: " + _calificacion );
        System.out.println( "*********************" );
    }
    
        //sobreescritoria
    @Override
    public String toString()
    {
        // TODO requiere una excepcion: si _fechaVista es 'null'
        Date fS = new Date();
        String sC = new String();
        
        if( _fechaVista != null ) 
        {
            fS = _fechaVista.getTime();
            sC = sDF.format( fS );
        } 
        
        String str = "\n****** Datos ******"
                + "\nTitulo: " + _titulo
                + "\nTitulo traducido: " + _tituloTraducido
                + "\nClasificacion: " + _clasificacion
                + "\nGenero: " + _genero
                + "\nDuración: " + _duracion + " minutos"
                + "\nSinopsis: " + _sinopsis
                + "\nPais: " + _pais
                + "\nAnyo: " + _anyo
                + "\nIdioma: " + _idioma
                + "\nDirector: " + _dirtector
                + "\nCosto: $" + _costo
                + "\nVista: " + _vista
                + "\nFecha en que se vio: " + sC
                + "\nCalificacion: " + _calificacion
                + "\n*********************";
        return str;
    }
    
        //Aun sin implementar
    /*
    public void recomendar(String usuario)
    {
    
    }
    
    public void agregarAMiLista()
    {
    
    }
    
    public String agregarSinopsis()
    {
    
    }
    */
    
}
