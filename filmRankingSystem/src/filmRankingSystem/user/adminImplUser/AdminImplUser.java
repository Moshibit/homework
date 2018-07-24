/**
 * create: 19/07/2018
 */
package filmRankingSystem.user.adminImplUser;

import java.util.LinkedList;
import java.util.List;

import filmRankingSystem.user.adminUser.AdminUser;
import filmRankingSystem.user.dataUser.UserDTO;

/**
 * @author EEE
 */
public class AdminImplUser implements AdminUser
{

    /**
     * 
     */
    public AdminImplUser(){}
    
    List<UserDTO> myStructure = new LinkedList< UserDTO >();

	@Override
	public boolean addUser(UserDTO user_a) {
		
		 if( myStructure.add(user_a))
	            System.out.println( ">> Se añadió nuevo usuario " );
	        else
	        {
	            System.out.println( ">> No se pudo añadir" );
	            return false;
	        }
	        return true;
	}

	@Override
	public void searchUser(String user_s) {
		
		 	System.out.println( "============================================"  );
	        System.out.println( ">> Resultados de busqueda por nombre: " + user_s );
	        System.out.println( "============================================"  );
	        for( UserDTO r : myStructure)
	        {
	            if ( r.getUserName() != null ) 
	            {
	                if( r.getUserName() != null && 
	                        r.getUserName().equals(user_s) )
	                {
	                    System.out.println( "índice: " + myStructure.indexOf( r ) );
	                    System.out.println( r.toString() );
	                    System.out.println( "--------------------------------------------" );    
	                }
	            }
	        }
	        System.out.println( "============================================\n" ); 
		
	}

	@Override
	public void ChageUserName(String user_c1, String user_c2) {
				
		for(UserDTO U : myStructure)
		{
			if(U.getUserName().equals(user_c1))
			{
				U.setUserName(user_c2);
				System.out.println(">>Nombre de usuario encontrado y modificado");
			}
			else
			{
				System.out.println(">>Usuario no encontrado");
			}
		}
		
	}

	@Override
	public void ChangeUserPass(String password, String passwordN) {
		
		for(UserDTO U : myStructure)
		{
			if(U.get_password().equals(password))
			{
				U.set_password(passwordN);
				System.out.println(">>Contraseña de usuario encontrada y modificada");
			}
			else
			{
				System.out.println(">>Error al actualizar contraseña");
			}
		}
		
	}

	@Override
	public void ChangeUserMail(String Mail, String MailN) {
		
		for(UserDTO U : myStructure)
		{
			if(U.get_email().equals(Mail))
			{
				U.set_email(MailN);
				System.out.println(">>Email de usuario encontrado y modificado");
			}
			else
			{
				System.out.println(">>Error al actualizar Email verifique datos");
			}
		}
		
	}

}
