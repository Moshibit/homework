/**
 * create: 19/07/2018
 */
package filmRankingSystem.user.dataUser;

/**
 * @author EEE
 */
public class UserDTO
{
     // attributes
        // instance attributes
    private String _name;
    private String _surname1;
    private String _surname2;

    // methods
        // constructors
    /**
     * 
     */
    public UserDTO()
    {
        // TODO Auto-generated constructor stub
    }
    
    /**
     * @param name
     * @param surname1
     * @param surname2
     */
    public UserDTO( String name, String surname1, String surname2 )
    {
        super();
        _name = name;
        _surname1 = surname1;
        _surname2 = surname2;
    }

        // accessors
    public String getName()
    {
        return _name;
    }

    public void setName( String name )
    {
        _name = name;
    }

    public String getSurname1()
    {
        return _surname1;
    }

    public void setSurname1( String surname1 )
    {
        _surname1 = surname1;
    }

    public String getSurname2()
    {
        return _surname2;
    }

    public void setSurname2( String surname2 )
    {
        _surname2 = surname2;
    }
        
        // implemented
    public void deploy()
    {
        System.out.println( "" );

    }
    
        // override
    @Override
    public String toString()
    {
        String str = "";
        return str;
    }
}