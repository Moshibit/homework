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
    private String _userName;
    private String _email;
    private String _password;

	// methods
        // constructors
    /**
     * 
     */
    public UserDTO(){}
    
    /**
     * @param userName
     */
    
    public UserDTO(String _name, String _surname1, String _surname2,
			String _userName, String _email, String _password) 
    {
		super();
		this._name = _name;
		this._surname1 = _surname1;
		this._surname2 = _surname2;
		this._userName = _userName;
		this._email = _email;
		this._password = _password;
	}
    
    public UserDTO( String userName )
    {
        super();
        _userName = userName;
    }

    /**
     * @param name
     * @param surname1
     * @param surname2
     */
    
    
    
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
    
    public String getUserName()
    {
        return _userName;
    }

    public void setUserName( String userName )
    {
        _userName = userName;
    }
    public String get_email() {
		return _email;
	}

	public void set_email(String _email) {
		this._email = _email;
	}

	public String get_password() {
		return _password;
	}

	public void set_password(String _password) {
		this._password = _password;
	}

    // implemented
    public void deploy()
    {
        System.out.println( "" );
    }
    
        // override
    public void despliegaDatos()
    {
    	System.out.println("*************************************");
    	System.out.println("Datos de Usuario");
    	System.out.println("Name: "+_name + _surname1 + _surname2);
    	System.out.println("Nick Name: "+_userName);
    	System.out.println("Email: "+_email);
    	System.out.println("Password: "+_password);
    	System.out.println("**************************************");
    }
}
