/**
 * create: 19/07/2018
 */
package filmRankingSystem.util;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import filmRankingSystem.film.dataFilm.FilmDTO;

/**
 * @author EEE
 */
public class SaveDataFilm
{

    /**
     * 
     */
    public SaveDataFilm()
    {
        // TODO Auto-generated constructor stub
    }
 
    /**
     * 
     */
    public void write ( List< FilmDTO > mylista )
    {
        File archivoSoft = new File( "Films.txt" );
        
        try
        {
            ObjectOutputStream miOOS = new ObjectOutputStream(
                    new FileOutputStream( archivoSoft ) );
            
            for(int i = 0; i < mylista.size(); i++)
                miOOS.writeObject( ( FilmDTO )mylista.get( i ) );
            
            miOOS.close();
        }
        
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    /**
     * 
     */
    public List< FilmDTO > read() 
    {
        List < FilmDTO > lp = new ArrayList< FilmDTO >();
        File miArchivo = new File("Films.txt");    
        
        try
        {             
            ObjectInputStream miOIS = 
                    new ObjectInputStream( new FileInputStream( miArchivo ) );
            FilmDTO c1 = new FilmDTO();
            c1 = ( FilmDTO )miOIS.readObject();
            
            while (c1 != null)
            {
                lp.add( ( FilmDTO )c1 );
                c1 =( FilmDTO )miOIS.readObject();
            }
            
            miOIS.close();
        }
        
        catch ( EOFException e1 )
        {
            System.out.print ("*"); 
        }
        
        catch ( Exception e2 )
        {
            e2.printStackTrace();
        }
        
        return lp;
    }
    
    /**
     * 
     */
    public void  readAll() 
    {
        try
        {
            ObjectInputStream miOIS = 
                    new ObjectInputStream( new FileInputStream
                    ("Films.txt"));
            FilmDTO c1 = new FilmDTO();
            c1 = ( FilmDTO )miOIS.readObject();
          
            while ( c1 != null )
            {    
                c1 = ( FilmDTO )miOIS.readObject();
                c1.deploy();
            }
            miOIS.close();
        }
        
        catch ( EOFException e1 )
        {
            System.out.println ( "*=End of fileo=*" );
        }
        
        catch ( Exception e2 )
        {
            e2.printStackTrace();
        }
    }
}

