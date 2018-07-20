/**
 * create: 20/07/2018
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

import filmRankingSystem.ranking.dataRanking.RankingDTO;

/**
 * @author EEE
 */
public class SaveDataRanking
{

    /**
     * 
     */
    public SaveDataRanking()
    {
        // TODO Auto-generated constructor stub
    }

    /**
     * 
     */
    public void write ( List< RankingDTO > mylista )
    {
        File archivoSoft = new File( "Rankings.txt" );
        
        try
        {
            ObjectOutputStream miOOS = new ObjectOutputStream(
                    new FileOutputStream( archivoSoft ) );
            
            for(int i = 0; i < mylista.size(); i++)
                miOOS.writeObject( ( RankingDTO )mylista.get( i ) );
            
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
    public List< RankingDTO > read() 
    {
        List < RankingDTO > lp = new ArrayList< RankingDTO >();
        File miArchivo = new File("Rankings.txt");    
        
        try
        {             
            ObjectInputStream miOIS = 
                    new ObjectInputStream( new FileInputStream( miArchivo ) );
            RankingDTO c1 = new RankingDTO();
            c1 = ( RankingDTO )miOIS.readObject();
            
            while (c1 != null)
            {
                lp.add( ( RankingDTO )c1 );
                c1 =( RankingDTO )miOIS.readObject();
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
                    ("Rankings.txt"));
            RankingDTO c1 = new RankingDTO();
            c1 = ( RankingDTO )miOIS.readObject();
          
            while ( c1 != null )
            {    
                c1 = ( RankingDTO )miOIS.readObject();
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
