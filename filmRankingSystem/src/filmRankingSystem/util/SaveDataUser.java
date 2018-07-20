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

import filmRankingSystem.user.dataUser.UserDTO;

/**
 * @author EEE
 */
public class SaveDataUser
{

    /**
     * 
     */
    public SaveDataUser()
    {
        // TODO Auto-generated constructor stub
    }

    /**
     * 
     */
    public void write ( List< UserDTO > mylista )
    {
        File archivoSoft = new File( "Users.txt" );
        
        try
        {
            ObjectOutputStream miOOS = new ObjectOutputStream(
                    new FileOutputStream( archivoSoft ) );
            
            for(int i = 0; i < mylista.size(); i++)
                miOOS.writeObject( ( UserDTO )mylista.get( i ) );
            
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
    public List< UserDTO > read() 
    {
        List < UserDTO > lp = new ArrayList< UserDTO >();
        File miArchivo = new File("Users.txt");    
        
        try
        {             
            ObjectInputStream miOIS = 
                    new ObjectInputStream( new FileInputStream( miArchivo ) );
            UserDTO c1 = new UserDTO();
            c1 = ( UserDTO )miOIS.readObject();
            
            while (c1 != null)
            {
                lp.add( ( UserDTO )c1 );
                c1 =( UserDTO )miOIS.readObject();
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
                    ("Users.txt"));
            UserDTO c1 = new UserDTO();
            c1 = ( UserDTO )miOIS.readObject();
          
            while ( c1 != null )
            {    
                c1 = ( UserDTO )miOIS.readObject();
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
